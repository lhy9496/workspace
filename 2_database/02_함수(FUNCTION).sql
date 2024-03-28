SELECT EMP_ID, EMP_NAME, SALARY -- 3��
FROM EMPLOYEE                   -- 1��
WHERE DEPT_CODE IS NULL;        -- 2��

/*
    <ORDER BY ��>
    SELECT�� ���� ������ �ٿ� �ۼ�. ������� ���� ���� �������� ����.
    
    [ǥ����]
    SELECT ��ȸ�� �÷�....
    FROM ��ȸ�� ���̺�
    WHERE ���ǽ�
    ORDER BY ���ı����� �� �÷��� | ��Ī | �÷� ���� [ASC | DESC] [NULL FIRST| NULL LAST]
    - ASC : ��������(���� ������ �����ؼ� ���� ���� Ŀ��) <- �⺻��
    - DESC: ��������(ū ������ �����ؼ� ���� ���� �۾���)
    
    NULL�� �⺻������ ���� ū ������ �з��ؼ� ������
    - NULLS FIRST : ���ı����� �� �÷��� ���� NULL�� ���� ���, �ش� �����͸� �� �տ� ��ġ(DESC�� �� �⺻��)
    - NULLS LAST  : ���ı����� �� �÷��� ���� NULL�� ���� ���, �ش� �����͸� �� �ڿ� ��ġ(ASC�� �� �⺻��)
*/

SELECT *
FROM EMPLOYEE
--ORDER BY BONUS; --�⺻���� ��������
--ORDER BY BONUS ASC;
--ORDER BY BONUS ASC NULLS FIRST;
--ORDER BY BONUS DESC; --NULLS FIRST �⺻
--���� ���ؿ� �÷����� ������ ���, ���� ������ ���ؼ��� �Ǵٸ� ���ı����� ������ �� �ִ�.
ORDER BY BONUS DESC, SALARY ASC;


--�� ����� �����, ����(���ʽ� ����) ��ȸ(������ �������� ����)
SELECT EMP_NAME, SALARY * 12 AS "����"
FROM EMPLOYEE
--ORDER BY SALARY * 12 DESC;
--ORDER BY ���� DESC; -- <- ��Ī ��� ����
ORDER BY 2 DESC; -- <- �÷��� �������� ��ü ����(����Ŭ�� 1���� ����)

--==============================================================================

/*
    <�Լ� FUNCTION>
    ���޵� �÷����� �о�鿩�� �Լ��� ������ ����� ��ȯ
    
    - ������ �Լ� : N���� ���� �о�鿩�� N���� ������� ����(���ึ�� �Լ� �������� ��ȯ)
    - �׷��Լ� : N���� ���� �о�鿩�� 1���� ������� ����(�׷��� ���� �׷캰�� �Լ� ������ ��ȯ)
    
    >> SELECT ���� ������ �Լ��� �׷��Լ��� �Բ� ����ϴ� �� �Ұ���
       ����: ��� ���� ������ �ٸ��� ����
    
    >>�Լ����� ����� �� �ִ� ��ġ : SELECT��, WHERE��, ORDER BY��, GROUP BY��, HAVING�� 
    
*/

--======================<������ �Լ�>============================================

/*
    <���� ó�� �Լ�>
    *LENGTH(�÷� | '���ڿ�') : �ش� ���ڿ��� ���ڼ��� ��ȯ
    *LENGTHB(�÷� | '���ڿ�') : �ش� ���ڿ��� ����Ʈ���� ��ȯ
    
    '��' '��' '��' �ѱ�   ���ڴ� 3byte
    ������, ����, Ư������ ���ڴ� 1byte
    

*/

SELECT LENGTH('����Ŭ'), LENGTHB('����Ŭ')
FROM DUAL;

SELECT LENGTH('ORACLE'), LENGTHB('ORACLE')
FROM DUAL;

SELECT EMP_NAME, LENGTH(EMP_NAME), LENGTHB(EMP_NAME),
        EMAIL, LENGTH(EMAIL), LENGTHB(EMAIL)
FROM EMPLOYEE;

--==============================================================================

/*
    *INSTR
    ���ڿ��κ��� Ư�� ������ ���� ��ġ�� ã�Ƽ� ��ȯ
    
    INSTR(�÷� | '���ڿ�', 'ã���� �ϴ� ����' , ['ã�� ��ġ�� ���۰�', ����]) => ����� NUMBER�� ����
*/

