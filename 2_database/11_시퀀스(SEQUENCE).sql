/*
    <시퀀스 SEQUENCE>
    자동으로 번호를 발생시켜주는 역할을 하는 객체
    정수값을 순차적으로 일정 값씩 증가시키면서 생성해줌
    
    EX) 회원번호, 사원번호, 게시글번호...
    
    [표현식]
    CREATE SQUENCE 시퀀스명
    [START WITH 시작숫자] --> 처음 발생시킬 시작값 지정[기본값 1]
    [INCREMENT BY 숫자] --> 증가하는 값 지정[기본값 1]
    [MAXVALUE 숫자] --> 최대값 지정[기본값 매우 큰 수]
    [MINIVALUE 숫자] --> 최소값 지정[기본값 1]
    [CYCLE | NOCYCLE] --> 값의 순환여부 지정 [기본값 NOCYCLE]
    [NOCACHE | CACHE 바이트크기] --> 캐시메모리 할당(기본값 CACHE 20)
    
    *캐시메모리 : 미리 발생될 값들을 생성해서 저장해두는 공간
                매번 호출될 때마다 새로 번호를 생성하는 게 아니라
                캐시메모리 공간에 미리 생성된 값들을 가져다 쓸 수 있다(속도가 빨라짐).
    
    테이블명 : TB_
    뷰명 : VW_
    시퀀스 : SEQ_
    트리거 : TRG_
*/

CREATE SEQUENCE SEQ_TEST;

--[참고] 현재 계정이 소유하고 있는 시퀀스들의 구조를 보고자 할 때
SELECT * FROM USER_SEQUENCES;

CREATE SEQUENCE SEQ_EMPNO
START WITH 300
INCREMENT BY 5
MAXVALUE 310
NOCYCLE
NOCACHE;

/*
    2. 시퀀스 사용
    
    시퀀스명.CURRVAL : 현재 시퀀스값(마지막으로 성공한 NEXTVAL의 값)
    시퀀스명.NEXTVAL : 시퀀스값에 일정값을 증가시켜 발생한 값
                      현재 시퀀스값에서 INCREMENT BY 값만큼 증가된 값
*/

SELECT * FROM USER_SEQUENCES;

SELECT SEQ_EMPNO.CURRVAL FROM DUAL; --에러
--> NEXTVAL를 한번도 수행하지 않은 이상 CURRVAL은 실행할 수 없음
--> CURRVAL은 마지막으로 성공한 NEXTVAL의 값을 저장하는 임시값
SELECT SEQ_EMPNO.NEXTVAL FROM DUAL; --300
SELECT SEQ_EMPNO.CURRVAL FROM DUAL; --300

SELECT SEQ_EMPNO.NEXTVAL FROM DUAL; --305
SELECT SEQ_EMPNO.NEXTVAL FROM DUAL; --310

SELECT SEQ_EMPNO.CURRVAL FROM DUAL; --310

SELECT * FROM USER_SEQUENCES;
SELECT SEQ_EMPNO.NEXTVAL FROM DUAL; --최대값(310) 초과로 오류 발생

/*
    3. 시퀀스의 구조변경
    
    ALTER SEQUENCE 시퀀스명
    [INCREMENT BY 숫자] --> 증가하는 값 지정[기본값 1]
    [MAXVALUE 숫자] --> 최대값 지정[기본값 매우 큰 수]
    [MINIVALUE 숫자] --> 최소값 지정[기본값 1]
    [CYCLE | NOCYCLE] --> 값의 순환여부 지정 [기본값 NOCYCLE]
    [NOCACHE | CACHE 바이트크기] --> 캐시메모리 할당(기본값 CACHE 20)
    
    *START WITH는 변경 불가
*/

ALTER SEQUENCE SEQ_EMPNO
INCREMENT BY 10
MAXVALUE 400;

SELECT SEQ_EMPNO.NEXTVAL FROM DUAL;

--4. 시퀀스 삭제
DROP SEQUENCE SEQ_EMPNO;

--------------------------------------------------------------------------------
CREATE SEQUENCE SEQ_EID
START WITH 400
NOCACHE;

INSERT INTO EMPLOYEE(EMP_ID, EMP_NAME, EMP_NO,JOB_CODE ,HIRE_DATE)
    VALUES(SEQ_EID.NEXTVAL, '이을용', '111111-2222222', 'J6', SYSDATE);

INSERT INTO EMPLOYEE(EMP_ID, EMP_NAME, EMP_NO,JOB_CODE ,HIRE_DATE)
    VALUES(SEQ_EID.NEXTVAL, '김병호', '111111-2222222', 'J6', SYSDATE);

SELECT * FROM EMPLOYEE;