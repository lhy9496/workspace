
CREATE TABLE MEM_NOTNULL(
    MEM_NO NUMBER NOT NULL,
    MEM_ID VARCHAR2(20) NOT NULL,
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    MEM_GENDER CHAR(3),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50)
    );

/*
    �ּ�
    [ǥ����]
    COMMENT ON COLUMN ���̺��.�÷��� IS '�ּ�����';
    -> �߸� �ۼ� �� ���� �����ϸ� �ȴ�.
*/

--���̺� ���� : DROP TABLE ���̺��;
DROP TABLE MEMBER;

--INSERT : ���̺� ������ �߰� 
--INSERT INTO ���̺�� VALUES(��, ��, ��, ��...)
INSERT INTO MEM_NOTNULL
VALUES(1, 'USER1', 'PASS1', 'ȫ�浿', '��', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_NOTNULL
VALUES(2, 'USER2', 'PASS2', 'ȫ���', NULL, NULL, NULL);

INSERT INTO MEM_NOTNULL
VALUES(4, 'USER2', 'PASS2', NULL, NULL, NULL, NULL);

SELECT * FROM MEM_NOTNULL;

--------------------------------------------------------------------------------
/*
    *UNIQUE ��������
    �ش� �÷��� �ߺ��� ���� ������ �ȵ� ���
*/

CREATE TABLE MEM_UNIQUE(
    MEM_NO NUMBER NOT NULL,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    MEM_GENDER CHAR(3),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50)
    );
--UNIQUE �������ǿ� ����Ǿ����Ƿ� INSERT ����
--> ���������� �������Ǹ����� �˷��ش�
--> ���� �ľ��ϱ� �����
--> �������� �ο��� �������Ǹ��� ���������� ������ �ý��ۿ��� �̸��� �ο��Ѵ�.

--------------------------------------------------------------------------------

/*
    �������� �ο��� ���� ���Ǹ���� �����ִ� ���
    > �÷� �������
    CREATE TABLE ���̺��(
        �÷��� �ڷ��� (CONSTRAINT �������Ǹ�) ��������
    )
    
    >���̺� �������
    CREATE TABLE ���̺��(
        �÷��� �ڷ���,
        �÷��� �ڷ���,
        (CONSTRAINT �������Ǹ�)��������(�÷���)
    )
*/

CREATE TABLE MEM_UNIQUE(
    MEM_NO NUMBER CONSTRAINT MEMNO_NT NOT NULL,
    MEM_ID VARCHAR2(20) CONSTRAINT MEMID_NT NOT NULL, 
    MEM_PWD VARCHAR2(20) CONSTRAINT MEMPWD_NT NOT NULL,
    MEM_NAME VARCHAR2(20) CONSTRAINT MEMNAME_NT NOT NULL,
    MEM_GENDER CHAR(3),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    CONSTRAINT MEMID_UQ UNIQUE(MEM_ID) 
    );
    
INSERT INTO MEM_UNIQUE
VALUES(1, 'USER1', 'PASS1', 'ȫ�浿', '��', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_UNIQUE
VALUES(3, 'USER2', 'PASS2', 'ȫ���', '��', NULL, NULL);

INSERT INTO MEM_UNIQUE
VALUES(3, 'USER3', 'PASS3', '�谳��', NULL, NULL, NULL);

INSERT INTO MEM_UNIQUE
VALUES(4, 'USER3', 'PASS3', NULL, NULL, NULL, NULL);

--------------------------------------------------------------------------------
/*
    *CHECK(���ǽ�)
    �ش� �÷��� ���� �� �ִ� ���� ���� ������ �����ص� �� �ְ�
    �ش� ������ �����ϴ� �����Ͱ��� ��� �� ����
*/
DROP TABLE MEM_UNIQUE;
DROP TABLE MEM_NOTNULL;

CREATE TABLE MEM_CHECK(
    MEM_NO NUMBER NOT NULL,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')), --������ '��', '��'�� ������
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID)
    );