SELECT INSTR('AABAACAABBAA', 'B') -- ���ʿ� �ִ� ù B�� 3��° ��ġ�� �ִٰ� ����
FROM DUAL;
-- ã�� ��ġ ���۰� : 1, ���� : 1 => �⺻��
SELECT INSTR('AABAACAABBAA', 'B', -1) FROM DUAL; -- �ڿ������� ã���� ������� �տ��� �� ���� ����
SELECT INSTR('AABAACAABBAA', 'B', 1, 2) FROM DUAL; -- ������ �����Ϸ��� ã�� ��ġ�� ���۰��� ǥ���ؾ� �� 
SELECT INSTR('AABAACAABBAA', 'B', 1, 3) FROM DUAL; 

SELECT EMAIL, INSTR(EMAIL, '_', 1, 1) AS "lOCATION", INSTR(EMAIL, '@') AS "@��ġ"
FROM EMPLOYEE;

--==============================================================================

/*
    * SUBSTR / ���־���
    ���ڿ����� Ư�� ���ڿ��� �����ؼ� ��ȯ
    
    [ǥ����]
    SUBSTR(STRING, POSITION, [LENGTH])
    - STRING : ����Ÿ���� �÷� | '���ڿ�'
    - POSITION : ���ڿ� ������ ������ġ�� ��
    - LENGTH : ������ ������ ����(�����ϸ� ������)
*/

SELECT SUBSTR('SHOWMETHEMONEY' , 7) FROM DUAL; -- 7��° ��ġ���� ������
SELECT SUBSTR('SHOWMETHEMONEY' , 5, 2) FROM DUAL; -- 5��° ��ġ���� 2����
--SHOWME��
SELECT SUBSTR('SHOWMETHEMONEY' , 1, 6) FROM DUAL;

--������鸸 ��ȸ
SELECT EMP_NAME, EMP_NO
FROM EMPLOYEE
WHERE (SUBSTR(EMP_NO , 8, 1)) = 2 OR (SUBSTR(EMP_NO , 8, 1)) = 4;

--������鸸 ��ȸ
SELECT EMP_NAME, EMP_NO
FROM EMPLOYEE
WHERE (SUBSTR(EMP_NO , 8, 1)) = 1 OR (SUBSTR(EMP_NO , 8, 1)) = 3
ORDER BY EMP_NAME;

--�̸��� ���̵�κи� ����
--�����Ͽ��� �����, �̸���, ���̵� ��ȸ
SELECT EMP_NAME, EMAIL, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') - 1) AS "ID"
FROM EMPLOYEE;

--==============================================================================

/*
    *LPAD / RPAD
    ���ڿ��� ��ȸ�� ��, ���ϰ��ְ� ��ȸ�ϰ��� �� �� ���
    
    [ǥ����]
    LPAD/RPAD(STRING, ���������� ��ȯ�� ������ ����, [�����̰����ϴ� ����])
    
    ���ڿ��� �����̰����ϴ� ���ڸ� ���� �Ǵ� �����ʿ� �ٿ��� ���� N ���̸�ŭ�� ���ڿ��� ��ȯ
    
*/

--20��ŭ�� ���� �� EMAIL �÷����� ���������� �����ϰ� ������ �κ��� �������� ä���.
SELECT EMP_NAME, LPAD(EMAIL, 20)
FROM EMPLOYEE;

SELECT EMP_NAME, LPAD(EMAIL, 20, '-')
FROM EMPLOYEE;

SELECT EMP_NAME, RPAD(EMAIL, 20, '-')
FROM EMPLOYEE;

SELECT RPAD('000000-0', 14, '*')
FROM DUAL;

--������� �����, �ֹι�ȣ ��ȸ(���ڸ��� 2��°���� *ó��)
SELECT EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*')
FROM EMPLOYEE;

--==============================================================================
/*
    * LTRIM / RTRIM
    ���ڿ����� Ư�� ���ڸ� ������ �������� ��ȯ
    LTRIM/RTRIM(STRING, [�����ϰ��� �ϴ� ���ڵ�])
    
    ���ڿ��� ���� Ȥ�� �����ʿ��� �����ϰ��� �ϴ� ���ڵ��� ã�Ƽ� ������ ������ ���ڿ��� ��ȯ
*/

