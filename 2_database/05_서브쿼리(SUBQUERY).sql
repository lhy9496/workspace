/*
    *�������� (SUBQUERY)
    -�ϳ��� SQL�� �ȿ� ���Ե� �Ǵٸ� SELECT��
    -���� SQL���� ���� ���� ������ �ϴ� ����
*/

--�������� ���� 1
--���ö ����� ���� �μ��� ���� ����� ��ȸ

--1)���ö ����� �μ��ڵ�
SELECT DEPT_CODE
FROM EMPLOYEE
WHERE EMP_NAME = '���ö';

--2) �μ��ڵ尡 D9�� ����� ��ȸ
SELECT EMP_NAME
FROM EMPLOYEE
WHERE DEPT_CODE = 'D9';

--3) �ϳ��� ���������� ����
SELECT EMP_NAME
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '���ö');


--�������� ���� 2
--�� ������ ��� �޿����� �� ���� �޿��� �޴� ������� ���, �̸�, �����ڵ�, �޿� ��ȸ
--1) �������� ��� �޿� 
SELECT ROUND(AVG(SALARY))
FROM EMPLOYEE; --3047633

--2) ��� �޿����� ���� �޴� ������� ���, �̸�, �����ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3047633;

--3) �� ������ ����
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= (SELECT ROUND(AVG(SALARY))
                 FROM EMPLOYEE);

/*
    *���������� ����
    ���������� ������ ������� ���� ��� �����Ŀ� ���� �з�
    
    --������ �������� : ���� ������ ��ȸ ������� ������ ������ 1��
    --������ �������� : ���� ������ ��ȸ ������� ���� ���� ��(�� ����, �÷� �ϳ�)
    --���߿� �������� : ���� ������ ��ȸ ������� �� �������� �÷��� ���� ��
    --������ ���߿� �������� : ���� ������ ��ȸ ������� ���� ��, ���� �÷��� ��
    
    >>���������� ������ ���� �������� �տ� �ٴ� �����ڰ� �޶���
/*
    1. ������ ��������
    ���������� ��ȸ ������� �� �ϳ��� ��
    �Ϲ� �񱳿����� ��� ����
    =, !=, >=, <= ...
*/

--1) �� ������ ��� �޿����� �� ���� �޴� �������� �����, ���� �ڵ�, �޿� ��ȸ
SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY < (SELECT ROUND(AVG(SALARY)) FROM EMPLOYEE);

--2)�����޿��� �޴� ����� ���, �̸�, �޿�, �Ի��� ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);

--3)���ö ����� �޿����� ���̹޴� ������� ���, �̸�, �μ��ڵ�, �޿���ȸ
SELECT EMP_ID, EMP_NAME,DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '���ö');

--4)���ö ����� �޿����� ���̹޴� ������� ���, �̸�, �μ���, �޿���ȸ
--����Ŭ����
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID AND
    SALARY > (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '���ö');

--ANSI����
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
WHERE SALARY > (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '���ö');

--5)�μ��� �޿����� ���� ū �μ��� �μ��ڵ� �޿���
--5_1) �μ��� �޿����߿��� ���� ū �� �ϳ��� ��ȸ
SELECT MAX(SUM(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE; --17700000

--5_2) �μ��� �޿����� 17700000�� �μ��� �μ��ڵ�, �޿��� ��ȸ

SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE; --D9

--5_3) ����
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = (SELECT MAX(SUM(SALARY))
                        FROM EMPLOYEE
                        GROUP BY DEPT_CODE);

--6)'������'����� ���� �μ��� ������� ���, �����, ��ȭ��ȣ, �Ի���, �μ����� ��ȸ
--��, ����������� ����
--����Ŭ
SELECT EMP_ID, EMP_NAME, PHONE, HIRE_DATE, DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID
AND DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME = '������')
AND EMP_NAME != '������';

--ANSI
SELECT EMP_ID, EMP_NAME, PHONE, HIRE_DATE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON (DEPT_ID = DEPT_CODE)
WHERE DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME = '������')
AND EMP_NAME != '������';

--------------------------------------------------------------------------------

