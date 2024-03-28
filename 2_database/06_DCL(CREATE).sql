
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
    주석
    [표현법]
    COMMENT ON COLUMN 테이블명.컬럼명 IS '주석내용';
    -> 잘못 작성 시 새로 수정하면 된다.
*/

--테이블 삭제 : DROP TABLE 테이블명;
DROP TABLE MEMBER;

--INSERT : 테이블에 데이터 추가 
--INSERT INTO 테이블명 VALUES(값, 값, 값, 값...)
INSERT INTO MEM_NOTNULL
VALUES(1, 'USER1', 'PASS1', '홍길동', '남', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_NOTNULL
VALUES(2, 'USER2', 'PASS2', '홍길순', NULL, NULL, NULL);

INSERT INTO MEM_NOTNULL
VALUES(4, 'USER2', 'PASS2', NULL, NULL, NULL, NULL);

SELECT * FROM MEM_NOTNULL;

--------------------------------------------------------------------------------
/*
    *UNIQUE 제약조건
    해당 컬럼에 중복된 값이 들어가서는 안될 경우
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
--UNIQUE 제약조건에 위배되었으므로 INSERT 실패
--> 오류구문을 제약조건명으로 알려준다
--> 쉽게 파악하긴 어려움
--> 제약조건 부여시 제약조건명을 지정해주지 않으면 시스템에서 이름을 부여한다.

--------------------------------------------------------------------------------

/*
    제약조건 부여시 제약 조건명까지 지어주는 방법
    > 컬럼 레벨방식
    CREATE TABLE 테이블명(
        컬럼명 자료형 (CONSTRAINT 제약조건명) 제약조건
    )
    
    >테이블 레벨방식
    CREATE TABLE 테이블명(
        컬럼명 자료형,
        컬럼명 자료형,
        (CONSTRAINT 제약조건명)제약조건(컬럼명)
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
VALUES(1, 'USER1', 'PASS1', '홍길동', '남', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_UNIQUE
VALUES(3, 'USER2', 'PASS2', '홍길순', '여', NULL, NULL);

INSERT INTO MEM_UNIQUE
VALUES(3, 'USER3', 'PASS3', '김개개', NULL, NULL, NULL);

INSERT INTO MEM_UNIQUE
VALUES(4, 'USER3', 'PASS3', NULL, NULL, NULL, NULL);

--------------------------------------------------------------------------------
/*
    *CHECK(조건식)
    해당 컬럼에 들어올 수 있는 값에 대한 조건을 제시해둘 수 있고
    해당 조건을 만족하는 데이터값만 담길 수 있음
*/
DROP TABLE MEM_UNIQUE;
DROP TABLE MEM_NOTNULL;

CREATE TABLE MEM_CHECK(
    MEM_NO NUMBER NOT NULL,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')), --오로지 '남', '여'만 들어가도록
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID)
    );

INSERT INTO MEM_CHECK
VALUES(1, 'USER1', 'PASS1', '홍길동', '남', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_CHECK
VALUES(2, 'USER2', 'PASS2', '홍길순', NULL, NULL, NULL);
--> CHECK 제약조건 때문에 에러가 발생한다.
--> 만일 GENDER 컬럼에 데이터를 넣고자 한다면 CHECK 제약조건에 만족하는 값을 넣어야 한다.
--> NULL은 값이 없다는 뜻이기 때문에 NOTNULL 제약조건만 없다면 가능하다.



SELECT * FROM MEM_CHECK;

--------------------------------------------------------------------------------
/*
    PRIMARY KEY(기본키) 제약조건
    테이블에서 각 행(ROW)을 식별하기 위해 사용될 컬럼에 부여하는 제약조건(식별자 역할)
    
    EX) 회원번호, 학번, 군번, 부서코드, 직급코드, 주문번호, 택배 운송장번호, 예약번호 등
    PRIMARY KEY 제약조건을 부여 -> NOT NULL + UNIQUE와 같다
    
    유의사항 : 한 테이블 당 오직 하나만 설정 가능
*/

CREATE TABLE MEM_PRI(
    MEM_NO NUMBER,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID),
    CONSTRAINT MEMNO_PK PRIMARY KEY(MEM_NO)
);