SELECT LTRIM('  K   H') FROM DUAL;
SELECT LTRIM('123123KH123', '123') FROM DUAL;
SELECT LTRIM('ACABACCKH', 'ABC') FROM DUAL; -- �����ϰ��� �ϴ� ���ڴ� ���ڿ��� �ƴ� ���ڵ�
SELECT RTRIM('574185KH123', '0123456789') FROM DUAL;

/*
    *TRIM
    ���ڿ��� ��/��/���ʿ� �ִ� ������ ���ڵ��� ������ ������ ���ڿ� ��ȯ
    TRIM([LEADING | TRAILING | BOTH]) �����ϰ��� �ϴ� ���ڿ� FROM ���ڿ�)
*/
SELECT TRIM('       K   H  ') FROM DUAL; -- ���ʿ� �ִ� ������ ����
SELECT TRIM('Z' FROM 'ZZZZKHZZZZZZZZ') FROM DUAL; --���ʿ� �ִ� Ư�� ���� ����

SELECT TRIM(LEADING 'Z' FROM 'ZZZZKHZZZZZZZZ') FROM DUAL; -- LTRIM ������ ���
SELECT TRIM(TRAILING 'Z' FROM 'ZZZZKHZZZZZZZZ') FROM DUAL; -- RTRIM ������ ���
SELECT TRIM(BOTH 'Z' FROM 'ZZZZKHZZZZZZZZ') FROM DUAL; -- �⺻��

--==============================================================================
/*
    *LOWER / UPPER / INITCAP
    
    LOWER : �� �ҹ��ڷ� ������ ���ڿ� ��ȯ
    UPPER : �� �빮�ڷ� ������ ���ڿ� ��ȯ
    INITCAP : ���� ���� ù ���ڸ��� �빮�ڷ� ������ ���ڿ� ��ȯ
*/
SELECT LOWER('Welcome To My World!') FROM DUAL;
SELECT  UPPER('Welcome To My World!') FROM DUAL;
SELECT INITCAP('welcome to my world!') FROM DUAL;

--==============================================================================

/*

    * CONCAT
    ���ڿ� �ΰ� ���޹޾� �ϳ��� ��ģ �� ��ȯ
    CONCAT[STRING, STRING2]
*/

SELECT CONCAT('������', 'ABC') FROM DUAL; --�ΰ��� ���ڿ��� ����
SELECT '������' || 'ABC' FROM DUAL;

--==============================================================================

/*
    *REPLACE
    Ư�� ���ڿ����� Ư�� �κ��� �ٸ� �κ����� ��ü
    REPLACE(���ڿ�, ã�� ���ڿ�, ������ ���ڿ�)
*/

SELECT EMAIL, REPLACE(EMAIL, 'KH.or.kr', 'gmail.com')
FROM EMPLOYEE;

--==============================================================================

/*
    <���� ó�� �Լ�>
    
    *ABS
    ������ ���밪�� �����ִ� �Լ�
*/

SELECT ABS(-10), ABS(-6.3) FROM DUAL;

--==============================================================================

/*
    *MOD
    �� ���� ���� ������ ���� ��ȯ
    MOD(NUMBER, NUMBER)
*/

SELECT MOD(10, 3) FROM DUAL;
SELECT MOD(10.9, 3) FROM DUAL;

--==============================================================================

/*
    *ROUND
    �ݿø��� ����� ��ȯ
    
    ROUND(NUMBER, [��ġ])
*/

SELECT ROUND(123.456) FROM DUAL; -- �⺻ �ڸ����� �Ҽ��� ù��° �ڸ����� �ݿø� : 0
SELECT ROUND(123.456, 1) FROM DUAL; -- ����� �����Ҽ��� �Ҽ��� �ڷ� �̵�
SELECT ROUND(123.456, -1) FROM DUAL; -- ������ �����Ҽ��� �Ҽ��� ���ڸ��� �̵�

/*
    *FLOOR
    ������ ����� ��ȯ
*/
SELECT FLOOR(123.955) FROM DUAL;

/*
    *CEIL
    �ø��� ����� ��ȯ
*/

/*
    *TRUNC
    ������ �ڸ��� ���ϸ� ������ ����� ��ȯ
*/

SELECT TRUNC(123.952) FROM DUAL;

--QUIZ==========================================================================

