/*
    <VIEW 뷰>
    
    SELECT문(쿼리문)을 저장해둘 수 있는 객체
    (자주 사용하는 SELECT문을 저장해두면 SELECT문을 매번 다시 기술할 필요가 없다.)
    임시테이블 같은 존재(실제 데이터가 담겨있는 건 아님 -> 논리적인 테이블)
*/

--한국에서 근무하는 사원들의 사번, 이름, 부서명, 급여, 근무 국가명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING (NATIONAL_CODE)
WHERE NATIONAL_NAME LIKE '한국';

--일본에서 근무하는 사원들의 사번, 이름, 부서명, 급여, 근무 국가명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING (NATIONAL_CODE);


--------------------------------------------------------------------------------
/*
    1. VIEW 생성 방법
    
    [표현식]
    CREATE VIEW 뷰명
    AS 서브쿼리
*/
-- TB_
-- VW_

--VIEW를 만들 권한 부여(관리자 접속 필수)
GRANT CREATE VIEW TO KH;

CREATE VIEW VW_EMPLOYEE
AS  SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
    FROM EMPLOYEE
    JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
    JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE)
    JOIN NATIONAL USING (NATIONAL_CODE);
    
SELECT * FROM VW_EMPLOYEE;

--실제 실행되는 것은 사실상 아래와 같음

SELECT *
FROM(SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
    FROM EMPLOYEE
    JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
    JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE)
    JOIN NATIONAL USING (NATIONAL_CODE));

--러시아에서 근무하는 사원들의 사번, 이름, 부서명, 급여, 근무 국가명 조회
SELECT *
FROM VW_EMPLOYEE
WHERE NATIONAL_NAME = '러시아';

--일본에서 근무하는 사원들의 사번, 이름, 부서명, 급여, 근무 국가명 조회
SELECT *
FROM VW_EMPLOYEE
WHERE NATIONAL_NAME = '일본';

--뷰 생성 또는 덮어씌우기
CREATE OR REPLACE VIEW VW_EMPLOYEE
AS  SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
    FROM EMPLOYEE
    JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
    JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE)
    JOIN NATIONAL USING (NATIONAL_CODE);
    
--------------------------------------------------------------------------------
/*
    * 뷰 컬럼에 별칭 부여
    서브쿼리의 SELECT절에 함수식이나 산술연산식이 기술되어 있을 경우, 반드시 별칭을 지정해야 한다.
*/

CREATE OR REPLACE VIEW VW_EMP_JOB(사번, 이름, 직급명, 성별, 근무년수)
AS SELECT   EMP_ID, EMP_NAME, JOB_NAME,
            DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남', '2', '여') AS "성별",
            EXTRACT(YEAR FROM SYSDATE) - EXTRACT(YEAR FROM HIRE_DATE) AS "근무년수"
            FROM EMPLOYEE
            JOIN JOB USING(JOB_CODE);

SELECT * 
FROM VW_EMP_JOB
WHERE 근무년수 >= 20;

--뷰를 삭제(DROP)
DROP VIEW VW_EMP_JOB;

--------------------------------------------------------------------------------
--생성된 뷰를 통해서 DML(INSERT, UPDATE, DELETE) 사용 가능
--뷰를 통해서 조작 - > 실제 데이터에 반영

CREATE OR REPLACE VIEW VW_JOB
AS SELECT * FROM JOB;

SELECT * FROM VW_JOB;
SELECT * FROM JOB;

--뷰를 통해서 INSERT
INSERT INTO VW_JOB VALUES('J8', '인턴');

--뷰를 통해서 UPDATE
UPDATE VW_JOB
SET JOB_NAME = '알바'
WHERE JOB_CODE = 'J8';

--------------------------------------------------------------------------------
/*
    *DML 명령어로 조작이 불가능한 경우.
    1) 뷰에 정의되어 있지 않은 컬럼을 조작하려 하는 경우
    2) 뷰에 정의되어 있지 않은 컬럼 중 베이스테이블에 있는 컬럼이 NOT NULL 제약조건을 가진 경우
    3) 산술연산식 또는 함수식으로 정의되어 있는 경우
    4) 그룹함수나 GROUP BY절이 포함된 경우
    5) DISTINCT 구문이 포함된 경우
    6) JOIN을 이용해서 여러 테이블을 연결시켜놓은 경우
*/

/*
    VIEW 옵션
    
    [상세표현식]
    CREATE [OR REPLACE] [FORCE|NOFORCE] VIEW 뷰명
    AS 서브쿼리
    [WITH CHECK OPTION]
    [WITH READ ONLY]
    
    1) OR REPLACE : 기존에 동일한 뷰가 있을 경우 갱신, 없으면 새로 생성
    2) FORCE | NOFORCE
        > FORCE : 서브쿼리에 기술된 테이블이 존재하지 않아도 뷰가 생성되게 함
        > NOFORCE : 서브쿼리에 기술된 테이블이 존재하는 테이블이어야만 뷰가 생성(기본값)
    3) WITH CHECK OPTION : DML시 서브쿼리에 기술된 조건에 부합한 값으로만 DML이 가능하도록
    4) WITH READ ONLY : 뷰에 대해서 조회만 가능하도록
*/

--2) FORCE | NOFORCE
CREATE OR REPLACE NOFORCE VIEW VW_EMP
AS SELECT TCODE, TNAME, TCONTENT
    FROM TT;
--당연히 오류 발생

--서브쿼리에 기술된 테이블이 존재하지 않아도 뷰가 우선은 생성됨
CREATE OR REPLACE FORCE VIEW VW_EMP
AS SELECT TCODE, TNAME, TCONTENT
    FROM TT;
    
SELECT * FROM VW_EMP;
--테이블이 존재하지 않으므로 조회 불가능 -> 테이블이 생성되어야 함

CREATE TABLE TT(
    TCODE NUMBER,
    TNAME VARCHAR2(20),
    TCONTENT VARCHAR2(30)
);

SELECT * FROM VW_EMP;

--3)WITH CHECK OPTION : 서브쿼리에 기술된 조건에 부합하지 않는 값으로 수정시 오류 발생
CREATE OR REPLACE FORCE VIEW VW_EMP
AS SELECT *
    FROM EMPLOYEE
    WHERE SALARY >= 3000000;

SELECT * FROM VW_EMP;

--200번사원 급여를 200만원으로 변경(WHERE SALARY >= 3000000 조건에 맞지 않는 변경)
UPDATE VW_EMP
SET SALARY = 2000000
WHERE EMP_ID = 200;

ROLLBACK;

CREATE OR REPLACE VIEW VW_EMP
AS SELECT *
    FROM EMPLOYEE
    WHERE SALARY >= 3000000
WITH CHECK OPTION;

--200번사원 급여를 200만원으로 변경(WHERE SALARY >= 3000000 조건에 맞지 않는 변경)
--CHECK OPTION에 의해 막힘
UPDATE VW_EMP
SET SALARY = 2000000
WHERE EMP_ID = 200;

--4) WITH READ ONLY : 뷰에 대해 조회만 가능하도록
CREATE OR REPLACE VIEW VW_EMP
AS SELECT EMP_ID, EMP_NAME, BONUS
    FROM EMPLOYEE
    WHERE BONUS IS NOT NULL
    WITH READ ONLY;

SELECT * FROM VW_EMP;

DELETE
FROM VW_EMP
WHERE EMP_ID = 200;
--조회만 가능해서 수정 불가