INSERT INTO MEM_PRI
VALUES(1, 'USER1', 'PASS1', '홍길동', '남', '010-1111-2222', 'AAAA@NAVER.COM');

INSERT INTO MEM_PRI
VALUES(NULL, 'USER2', 'PASS2', '홍길순', '여', NULL, NULL);
--> 기본 키에 중복값, NULL을 담으려 하면 오류 발생(UNIQUE, NOT NULL 제약조건 위반)

INSERT INTO MEM_PRI
VALUES(2, 'USER2', 'PASS2', '홍길순', '여', NULL, NULL);

--------------------------------------------------------------------------------
CREATE TABLE MEM_PRI2(
    MEM_NO NUMBER,
    MEM_ID VARCHAR2(20) NOT NULL, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    UNIQUE(MEM_ID),
    PRIMARY KEY(MEM_NO, MEM_ID)
);
--복합키 : 두개 이상의 컬럼을 동시에 하나의 PRIMARYKEY로 지정하는 것

INSERT INTO MEM_PRI2
VALUES(1, 'USER1', 'PASS1', '홍길동', NULL, NULL, NULL);

INSERT INTO MEM_PRI2
VALUES(1, 'USER2', 'PASS2', '홍길순', NULL, NULL, NULL);

INSERT INTO MEM_PRI2
VALUES(2, 'USER3', 'PASS3', '홍길순', NULL, NULL, NULL);

--복합키 사용 예시(어떤 회원이 어떤 상품을 찜하는지에 대한 데이터를 보관하는 테이블)
CREATE TABLE TB_LIKE(
    MEM_NO NUMBER,
    PRODUCT_NAME VARCHAR2(10),
    LIKE_DATE DATE,
    PRIMARY KEY(MEM_NO, PRODUCT_NAME)
);

--회원은 2명(1번, 2번) 존재
--가방 A, B 상품이 존재

INSERT INTO TB_LIKE VALUES(1, '자전거A', SYSDATE);
SELECT *FROM TB_LIKE;
INSERT INTO TB_LIKE VALUES(1, '자전거B', SYSDATE);
INSERT INTO TB_LIKE VALUES(1, '자전거A', SYSDATE);
--------------------------------------------------------------------------------
CREATE TABLE MEM_GRADE(
    GRADE_CODE NUMBER PRIMARY KEY,
    GRADE_NAME VARCHAR2(30) NOT NULL
);

INSERT INTO MEM_GRADE VALUES(10, '일반회원');
INSERT INTO MEM_GRADE VALUES(20, '우수회원');
INSERT INTO MEM_GRADE VALUES(30, '특별회원');

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER
);

INSERT INTO MEM VALUES(1, 'USER1', 'PASS01', '홍길순', '여', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER2', 'PASS02', '홍길동', '남', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', '강아지', NULL, NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER4', 'PASS04', '후룰룰', NULL, NULL, NULL, 40);
--유효한 회원등급 번호가 아니여도 INSERT가 작동함

--------------------------------------------------------------------------------
/*
    *FOREIGN KEY(외래키) 제약조건
    다른 테이블에 존재하는 값만 들어와야 되는 특정 컬럼에 부여하는 제약조건
    -> 다른 테이블을 참조한다고 표현
    -> 주로 FOREIGN KEY 제약조건으로 인해 테이블간 관계가 형성된다.
    
    > 컬럼레벨방식
    컬럼명 자료형 REFERENCES 참조할 테이블명[(참조할 컬럼명)]
    
    >테이블레벨방식
    FOREIGN KEY(컬럼명) REFERENCES 참조할 테이블명[(참조할 컬럼명)]
    
    -> 참조할 컬럼명 생략시 참조할 테이블의 PRIMARY KEY로 지정된 컬럼이 매칭된다.
*/

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE)
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

