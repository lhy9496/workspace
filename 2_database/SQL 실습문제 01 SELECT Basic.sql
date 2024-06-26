--1. 학과이름, 계열 표시
SELECT DEPARTMENT_NAME AS "학과 명", CATEGORY AS "계열"
FROM TB_DEPARTMENT;

--2. 학과 정원 출력
SELECT DEPARTMENT_NAME || '의 정원은 ' || CAPACITY || '명 입니다.' AS "학과별 정원"
FROM TB_DEPARTMENT;

--3. 국어국문학과 휴학중인 여학생
SELECT DEPARTMENT_NAME, DEPARTMENT_NO
FROM TB_DEPARTMENT; --국어국문학과 학과코드 : 001

SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE DEPARTMENT_NO = 001 AND ABSENCE_YN = 'Y' AND SUBSTR(STUDENT_SSN, 8, 1) IN (2, 4);

--4. 대출 도서 장기 연체자들을 출력
SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A513079', 'A513090', 'A513091', 'A513110', 'A513119');

--5. 입학정원이 20~30명인 학과들의 학과 이름, 계열 출력
SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT
WHERE CAPACITY >= 20 AND CAPACITY <=30;

--6. 총장의 이름을 알아내는 SQL(총장은 소속학과 없음)
SELECT PROFESSOR_NAME
FROM TB_PROFESSOR
WHERE DEPARTMENT_NO IS NULL;

--7. 학과가 지정되지 않은 학생의 존재 여부 확인
SELECT STUDENT_NAME, DEPARTMENT_NO
FROM TB_STUDENT
WHERE DEPARTMENT_NO IS NULL;

--8. 선수과목이 존재하는 과목들의 번호 조회
SELECT CLASS_NO
FROM TB_CLASS
WHERE PREATTENDING_CLASS_NO IS NOT NULL;

--9. 계열 조회
SELECT CATEGORY
FROM TB_DEPARTMENT
GROUP BY CATEGORY;

--10. 02학번 전주에 거주하는 재학생
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_SSN
FROM TB_STUDENT
WHERE (EXTRACT(YEAR FROM ENTRANCE_DATE) = 2002)
        AND ABSENCE_YN = 'N'
        AND STUDENT_ADDRESS LIKE '%전주%';       