--�˻��ϰ��� �ϴ� ����
--JOB_CODE�� J7�̰ų� J6, SALARY���� 200���� �̻��̸� BONUS�� ����
--�����̰� �̸��� �ּҴ� _�տ� 3���ڸ� �ִ� ���
--�� ������ �����ϴ� ����� �̸�, �ֹε�Ϲ�ȣ, �����ڵ�, �μ��ڵ�, �޿�, ���ʽ��� ��ȸ
--���������� ��ȸ�Ǹ� ����� 2��

SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
--WHERE JOB_CODE = 'J6' OR JOB_CODE = 'J7'; -- JOB_CODE  J6 �Ǵ� J7
--WHERE SALARY >= 2000000; --SALARY 200�� �̻�
--WHERE BONUS IS NOT NULL; --BONUS�� ����
--WHERE SUBSTR(EMP_NO, 8, 1) = 2; --����
--WHERE EMAIL LIKE '___\_%' ESCAPE '\'; --EMAIL�� _�տ� 3���ڸ� ����

WHERE (JOB_CODE = 'J6' OR JOB_CODE = 'J7') AND (SALARY >= 2000000) AND (BONUS IS NOT NULL) AND (SUBSTR(EMP_NO, 8, 1) = 2) AND (EMAIL LIKE '___\_%' ESCAPE '\');

--==============================================================================

/*
    <��¥ ó�� �Լ�>
*/

-- * SYSDATE : �ý����� ���� ��¥ �� �ð��� ��ȯ
SELECT SYSDATE FROM DUAL;

-- * MONTHS_BETWEEN : �� ��¥ ������ ���� ��
-- ������� �����, �Ի���, �ٹ��ϼ�, �ٹ� ���� ���� ��ȸ

SELECT EMP_NAME, HIRE_DATE, FLOOR(SYSDATE - HIRE_DATE), 
       CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE))|| '������' AS "�ټӰ���"
FROM EMPLOYEE;

--  * ADD_MONTHS : Ư�� ��¥�� NUMBER�������� ���ؼ� ��ȯ
SELECT ADD_MONTHS(SYSDATE, 4) FROM DUAL;

--�ٷ��� ���̺��� �����, �Ի���, �Ի��� 3������ ��¥ ��ȸ(������ ��ȯ��)
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 3) AS "������ ��ȯ��"
FROM EMPLOYEE;

-- *NEXT_DAY(DATE, ����(���� | ����)) : Ư�� ��¥ ���� ���� ����� ������ ��¥�� ��ȯ
SELECT NEXT_DAY(SYSDATE, '�����') FROM DUAL;
SELECT NEXT_DAY(SYSDATE, '��') FROM DUAL;
-- 1: ��, 2: ��, ...7: ��

SELECT NEXT_DAY(SYSDATE, 7) FROM DUAL;
SELECT NEXT_DAY(SYSDATE, 'FRIDAY') FROM DUAL; -- ��� ���� ���� �ʿ�

--��� ����
ALTER SESSION SET NLS_LANGUAGE = AMERICAN;
ALTER SESSION SET NLS_LANGUAGE = KOREAN;

-- * LAST_DAY(DATE) : �ش���� ������ ��¥�� ���ؼ� ��ȯ
SELECT LAST_DAY(SYSDATE) FROM DUAL;

-- ������̺��� �����, �Ի���, �Ի���� ������ ��¥, �Ի���� �ٹ��ϼ� ��ȸ
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE), (LAST_DAY(HIRE_DATE) - HIRE_DATE)
FROM EMPLOYEE;


/*
    * EXTRACT : Ư�� ��¥�κ��� �⵵|��|�� ���� �����ؼ� ��ȯ�ϴ� �Լ�
    
    [ǥ����]
    EXTRACT(YEAR FROM DATE) : ������ ����
    EXTRACT(MONTH FROM DATE) : ���� ����
    EXTRACT(DATE FROM DATE) : �ϸ� ����
    => ����� NUMBER
*/

--����� �����, �Ի�⵵, �Ի��, �Ի��� ��ȸ
SELECT EMP_NAME, EXTRACT(YEAR FROM HIRE_DATE) AS "�Ի�⵵",
        EXTRACT(MONTH FROM HIRE_DATE) AS "�Ի��",
        EXTRACT(DAY FROM HIRE_DATE) AS "�Ի���"
FROM EMPLOYEE
ORDER BY 2, 3, 4;

--==============================================================================
/*
    [����ȯ �Լ�]
    *TO_CHAR : ���� Ÿ�� �Ǵ� ��¥ Ÿ���� ���� ����Ÿ������ ��ȯ�����ִ� �Լ�

    [ǥ����]
     TO_CHAR(����|��¥, [����])
*/