INSERT INTO MEM VALUES(1, 'USER1', 'PASS01', '홍길동', '남', NULL, NULL, NULL);
--> 왜래키 제약조건이 부여된 컬럼에 기본적으로 NULL 가능
INSERT INTO MEM VALUES(2, 'USER2', 'PASS02', '홍길순', '여', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', '홍길길', NULL, NULL, NULL, 40);
--> parent key를 찾을 수 없다는 오류 발생

SELECT * FROM MEM;
--MEM_GRADE(부모테이블) MEM(자식테이블)
INSERT INTO MEM VALUES(4, 'USER4', 'PASS04', '홍길길', '여', NULL, NULL, 20);
INSERT INTO MEM VALUES(3, 'USER3', 'PASS03', '홍배달', '남', NULL, NULL, 10);

--> 이때 부모테이블에서 데이터값을 삭제한다면?
--데이터 삭제 : DELETE FROM 테이블명 WHERE 조건;

--MEM_GRADE 테이블에서 10번 등급 삭제
DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;
--> 자식테이블에서 사용하고 있기 때문에 10은 삭제 불가
DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 30;
--> 자식테이블에서 30을 사용하지 않기 때문에 삭제 가능

--> 자식테이블에서 이미 사용하는 값이 있을 경우
--부모테이블로부터 무조건 삭제가 안되는 삭제제한 옵션이 걸려있음 

ROLLBACK;

--------------------------------------------------------------------------------
/*
    자식테이블 생성시 외래키 제약조건 부여할 때 삭제옵션 지정가능
    * 삭제옵션 : 부모테이블의 데이터 삭제시 그 데이터를 사용하고 있는 자식테이블의 값을 어떻게 할 것인가?
    
    -ON DELETE RESTRICTED(기본값) : 삭제제한옵션, 자식데이터로부터 쓰이는 부모데이터는 삭제가 아예 안됨
    -ON DELETE SET NULL : 부모데이터 삭제시 해당 데이터를 사용하고 있는 자식데이터의 값을 NULL로 변경
    -ON DELETE CASCADE : 부모데이터 삭제시 해당 데이터를 사용하고 있는 자식데이터도 같이 삭제시키는 옵션
*/

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE) ON DELETE SET NULL
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

CREATE TABLE MEM_GRADE(
    GRADE_CODE NUMBER PRIMARY KEY,
    GRADE_NAME VARCHAR2(30) NOT NULL
);

INSERT INTO MEM_GRADE VALUES(10, '일반회원');
INSERT INTO MEM_GRADE VALUES(20, '우수회원');
INSERT INTO MEM_GRADE VALUES(30, '특별회원');