INSERT INTO MEM_CHECK
VALUES(1, 'USER1', 'PASS1', 'ȫ�浿', '��', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_CHECK
VALUES(2, 'USER2', 'PASS2', 'ȫ���', NULL, NULL, NULL);
--> CHECK �������� ������ ������ �߻��Ѵ�.
--> ���� GENDER �÷��� �����͸� �ְ��� �Ѵٸ� CHECK �������ǿ� �����ϴ� ���� �־�� �Ѵ�.
--> NULL�� ���� ���ٴ� ���̱� ������ NOTNULL �������Ǹ� ���ٸ� �����ϴ�.



SELECT * FROM MEM_CHECK;

--------------------------------------------------------------------------------
/*
    PRIMARY KEY(�⺻Ű) ��������
    ���̺��� �� ��(ROW)�� �ĺ��ϱ� ���� ���� �÷��� �ο��ϴ� ��������(�ĺ��� ����)
    
    EX) ȸ����ȣ, �й�, ����, �μ��ڵ�, �����ڵ�, �ֹ���ȣ, �ù� ������ȣ, �����ȣ ��
    PRIMARY KEY ���������� �ο� -> NOT NULL + UNIQUE�� ����
    
    ���ǻ��� : �� ���̺� �� ���� �ϳ��� ���� ����
*/

CREATE TABLE MEM_PRI(
    MEM_NO NUMBER,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID),
    CONSTRAINT MEMNO_PK PRIMARY KEY(MEM_NO)
);

INSERT INTO MEM_PRI
VALUES(1, 'USER1', 'PASS1', 'ȫ�浿', '��', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_PRI
VALUES(NULL, 'USER2', 'PASS2', 'ȫ���', '��', NULL, NULL);
--> �⺻ Ű�� �ߺ���, NULL�� ������ �ϸ� ���� �߻�(UNIQUE, NOT NULL �������� ����)

INSERT INTO MEM_PRI
VALUES(2, 'USER2', 'PASS2', 'ȫ���', '��', NULL, NULL);

--------------------------------------------------------------------------------
CREATE TABLE MEM_PRI2(
    MEM_NO NUMBER,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID),
    PRIMARY KEY(MEM_NO, MEM_ID)
);
--����Ű : �ΰ� �̻��� �÷��� ���ÿ� �ϳ��� PRIMARYKEY�� �����ϴ� ��

INSERT INTO MEM_PRI2
VALUES(1, 'USER1', 'PASS1', 'ȫ�浿', NULL, NULL, NULL);

INSERT INTO MEM_PRI2
VALUES(1, 'USER2', 'PASS2', 'ȫ���', NULL, NULL, NULL);

INSERT INTO MEM_PRI2
VALUES(2, 'USER3', 'PASS3', 'ȫ���', NULL, NULL, NULL);

--����Ű ��� ����(� ȸ���� � ��ǰ�� ���ϴ����� ���� �����͸� �����ϴ� ���̺�)
CREATE TABLE TB_LIKE(
    MEM_NO NUMBER,
    PRODUCT_NAME VARCHAR2(10),
    LIKE_DATE DATE,
    PRIMARY KEY(MEM_NO, PRODUCT_NAME)
);

--ȸ���� 2��(1��, 2��) ����
--���� A, B ��ǰ�� ����

INSERT INTO TB_LIKE VALUES(1, '������A', SYSDATE);
SELECT *FROM TB_LIKE;
INSERT INTO TB_LIKE VALUES(1, '������B', SYSDATE);
INSERT INTO TB_LIKE VALUES(1, '������A', SYSDATE);
--------------------------------------------------------------------------------
CREATE TABLE MEM_GRADE(
    GRADE_CODE NUMBER PRIMARY KEY,
    GRADE_NAME VARCHAR2(30) NOT NULL
);

INSERT INTO MEM_GRADE VALUES(10, '�Ϲ�ȸ��');
INSERT INTO MEM_GRADE VALUES(20, '���ȸ��');
INSERT INTO MEM_GRADE VALUES(30, 'Ư��ȸ��');

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER
);

