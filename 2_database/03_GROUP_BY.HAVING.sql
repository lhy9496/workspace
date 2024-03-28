/*
    <GROUP BY��>
    �׷������ ������ �� �ִ� ����(�ش� �׷���غ��� ���� �׷����� ���� �� ����)
    �������� ������ �ϳ��� �׷����� ��� ó���ϴ� �������� ���
*/

SELECT SUM(SALARY)
FROM EMPLOYEE; -- ��ü ����� �ϳ��� �׷����� ��� �� ���� ���� ���

--�� �μ��� �� �޿�
--�� �μ����� ���� �׷�
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--�� �μ��� �����
SELECT DEPT_CODE, COUNT(*), SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

SELECT DEPT_CODE, COUNT(*), SUM(SALARY) -- 3����
FROM EMPLOYEE -- 1����
GROUP BY DEPT_CODE -- 2����
ORDER BY DEPT_CODE; -- 4����

--�� ���޺� �� �����, ���ʽ��� �޴� ��� ��, �޿� ��, ��� �޿�, �����޿�, �ְ�޿�(�������� ����)
SELECT JOB_CODE, COUNT(*) AS "��� ��", COUNT(BONUS) AS "���ʽ��� �޴� ��� ��"
    , SUM(SALARY) AS "�޿� ��", AVG(SALARY) AS "��� �޿�", MIN(SALARY) "�����޿�"
    , MAX(SALARY) "�ְ�޿�"
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY JOB_CODE;

--GROUP BY ���� �Լ��� ��� ����
SELECT DECODE(SUBSTR(EMP_NO, 8, 1), '1', '��', '2', '��'), COUNT(*)
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO, 8, 1);

SELECT DEPT_CODE, JOB_CODE, COUNT(*), SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE
ORDER BY DEPT_CODE;

--==============================================================================
/*
    [HAVING ��]
    �׷쿡 ���� ������ ������ �� ���Ǵ� ����(�ַ� �׷��Լ����� ������ ������ ����)
*/

--�� �μ��� ��� �޿� ��ȸ(�μ��ڵ�, ��ձ޿�)
SELECT DEPT_CODE, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--�� �μ��� ��� �޿��� 300�� �̻��� �μ��鸸 ��ȸ(�μ��ڵ�, ��ձ޿�)
SELECT DEPT_CODE, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING AVG(SALARY) >= 3000000;

--==============================================================================
--���޺� �����ڵ�, �� �޿���(1000���� �̻��� ���޸� ��ȸ)
SELECT JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING SUM(SALARY) >=10000000;

--�μ��� ���ʽ��� �޴� ����� ���� �μ��� �μ��ڵ�
SELECT DEPT_CODE
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING COUNT(BONUS) = 0;

--==============================================================================
/*
    SELECT * | ��ȸ�ϰ� ���� �÷� AS ��Ī | �Լ��� | ��������                 -- 5
    FROM ��ȸ�ϰ��� �ϴ� ���̺� | DUAL                                        -- 1
    WHERE ���ǽ�(�����ڵ��� Ȱ���Ͽ� ���)                                     -- 2
    GROUP BY �׷������ �Ǵ� �÷� | �Լ���                                    -- 3
    HAVING ���ǽ�(�׷��Լ��� ������ ���)                                      -- 4
    ORDER BY �÷� | ��Ī | ���� [ASC | DESC] [NULLS FIRST | NULLS LAST]      -- 6
*/
--==============================================================================
/*
    ���� ������ == SET OPERATION
    �������� �������� �ϳ��� ���������� ����� ������
    
    -UNION : OR | ������(�� �������� ������ ������� ���Ѵ�.)
    -INTERSECT : AND | ������(�� �������� ������ ����� �� �ߺ��Ǵ� �����)
    -UNION ALL : ������ + ������(�ߺ��Ǵ� �� �� �� ǥ���� �� �ִ�)
    -MINUS : ������(���������� ���������� �� ������)
*/

-- 1. UNION
-- �μ��ڵ尡 D5�� ��� �Ǵ� �޿��� 300���� �ʰ��� ������� ���, �̸�, �μ��ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' OR SALARY > 3000000;

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

-- �޿� 300���� �ʰ�
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

--UNION���� ��ġ��
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;


-- 2. INTERSECT(������)
-- �μ��ڵ尡 D5�̸鼭 �޿��� 300���� �ʰ��� ������� ���, �̸�, �μ��ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' AND SALARY > 3000000;


SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
INTERSECT
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

--==============================================================================
--���տ����� ���� ���ǻ���
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION
SELECT EMP_ID, EMAIL, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;
--�����ϴ� �÷��� ������ ������ �Ȱ��ƾ� �Ѵ�.
--�÷��ڸ����� ������ Ÿ������ ����ؾ� �Ѵ�.
--�����ϰ�ʹٸ� ORDER BY�� �������� ����Ѵ�.

--==============================================================================
--3. UNION ALL: �������� ���� ����� ������ �� ���ϴ� ������

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION ALL
SELECT EMP_ID, EMAIL, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

--4. MINUS : ���� SELECT ������� ���� SELECT ����� �� ������(������)
-- �μ��ڵ尡 D5�� ����� �� �޿��� 300���� �ʰ��� ������� �����ϰ� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
MINUS
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;