--���� Ÿ�� -> ���� Ÿ��
SELECT TO_CHAR(1234)FROM DUAL;
SELECT TO_CHAR(1234, '999999') AS "NUMBER" FROM DUAL;

SELECT TO_CHAR(3500000, 'L9,999,999') FROM DUAL;


--������� �����, ����, ���� ��ȸ
SELECT EMP_NAME, TO_CHAR(SALARY, 'L99,999,999') AS "����", 
    TO_CHAR(SALARY * 12, 'L99,999,999') AS "����"
FROM EMPLOYEE;

--��¥Ÿ�� => ����Ÿ��
SELECT SYSDATE FROM DUAL;
SELECT TO_CHAR(SYSDATE) FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'PM HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD-DAY DY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON, YYYY') FROM DUAL;

--������� �̸�, �Ի糯¥(0000��, 00��, 00��) ��ȸ
SELECT EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY"��" MM"��" DD"��"') --������ ���Ĵ�θ� ��� ����
FROM EMPLOYEE;

--�⵵�� ���õ� ����
SELECT TO_CHAR(SYSDATE, 'YYYY'),
    TO_CHAR(SYSDATE, 'YY'),
    TO_CHAR(SYSDATE, 'MM'),
    TO_CHAR(SYSDATE, 'DD')
FROM DUAL;
    
SELECT HIRE_DATE, TO_CHAR(HIRE_DATE, 'YY'), TO_CHAR(HIRE_DATE, 'RR') FROM EMPLOYEE;

--���� ���õ� ����
SELECT TO_CHAR(SYSDATE, 'MM') , TO_CHAR(SYSDATE, 'MON'), TO_CHAR(SYSDATE, 'MONTH') FROM DUAL;

--�ϰ� ���õ� ����
SELECT TO_CHAR(SYSDATE, 'DDD') --������ �̹� �⵵���� ���° �ϼ�
     , TO_CHAR(SYSDATE, 'DD') -- ���� ����
     , TO_CHAR(SYSDATE, 'D') -- ���� -> ����
FROM DUAL;

--���Ͽ� ���� ����
SELECT TO_CHAR(SYSDATE, 'DAY')
    , TO_CHAR(SYSDATE, 'DY')
FROM DUAL;

--==============================================================================


/*
    TO_DATE : ����Ÿ��, �Ǵ� ����Ÿ���� ��¥Ÿ������ �����ϴ� �Լ�
    
    TO_DATE(����|����, [����]) -> DATE
*/

SELECT TO_DATE(20100101) FROM DUAL;
SELECT TO_DATE(490219) FROM DUAL; -- 50�� �̸��� 20XX, 50�� �̻��� 19XX�� �����ȴ�.

SELECT TO_DATE(020219) FROM DUAL; -- ���ڴ� 0���� �����ϸ� �ȵ�
SELECT TO_DATE('020219') FROM DUAL;

SELECT TO_DATE('20240219 120800' , 'YYYYMMDD HH24MISS') FROM DUAL; --��, ��, �ʴ� ������ ������� ǥ�� ����

--==============================================================================
/*
    TO_NUMBER : ����Ÿ���� �����͸� ����Ÿ���� ��ȭ�����ִ� �Լ�
    
    [ǥ����]
    TO_NUMBER(����, [����])
*/

SELECT TO_NUMBER('05123456789') FROM DUAL;

SELECT '100000' + '55000' FROM DUAL;

--==============================================================================

--NVL2(�÷�, ��ȯ��1, ��ȯ��2)
-- ��ȯ�� 1: �ش��÷��� ������ ��� ������ ��
-- ��ȯ�� 2: �ش��÷��� NULL�� ��� ������ ��

SELECT EMP_NAME, BONUS, NVL2(BONUS, 'O', 'X')
FROM EMPLOYEE;

-- ������� �����, �μ���ġ����(�����Ϸ�, �̹���) ��ȸ
SELECT EMP_NAME, DEPT_CODE, NVL2(DEPT_CODE, '�����Ϸ�', '�̹���')
FROM EMPLOYEE;

--*NULLIF(�񱳴��1, �񱳴��2)
-- �� ���� ��ġ�ϸ� NULL, ��ġ���� �ʴ´ٸ� �񱳴��1 ��ȯ
SELECT NULLIF('123', '456') FROM DUAL;
SELECT NULLIF('123', '123') FROM DUAL;