INSERT INTO MEM VALUES(1, 'USER1', 'PASS01', 'ȫ���', '��', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER2', 'PASS02', 'ȫ�浿', '��', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', '������', NULL, NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER4', 'PASS04', '�ķ��', NULL, NULL, NULL, 40);
--��ȿ�� ȸ����� ��ȣ�� �ƴϿ��� INSERT�� �۵���

--------------------------------------------------------------------------------
/*
    *FOREIGN KEY(�ܷ�Ű) ��������
    �ٸ� ���̺� �����ϴ� ���� ���;� �Ǵ� Ư�� �÷��� �ο��ϴ� ��������
    -> �ٸ� ���̺��� �����Ѵٰ� ǥ��
    -> �ַ� FOREIGN KEY ������������ ���� ���̺� ���谡 �����ȴ�.
    
    > �÷��������
    �÷��� �ڷ��� REFERENCES ������ ���̺��[(������ �÷���)]
    
    >���̺������
    FOREIGN KEY(�÷���) REFERENCES ������ ���̺��[(������ �÷���)]
    
    -> ������ �÷��� ������ ������ ���̺��� PRIMARY KEY�� ������ �÷��� ��Ī�ȴ�.
*/

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE)
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

INSERT INTO MEM VALUES(1, 'USER1', 'PASS01', 'ȫ�浿', '��', NULL, NULL, NULL);
--> �ַ�Ű ���������� �ο��� �÷��� �⺻������ NULL ����
INSERT INTO MEM VALUES(2, 'USER2', 'PASS02', 'ȫ���', '��', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', 'ȫ���', NULL, NULL, NULL, 40);
--> parent key�� ã�� �� ���ٴ� ���� �߻�

SELECT * FROM MEM;
--MEM_GRADE(�θ����̺�) MEM(�ڽ����̺�)
INSERT INTO MEM VALUES(4, 'USER4', 'PASS04', 'ȫ���', '��', NULL, NULL, 20);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', 'ȫ���', '��', NULL, NULL, 10);

--> �̶� �θ����̺��� �����Ͱ��� �����Ѵٸ�?
--������ ���� : DELETE FROM ���̺�� WHERE ����;

--MEM_GRADE ���̺��� 10�� ��� ����
DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;
--> �ڽ����̺��� ����ϰ� �ֱ� ������ 10�� ���� �Ұ�
DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 30;
--> �ڽ����̺��� 30�� ������� �ʱ� ������ ���� ����

--> �ڽ����̺��� �̹� ����ϴ� ���� ���� ���
--�θ����̺�κ��� ������ ������ �ȵǴ� �������� �ɼ��� �ɷ����� 

ROLLBACK;

--------------------------------------------------------------------------------
/*
    �ڽ����̺� ������ �ܷ�Ű �������� �ο��� �� �����ɼ� ��������
    * �����ɼ� : �θ����̺��� ������ ������ �� �����͸� ����ϰ� �ִ� �ڽ����̺��� ���� ��� �� ���ΰ�?
    
    -ON DELETE RESTRICTED(�⺻��) : �������ѿɼ�, �ڽĵ����ͷκ��� ���̴� �θ����ʹ� ������ �ƿ� �ȵ�
    -ON DELETE SET NULL : �θ����� ������ �ش� �����͸� ����ϰ� �ִ� �ڽĵ������� ���� NULL�� ����
    -ON DELETE CASCADE : �θ����� ������ �ش� �����͸� ����ϰ� �ִ� �ڽĵ����͵� ���� ������Ű�� �ɼ�
*/

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE) ON DELETE SET NULL
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

CREATE TABLE MEM_GRADE(
    GRADE_CODE NUMBER PRIMARY KEY,
    GRADE_NAME VARCHAR2(30) NOT NULL
);

INSERT INTO MEM_GRADE VALUES(10, '�Ϲ�ȸ��');
INSERT INTO MEM_GRADE VALUES(20, '���ȸ��');
INSERT INTO MEM_GRADE VALUES(30, 'Ư��ȸ��');

INSERT INTO MEM VALUES(1, 'USER01', 'PASS01', 'ȫ�浿', '��', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER02', 'PASS02', 'ȫ���', '��', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER03', 'PASS03', 'ȫ���', '��', NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER04', 'PASS04', 'ȫ���', '��', NULL, NULL, 30);

DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;

SELECT * FROM MEM;
-- 10�� ��� ������

ROLLBACK;

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('��', '��')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE) ON DELETE CASCADE
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

