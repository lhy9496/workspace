--�� ����� �����, ����(���ʽ� ����) ��ȸ(������ �������� ����)
SELECT EMP_NAME, SALARY * 12
FROM EMPLOYEE
ORDER BY SALARY DESC;

--������鸸 ��ȸ
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 2;

--������鸸 ��ȸ
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 1;

--�̸��� ���̵�κи� ����
--�����Ͽ��� �����, �̸���, ���̵� ��ȸ
SELECT EMP_NAME, EMAIL, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') - 1) AS "ID"
FROM EMPLOYEE;

--������� �����, �ֹι�ȣ ��ȸ(���ڸ��� 2��°���� *ó��)
SELECT EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') AS "EMP_NO"
FROM EMPLOYEE;

--�˻��ϰ��� �ϴ� ����
--JOB_CODE�� J7�̰ų� J6, SALARY���� 200���� �̻��̸� BONUS�� ����
--�����̰� �̸��� �ּҴ� _�տ� 3���ڸ� �ִ� ���
--�� ������ �����ϴ� ����� �̸�, �ֹε�Ϲ�ȣ, �����ڵ�, �μ��ڵ�, �޿�, ���ʽ��� ��ȸ
--���������� ��ȸ�Ǹ� ����� 2��
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
WHERE (JOB_CODE = 'J6' OR JOB_CODE = 'J7') AND (SALARY >= 2000000)
        AND (BONUS IS NOT NULL) AND (SUBSTR(EMP_NO, 8, 1) = 2)
        AND (EMAIL LIKE '___\_%' ESCAPE '\');
-- ������� �����, �Ի���, �ٹ��ϼ�, �ٹ��������� ��ȸ
SELECT EMP_NAME, HIRE_DATE, FLOOR(SYSDATE-HIRE_DATE) AS "�ٹ��ϼ�"
        , CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS "�ٹ�������"
FROM EMPLOYEE;

--�ٷ��� ���̺��� �����, �Ի���, �Ի��� 3������ ��¥ ��ȸ(������ ��ȯ��)
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 3) AS "������ ��ȯ��"
FROM EMPLOYEE;

-- ������̺��� �����, �Ի���, �Ի���� ������ ��¥, �Ի���� �ٹ��ϼ� ��ȸ
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE), FLOOR(LAST_DAY(HIRE_DATE) - HIRE_DATE)
FROM EMPLOYEE;

--����� �����, �Ի�⵵, �Ի��, �Ի��� ��ȸ
SELECT EMP_NAME
    , EXTRACT(YEAR FROM HIRE_DATE) AS "�Ի�⵵"
    , EXTRACT(MONTH FROM HIRE_DATE) AS "�Ի��"
    , EXTRACT(DAY FROM HIRE_DATE) AS "�Ի���"
FROM EMPLOYEE
ORDER BY 2, 3, 4;

--������� �����, ����, ���� ��ȸ
SELECT EMP_NAME, TO_CHAR(SALARY, 'L99,999,999') AS "����"
    , TO_CHAR(SALARY * 12, 'L99,999,999') AS "����"
FROM EMPLOYEE;

--������� �̸�, �Ի糯¥(0000��, 00��, 00��) ��ȸ
SELECT EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY"��" MM"��" DD"��"')AS "�Ի糯¥"
FROM EMPLOYEE;

-- ������� �����, �μ���ġ����(�����Ϸ�, �̹���) ��ȸ
SELECT EMP_NAME, NVL2(DEPT_CODE, '�����Ϸ�', '�̹���') AS "�μ���ġ����"
FROM EMPLOYEE;

--���, �����, �ֹι�ȣ, ���� ��ȸ
SELECT EMP_ID, EMP_NAME, EMP_NO,
        DECODE(SUBSTR(EMP_NO, 8, 1), '1', '����', '2', '����') AS "����"
FROM EMPLOYEE;

--������ ����, ���� �޿�, �λ�� �޿� ��ȸ * �� ���޺��� �λ��ؼ� ��ȸ
-- J7�� ����� 10% �λ�(SALARY *1.1)
-- J6�� 15% �λ�
-- J5�� 20% �λ�
-- �� �ܿ��� 5% �λ�
SELECT EMP_NAME, SALARY AS "�λ� �� �޿�",
    DECODE(JOB_CODE, 'J7', (SALARY * 1.1), 'J6', (SALARY * 1.15),
    'J5', (SALARY * 1.2), (SALARY * 1.05)) AS "�λ� �� �޿�"
FROM EMPLOYEE;

--������ ����, �޿�, ������ �޿��� ���� '���', '�߱�', '�ʱ�'���� �з��ؼ� ��ȸ
--500�� �̻��� ���, 250�� �̻��� �߱�, �� �̸��� �ʱ�
SELECT EMP_NAME, SALARY,
    CASE
        WHEN SALARY >= 5000000 THEN '���'
        WHEN SALARY >= 2500000 THEN '�߱�'
        WHEN SALARY < 2500000 THEN '�ʱ�'
    END AS "���"
FROM EMPLOYEE;

--�ٷ������̺��� �� ����� �� �޿��� ���ض�
SELECT SUM(SALARY)
FROM EMPLOYEE;

--��������� �� �޿� ��
SELECT SUM(SALARY)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 1;

--�μ��ڵ尡 D5�� ������� �� ����(�޿� * 12)
SELECT SUM(SALARY * 12)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--��ü ��� ��
SELECT COUNT(*)
FROM EMPLOYEE;

--����� ��
SELECT COUNT(*)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 2;

--���ʽ��� �޴� ��� ��
SELECT COUNT(*)
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

--�μ���ġ�� ���� ��� ��
SELECT COUNT(*)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL;

--���� ������� �� ��� �μ��� �����Ǿ� �ִ��� ��ȸ
SELECT COUNT(DISTINCT DEPT_CODE)
FROM EMPLOYEE;