/*
    2. ������ ��������
    ������� �������� ��(�÷��� �ϳ�)
    
    IN (��������) : �ϳ��� ��ġ�ϴ� ������� ������ ��ȸ
    < �Ǵ� > ANY (��������) : ������� �ϳ��� �� ��󺸴� ũ�ų� ���� ��쿡 ��ȸ
        �񱳴�� > ANY (���������� ����� => ��1, ��2, ��3...)
        �񱳴�� > ��1 OR �񱳴�� > ��2 OR �񱳴�� > ��3
    < �Ǵ� > ALL (��������) : ��� ������� �� ��󺸴� ũ�ų� ���� ��쿡 ��ȸ
        �񱳴�� > ALL (���������� ����� => ��1, ��2, ��3...)
        �񱳴�� > ��1 AND �񱳴�� > ��2 AND �񱳴�� > ��3...
*/

--1) ����� �Ǵ� �����ػ���� ���� ������ ������� ���, �����, �����ڵ�, �޿� ��ȸ
--1_1) ����� �Ǵ� �����ػ���� �����ڵ�
SELECT JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME IN ('�����', '������'); --J3, J7

--1_2) ������ J3, J7�� ����� ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN ('J3','J7');

--1_3) ����
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN (SELECT JOB_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME IN ('�����', '������'));
                    
--2) �븮 �����ӿ��� ���� ���� �޿��� �� �ּ� �޿����� ���� �޴� ����� ��ȸ
--(���, �̸�, ����, �޿�)
--2_1) ���� ���� �޿�
SELECT SALARY
FROM EMPLOYEE
JOIN JOB USING (JOB_CODE)
WHERE JOB_NAME = '����'; -- 3760000, 2200000, 2500000

--2_2) �븮�����̸鼭 ���� �ּҰ����� �޿��� �� ū ���
SELECT SALARY
FROM EMPLOYEE
JOIN JOB USING (JOB_CODE)
WHERE SALARY >= ANY(3760000, 2200000, 2500000)
AND JOB_NAME = '�븮';

--2_3)����
SELECT SALARY
FROM EMPLOYEE
JOIN JOB USING (JOB_CODE)
WHERE SALARY >= ANY(SELECT SALARY
                    FROM EMPLOYEE
                    JOIN JOB USING (JOB_CODE)
                    WHERE JOB_NAME = '����')
AND JOB_NAME = '�븮';
--------------------------------------------------------------------------------
/*
    3. ���߿� ��������
    ������� ���� �ϳ��ε� �÷��� ���� ���� ���� ���
*/

--1) ������ ����� ���� �μ��ڵ�, ���� �����ڵ忡 �ش��ϴ� ����� ��ȸ
 --(�����, �μ��ڵ�, �����ڵ�, �Ի���)
 --> ������ ��������
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE  DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME = '������')
    AND JOB_CODE = (SELECT JOB_CODE FROM EMPLOYEE WHERE EMP_NAME = '������');

--> ���߿� ���������� �ۼ�
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE) = (SELECT DEPT_CODE, JOB_CODE FROM EMPLOYEE
                                WHERE EMP_NAME = '������');

--�ڳ��� ����� ���� �����ڵ�, ���� ����� �������ִ� ������� ���, �����, �����ڵ�, �����ȣ ��ȸ

SELECT EMP_ID, EMP_NAME, JOB_CODE, MANAGER_ID
FROM EMPLOYEE
WHERE (JOB_CODE, MANAGER_ID) = (SELECT JOB_CODE, MANAGER_ID FROM EMPLOYEE
                                WHERE EMP_NAME = '�ڳ���')
AND EMP_NAME != '�ڳ���';

--------------------------------------------------------------------------------
/*
    4. ������ ���߿� ��������
    ���������� ��ȸ ������� ���� �࿡ ���� ���� ���� ���
*/

--1) �� ���޺� �ּұ޿��� �޴� �����ȸ(���, �����, �����ڵ�, �޿�)
--> �� ���޺� �ּұ޿�
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

-->�� ���޺� �ּұ޿��� �޴� ��� ��ȸ(���, �����, �����ڵ�, �޿�)
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE = 'J2' AND SALARY = 3700000
   OR JOB_CODE = 'J7' AND SALARY = 1380000
   OR JOB_CODE = 'J3' AND SALARY = 3400000;
   --...
   
--�������� ����
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MIN(SALARY)
                            FROM EMPLOYEE
                            GROUP BY JOB_CODE);

--�� �μ��� �ְ�޿��� �޴� ������� ���, �����, �μ��ڵ�, �޿�
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MAX(SALARY)
                            FROM EMPLOYEE
                            GROUP BY JOB_CODE);