INSERT INTO MEM_GRADE VALUES(10, '�Ϲ�ȸ��');
INSERT INTO MEM_GRADE VALUES(20, '���ȸ��');
INSERT INTO MEM_GRADE VALUES(30, 'Ư��ȸ��');

INSERT INTO MEM VALUES(1, 'USER01', 'PASS01', 'ȫ�浿', '��', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER02', 'PASS02', 'ȫ���', '��', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER03', 'PASS03', 'ȫ���', '��', NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER04', 'PASS04', 'ȫ���', '��', NULL, NULL, 30);

DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;

SELECT * FROM MEM;
--> 10�� ��� ����, �ش� �����͸� ����ϴ� �ڽĵ����͵� �Բ� ������


--------------------------------------------------------------------------------

/*
    <DEFAULT �⺻��> * ���������� �ƴ�
     �÷��� �������� �ʰ� INSERT�� NULL�� �ƴ� �⺻���� INSERT�ϰ��� �Ѵ�.
     �̶� �����ص� �� �ִ� ��
     
     �÷��� �ڷ��� DEFAULT �⺻��
*/

CREATE TABLE MEMBER(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_NAME VARCHAR2(20) NOT NULL,
    MEM_AGE NUMBER,
    HOBBY VARCHAR2(20) DEFAULT '����',
    ENROLL_DATE DATE DEFAULT SYSDATE
);

--INSERT INTO ���̺�� VALUES(�÷���, �÷���...)
INSERT INTO MEMBER VALUES(1, '������', 20, '�', '20/01/01');
INSERT INTO MEMBER VALUES(2, '����', 22, NULL, NULL);
INSERT INTO MEMBER VALUES(3, '�ְ���', 17, DEFAULT, DEFAULT);

SELECT * FROM MEMBER;
INSERT INTO MEMBER(MEM_NO, MEM_NAME) VALUES(4, '�̺���');
--> ���õ��� ���� �÷����� �⺻������ NULL�� ��
--> ��, DEFAULT���� �ο��Ǿ� �ִٸ� NULL�� �ƴ� DEFAULT���� ��

--------------------------------------------------------------------------------
--���̺� �����ϱ�
CREATE TABLE EMPLOYEE_COPY
AS (SELECT * FROM MEMBER);

DROP TABLE EMPLOYEE_COPY;
--------------------------------------------------------------------------------

/*
    *���̺��� �� ������ �Ŀ� �ڴʰ� ���������� �߰��ϴ� ���
    ALTER TABLE ���̺�� ������ ����
    -PRIMARY KEY : ALTER TABLE ���̺�� ADD PRIMARY KEY(�÷���);
    -FOREIGN KEY : ALTER TABLE ���̺�� ADD FOREIGN KEY(�÷���) REFERENCES ������ ���̺��[(������ �÷���)];
    -UNIQUE KEY : ALTER TABLE ���̺�� ADD UNIQUE(�÷���);
    -CHECK KEY : ALTER TABLE ���̺�� ADD CHECK(�÷��� ���� ���ǽ�);
    -NOT NULL : ALTER TABLE ���̺�� MODIFY �÷��� NOT NULL;
*/

--EMPLOYEE_COPY ���̺� PRIMARY_KEY �������� �߰�
CREATE TABLE EMPLOYEE_COPY
AS (SELECT * FROM EMPLOYEE);

ALTER TABLE EMPLOYEE_COPY ADD PRIMARY KEY(EMP_ID);

--EMPLOYEE ���̺� DEPT_CODE�� �ܷ�Ű �������� �߰�

ALTER TABLE EMPLOYEE ADD FOREIGN KEY(DEPT_CODE) REFERENCES DEPARTMENT(DEPT_ID);

--EMPLOYEE ���̺� JOB_CODE�� �ܷ�Ű �������� �߰�

ALTER TABLE EMPLOYEE ADD FOREIGN KEY(JOB_CODE) REFERENCES JOB(JOB_CODE);

--DEPARTMENT ���̺� LOCATION_ID�� �ܷ�Ű �������� �߰�

ALTER TABLE DEPARTMENT ADD FOREIGN KEY(LOCATION_ID) REFERENCES LOCATION(LOCAL_CODE);

