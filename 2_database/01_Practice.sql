--��� ����� ���� ����
SELECT *
FROM EMPLOYEE;

--��� ����� �̸�, �ֹι�ȣ, ��ȭ��ȣ�� ����
SELECT EMP_NAME, EMP_NO, PHONE
FROM EMPLOYEE;

--DEPARTMENT ���̺��� ��� �÷� ��ȸ
SELECT *
FROM DEPARTMENT;

--DEPARTMENT ���̺��� �μ��ڵ�, �μ��� ��ȸ
SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT;

--EMPLOYEE ���̺��� �����, �̸���, ��ȭ��ȣ, �Ի���, �޿� ��ȸ
SELECT EMP_NAME, EMAIL, PHONE, HIRE_DATE, SALARY
FROM EMPLOYEE;

-- EMPLOYEE ���̺��� �����, ����� ����(SALARY * 12)�� ��ȸ
SELECT EMP_NAME, SALARY * 12
FROM EMPLOYEE;

-- EMPLOYEE ���̺��� �����, �޿�, ���ʽ�, ����, ���ʽ����� ���� ��ȸ(�޿� + (�޿� * ���ʽ�)) * 12
SELECT EMP_NAME, SALARY, BONUS, SALARY * 12 AS "����", (SALARY + (SALARY * BONUS)) * 12 AS "���ʽ� ���� ����"
FROM EMPLOYEE;

--EMPLOYEE ���̺��� ���, �����, �޿�
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE;

--���, �̸�, �޿��� �ϳ��� �÷����� ��ȸ
SELECT EMP_ID || EMP_NAME || SALARY
FROM EMPLOYEE;

-- ������ ���� ����� �������� ����϶�.
-- XX�� ������ XX���Դϴ�.
SELECT EMP_NAME || '�� ������ ' || SALARY || '���Դϴ�.'
FROM EMPLOYEE;

--EMPLOYEE �����ڵ� ��ȸ
SELECT DISTINCT JOB_CODE
FROM EMPLOYEE;

--EMPLOYEE �μ��ڵ� ��ȸ(�ߺ� ����)
SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

--�޿��� 350���� �̻�, 600���� ������ ��� ����� �����, ���, �޿���ȸ
SELECT EMP_NAME, EMP_ID, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3500000 AND SALARY <= 6000000;

--�޿��� 350���� �̸�, 600���� �ʰ��� ��� ����� �����, ���, �޿���ȸ
SELECT EMP_NAME, EMP_ID, SALARY
FROM EMPLOYEE
WHERE SALARY <= 3500000 OR SALARY >= 6000000;

--�Ի����� '90/01/01' ~ '01/01/01' ����� ��ü ��ȸ
SELECT *
FROM EMPLOYEE
WHERE HIRE_DATE >= '90/01/01' AND HIRE_DATE <= '01/01/01';

--����� �߿��� ���� ������ ������� �����, �޿�, �Ի��� ��ȸ
SELECT EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��%';

--����� �߿��� �̸��� '��'��� ���ڰ� ���Ե� ����� �̸�, ��ȭ��ȣ ����� ��ȸ
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%��%';

--����� �߿��� �̸��� �߰� ���ڰ� '��'�� ����� �̸�, ��ȭ��ȣ ����� ��ȸ
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '_��_';

--��ȭ��ȣ�� 3��° �ڸ��� 1�� ������� ���, �����, ��ȭ��ȣ ��ȸ
SELECT EMP_ID, EMP_NAME, PHONE
FROM EMPLOYEE
WHERE PHONE LIKE '__1%';

--�̸��� �� _�ձ��ڰ� 3������ ������� ���, �̸�, �̸��� ��ȸ
SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___\_%' ESCAPE '\';

-- �� ������� �ƴ� �� ���� ������� ��ȸ�ϰ� ���� ��(�÷� ����)
SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL NOT LIKE '___\_%' ESCAPE '\';

--�ǽ�==========================================================================