INSERT INTO MEM VALUES(1, 'USER01', 'PASS01', '홍길동', '남', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER02', 'PASS02', '홍길순', '여', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER03', 'PASS03', '홍길길', '여', NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER04', 'PASS04', '홍배달', '남', NULL, NULL, 30);

DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;

SELECT * FROM MEM;
-- 10번 등급 삭제됨

ROLLBACK;

DROP TABLE MEM;

CREATE TABLE MEM(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_ID VARCHAR2(20) NOT NULL UNIQUE, 
    MEM_PWD VARCHAR2(20) NOT NULL,
    MEM_NAME VARCHAR2(20) NOT NULL,
    GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
    PHONE VARCHAR2(13),
    EMAIL VARCHAR2(50),
    GRADE_ID NUMBER REFERENCES MEM_GRADE(GRADE_CODE) ON DELETE CASCADE
    --FORIGN KEY(GRADE_ID) REFERENCES MEM_GRADE(GRADE_CODE)
);

INSERT INTO MEM_GRADE VALUES(10, '일반회원');
INSERT INTO MEM_GRADE VALUES(20, '우수회원');
INSERT INTO MEM_GRADE VALUES(30, '특별회원');

INSERT INTO MEM VALUES(1, 'USER01', 'PASS01', '홍길동', '남', NULL, NULL, NULL);
INSERT INTO MEM VALUES(2, 'USER02', 'PASS02', '홍길순', '여', NULL, NULL, 10);
INSERT INTO MEM VALUES(3, 'USER03', 'PASS03', '홍길길', '여', NULL, NULL, 20);
INSERT INTO MEM VALUES(4, 'USER04', 'PASS04', '홍배달', '남', NULL, NULL, 30);

DELETE FROM MEM_GRADE
WHERE GRADE_CODE = 10;

SELECT * FROM MEM;
--> 10번 등급 삭제, 해당 데이터를 사용하던 자식데이터도 함께 삭제됨


--------------------------------------------------------------------------------

/*
    <DEFAULT 기본값> * 제약조건이 아님
     컬럼을 선정하지 않고 INSERT시 NULL이 아닌 기본값을 INSERT하고자 한다.
     이때 세팅해둘 수 있는 값
     
     컬럼명 자료형 DEFAULT 기본값
*/

CREATE TABLE MEMBER(
    MEM_NO NUMBER PRIMARY KEY,
    MEM_NAME VARCHAR2(20) NOT NULL,
    MEM_AGE NUMBER,
    HOBBY VARCHAR2(20) DEFAULT '없음',
    ENROLL_DATE DATE DEFAULT SYSDATE
);

--INSERT INTO 테이블명 VALUES(컬럼값, 컬럼값...)
INSERT INTO MEMBER VALUES(1, '빵빵이', 20, '운동', '20/01/01');
INSERT INTO MEMBER VALUES(2, '옥지', 22, NULL, NULL);
INSERT INTO MEMBER VALUES(3, '최갑을', 17, DEFAULT, DEFAULT);

SELECT * FROM MEMBER;
INSERT INTO MEMBER(MEM_NO, MEM_NAME) VALUES(4, '이병정');
--> 선택되지 않은 컬럼에는 기본적으로 NULL이 들어감
--> 단, DEFAULT값이 부여되어 있다면 NULL이 아닌 DEFAULT값이 들어감

--------------------------------------------------------------------------------
--테이블 복제하기
CREATE TABLE EMPLOYEE_COPY
AS (SELECT * FROM MEMBER);

DROP TABLE EMPLOYEE_COPY;
--------------------------------------------------------------------------------

/*
    *테이블이 다 생성된 후에 뒤늦게 제약조건을 추가하는 방법
    ALTER TABLE 테이블명 변결할 내용
    -PRIMARY KEY : ALTER TABLE 테이블명 ADD PRIMARY KEY(컬럼명);
    -FOREIGN KEY : ALTER TABLE 테이블명 ADD FOREIGN KEY(컬럼명) REFERENCES 참조할 테이블명[(참조할 컬럼명)];
    -UNIQUE KEY : ALTER TABLE 테이블명 ADD UNIQUE(컬럼명);
    -CHECK KEY : ALTER TABLE 테이블명 ADD CHECK(컬럼에 대한 조건식);
    -NOT NULL : ALTER TABLE 테이블명 MODIFY 컬럼명 NOT NULL;
*/

--EMPLOYEE_COPY 테이블에 PRIMARY_KEY 제약조건 추가
CREATE TABLE EMPLOYEE_COPY
AS (SELECT * FROM EMPLOYEE);

ALTER TABLE EMPLOYEE_COPY ADD PRIMARY KEY(EMP_ID);

--EMPLOYEE 테이블에 DEPT_CODE에 외래키 제약조건 추가

ALTER TABLE EMPLOYEE ADD FOREIGN KEY(DEPT_CODE) REFERENCES DEPARTMENT(DEPT_ID);

--EMPLOYEE 테이블에 JOB_CODE에 외래키 제약조건 추가

ALTER TABLE EMPLOYEE ADD FOREIGN KEY(JOB_CODE) REFERENCES JOB(JOB_CODE);

--DEPARTMENT 테이블에 LOCATION_ID에 외래키 제약조건 추가

ALTER TABLE DEPARTMENT ADD FOREIGN KEY(LOCATION_ID) REFERENCES LOCATION(LOCAL_CODE);