--------------------------------------------------------------------------------
/*
    5. �ζ��� ��
    FROM���� ���������� �ۼ��� ��
    ���������� ������ ����� ��ġ ���̺�ó�� ���
*/

--������� ���, �̸�, ���ʽ����Կ���, �μ��ڵ� ��ȸ
--��, ���ʽ����� ������ NULL�̵Ǹ� �ȵȴ�.
--��, ���ʽ����� ������ 3000���� �̻��� ����鸸 ��ȸ
SELECT EMP_ID, EMP_NAME, (SALARY + (SALARY + NVL(BONUS, 0))) * 12 AS "����", DEPT_CODE
FROM EMPLOYEE
WHERE (SALARY + (SALARY * NVL(BONUS, 0))) * 12 >= 30000000
ORDER BY ����;

--> �ζ��κ並 �ַ� ����ϴ� �� >> TOP-N�м� : ���� ��� ��ȸ
-- �� ������ �޿��� ���� ���� 5�� ��ȸ
-- ROWNUM : ����Ŭ���� �������ִ� �÷�, ��ȸ�� ������� 1���� ������ �ο����ִ� �÷�
SELECT EMP_NAME, SALARY, ROWNUM
FROM EMPLOYEE
WHERE ROWNUM <= 5
ORDER BY SALARY DESC;

--> ORDER BY���� ����� ����� ������ ROWNUM�ο� -> ���� 5�� ��ȸ
SELECT EMP_NAME, SALARY, ROWNUM
FROM (SELECT EMP_NAME, SALARY
        FROM EMPLOYEE
        ORDER BY SALARY DESC)
WHERE ROWNUM <= 5;

--���� �ֱٿ� �Ի��� ��� 5�� ��ȸ(�����, �޿�, �Ի���)
SELECT EMP_NAME, SALARY, HIRE_DATE, ROWNUM
FROM (SELECT *
        FROM EMPLOYEE
        ORDER BY HIRE_DATE DESC)
WHERE ROWNUM <= 5;

--�� �μ��� ��ձ޿��� ���� 3���� �μ� ��ȸ
--�μ��ڵ�, ��ձ޿�
SELECT DEPT_CODE, ��ձ޿�, ROWNUM
FROM (SELECT DEPT_CODE, ROUND(AVG(SALARY)) AS "��ձ޿�"
        FROM EMPLOYEE GROUP BY DEPT_CODE ORDER BY "��ձ޿�" DESC)
WHERE ROWNUM <= 3;

--�μ��� ��ձ޿��� 270������ �ʰ��ϴ� �μ��鿡 ���ؼ�
--(�μ��ڵ�, �μ��� �� �޿���, �μ��� ��ձ޿�, �μ��� �����) ��ȸ
SELECT DEPT_CODE, SUM(SALARY) AS "����", ROUND(AVG(SALARY)) AS "���", COUNT(*) "�ο� ��"
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING ROUND(AVG(SALARY)) > 2700000;

SELECT *
FROM (SELECT DEPT_CODE, SUM(SALARY) AS "����", ROUND(AVG(SALARY)) AS "���", COUNT(*) "�ο� ��"
        FROM EMPLOYEE
        GROUP BY DEPT_CODE)
WHERE ��� > 2700000;

--------------------------------------------------------------------------------
/*
    *������ �ű�� �Լ�(WINDOW FUNCTION)
    RANK() OVER(���ı���) | DANSE_RANK() OVER(���ı���)
    RANK() OVER(���ı���) : ������ ���� ������ ����� ������ �ο� ����ŭ �ǳʶٰ� ��������
    DENSE_RANK() OVER(���ı���) : ������ ������ �־ �� ���� ����� ������ 1�� �������Ѽ� ��������
    
    ������ SELECT�������� ��밡��
*/

--�޿��� ���� ������� ������ �Űܼ� ��ȸ

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) AS "����"
FROM EMPLOYEE;
--���� 19���� 2���̰� �� ���� ����� 21������ �ϳ� �ǳʶپ ������ ����

SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC) AS "����"
FROM EMPLOYEE;
--���� 19���� 2�������� �� ���� ����� 20��

SELECT *
FROM (SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC) AS "����"
        FROM EMPLOYEE)
WHERE ���� <= 5;