-- 1. �̸��� '��'���� ������ ������� �����, �Ի�����ȸ
SELECT EMP_NAME, HIRE_DATE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%��';

-- 2. ��ȭ��ȣ ó�� 3�ڸ��� '010'�� �ƴ� ������� ����� ��ȭ��ȣ ��ȸ
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE PHONE NOT LIKE '010%';

-- 3. �̸��� '��'�� ���ԵǾ��ְ� �޿��� 240���� �̻��� ������� �����, �޿� ��ȸ
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY >= 2400000;

-- 4. �μ����̺��� �ؿܿ������� �μ����� �μ��ڵ�, �μ��� ��ȸ
SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT
WHERE DEPT_TITLE LIKE '�ؿ�%';

--==============================================================================


--�μ��ڵ尡 D6�̰ų� D8�̰ų� D5�� �μ������� �̸�, �μ��ڵ�, �޿� ��ȸ
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE LIKE 'D6' OR DEPT_CODE LIKE 'D8' OR DEPT_CODE LIKE 'D5';

--���ʽ��� ���� �ʴ� ������� ���, �̸�, �޿�, ���ʽ� ��ȸ
SELECT EMP_ID,  EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NULL;

--���ʽ��� �޴� ������� ���, �̸�, �޿�, ���ʽ� ��ȸ
SELECT EMP_ID,  EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

--����� ���� ������� �����, ������, �μ��ڵ�, ��ȸ
SELECT EMP_NAME, MANAGER_ID, DEPT_CODE
FROM EMPLOYEE
WHERE MANAGER_ID IS NULL;

--�μ���ġ�� ���� ���� �ʾҰ� ���ʽ��� ���� ������� �̸�, ���ʽ�, �μ��ڵ带 ��ȸ
SELECT EMP_NAME , BONUS, DEPT_CODE
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL AND BONUS IS NOT NULL;

--�����ڵ尡 J7�̰ų� J2�� ����� �߿� �޿��� 200���� �̻��� ������� ��� �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE (JOB_CODE LIKE 'J7' OR JOB_CODE  LIKE 'J2') AND SALARY >= 2000000;

--�ǽ�==========================================================================

--1. ����� ���� �μ���ġ�� ���� ���� ������� �����, ���, �μ��ڵ� ��ȸ
SELECT EMP_NAME, EMP_ID, DEPT_CODE
FROM EMPLOYEE
WHERE MANAGER_ID IS NULL AND DEPT_CODE IS NULL;

--2. ����(���ʽ� ������)�� 3õ���� �̻�, ���ʽ��� ���� �ʴ� ������� ���, �����, �޿�, ���ʽ� ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE SALARY * 12 >= 30000000 AND BONUS IS NULL;

--3. �Ի����� '95/01/01' �̻��̰� �μ���ġ�� ���� ���� ������� ���, �����, �Ի���, �μ��ڵ� ��ȸ
SELECT EMP_ID, EMP_NAME, HIRE_DATE, DEPT_CODE
FROM EMPLOYEE
WHERE HIRE_DATE >= '95/01/01' AND DEPT_CODE IS NULL;

--4. �޿��� 200���� �̻�, 500���� ������ ��� �߿��� �Ի����� '01/01/01' �̻��̰�
--   ���ʽ��� ���� �ʴ� ������� ���, �����, �޿�, �Ի���, ���ʽ� ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY, HIRE_DATE, BONUS
FROM EMPLOYEE
WHERE SALARY >= 2000000 AND SALARY <= 5000000 AND  (HIRE_DATE >= '01/01/01') AND (BONUS IS NULL);

--5. ���ʽ��� ������ ������ NULL�� �ƴϰ�, �̸��� '��'�� ���Ե� ������� ���, �����, �޿�, ���ʽ� ���� ���� ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY, (SALARY + (SALARY * BONUS)) * 12 AS "���ʽ� ���� ����"
FROM EMPLOYEE
WHERE BONUS IS NOT NULL AND EMP_NAME LIKE '%��%';