--==============================================================================

/*

    [�����Լ�]
    *DECODE(���ϰ��� �ϴ� ���(�÷�, �����, �Լ���), �񱳰�1, �����1, �񱳰�2, �����2, �񱳰�3, �����3...)
    
    SWITCH(�񱳴��){
    CASE �񱳰�1:
        �����ڵ�
    CASE �񱳰�2:
        �����ڵ�
    ...
    }
*/

--���, �����, �ֹι�ȣ, ���� ��ȸ
SELECT EMP_ID, EMP_NAME, EMP_NO,
       DECODE(SUBSTR(EMP_NO, 8, 1), '1', '��', '2', '��', '3', '��', '4', '��', '�ܰ���') AS "����"
FROM EMPLOYEE;

--������ ����, ���� �޿�, �λ�� �޿� ��ȸ * �� ���޺��� �λ��ؼ� ��ȸ
-- J7�� ����� 10% �λ�(SALARY *1.1)
-- J6�� 15% �λ�
-- J5�� 20% �λ�
-- �� �ܿ��� 5% �λ�

SELECT EMP_NAME, JOB_CODE, SALARY AS "�λ� ��",
    DECODE(JOB_CODE, 'J7', SALARY * 1.1, 'J6', SALARY * 1.15, 'J5', SALARY * 1.2, SALARY * 1.05) AS "�λ� ��"
FROM EMPLOYEE;

/*
    *CASE WHEN THEN
    
    CASE
        WHEN ���ǽ�1 THEN �����1
        WHEN ���ǽ�2 THEN �����2
        ...
    END
*/
SELECT EMP_NAME, SALARY,
    CASE
        WHEN SALARY >= 5000000 THEN '���'
        WHEN SALARY >= 2500000 THEN '�߱�'
        ELSE '�ʱ�'
    END
FROM EMPLOYEE;

--�׷��Լ�=======================================================================
-- 1. SUM(����Ÿ���÷�): �ش� �÷� ������ �� �հ踦 ���ؼ� ��ȯ���ִ� �Լ�

-- �ٷ������̺��� ������� �� �޿��� ���ض�
SELECT SUM(SALARY)
FROM EMPLOYEE;

--��������� �� �޿� ��
SELECT SUM(SALARY)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) IN ('1', '3');

--�μ��ڵ尡 D5�� ������� �� ����(�޿� * 12)
SELECT SUM(SALARY * 12)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

-- 2. AVG(NUMBER) : �ش� �÷������� ��հ��� ���ؼ� ��ȯ
SELECT AVG(SALARY)
FROM EMPLOYEE;

-- 3. MIN(��� Ÿ�� ����) : �ش� �÷��� �� ���� ���� ���� ���ؼ� ��ȯ
SELECT MIN(EMP_NAME), MIN(SALARY), MIN(HIRE_DATE)
FROM EMPLOYEE;

-- 4. MAX(��� Ÿ�� ����) : �ش� �÷��� �� ���� ū ���� ���ؼ� ��ȯ
SELECT MAX(EMP_NAME), MAX(SALARY), MAX(HIRE_DATE)
FROM EMPLOYEE;

-- 5. COUNT(* | �÷� | DISTINCT �÷�) : �ش� ���ǿ� �´� ���� ������ ��� ��ȯ
-- COUNT(*) : ��ȸ�� ����� ��� ���� ������ ��� ��ȯ
-- COUNT(�÷�) : ������ �ش� �÷����� NULL�� �ƴ� �͸� ���� ������ ��� ��ȯ
-- COUNT(DISTINCT �÷�) : �ش� �÷��� �ߺ��� ������ �� ���� ������ ��� ��ȯ

--��ü ��� ��
SELECT COUNT(*) FROM EMPLOYEE;

--����� ��
SELECT COUNT(*)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) IN ('2', '4');

--���ʽ��� �޴� ��� ��
SELECT COUNT(BONUS)
FROM EMPLOYEE;

--�μ���ġ�� ���� ��� ��
SELECT COUNT(DEPT_CODE)
FROM EMPLOYEE;

--���� ������� �� ��� �μ��� �����Ǿ� �ִ��� ��ȸ
SELECT COUNT(DISTINCT DEPT_CODE)
FROM EMPLOYEE;
