--모든 사원의 정보 열람
SELECT *
FROM EMPLOYEE;

--모든 사원의 이름, 주민번호, 전화번호만 열람
SELECT EMP_NAME, EMP_NO, PHONE
FROM EMPLOYEE;

--DEPARTMENT 테이블의 모든 컬럼 조회
SELECT *
FROM DEPARTMENT;

--DEPARTMENT 테이블의 부서코드, 부서명 조회
SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT;

--EMPLOYEE 테이블의 사원명, 이메일, 전화번호, 입사일, 급여 조회
SELECT EMP_NAME, EMAIL, PHONE, HIRE_DATE, SALARY
FROM EMPLOYEE;

-- EMPLOYEE 테이블의 사원명, 사원의 연봉(SALARY * 12)을 조회
SELECT EMP_NAME, SALARY * 12
FROM EMPLOYEE;

-- EMPLOYEE 테이블의 사원명, 급여, 보너스, 연봉, 보너스포함 연봉 조회(급여 + (급여 * 보너스)) * 12
SELECT EMP_NAME, SALARY, BONUS, SALARY * 12 AS "연봉", (SALARY + (SALARY * BONUS)) * 12 AS "보너스 포함 연봉"
FROM EMPLOYEE;

--EMPLOYEE 테이블의 사번, 사원명, 급여
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE;

--사번, 이름, 급여를 하나의 컬럼으로 조회
SELECT EMP_ID || EMP_NAME || SALARY
FROM EMPLOYEE;

-- 다음과 같이 결과가 나오도록 출력하라.
-- XX의 월급은 XX원입니다.
SELECT EMP_NAME || '의 월급은 ' || SALARY || '원입니다.'
FROM EMPLOYEE;

--EMPLOYEE 직급코드 조회
SELECT DISTINCT JOB_CODE
FROM EMPLOYEE;

--EMPLOYEE 부서코드 조회(중복 제거)
SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

--급여가 350만원 이상, 600만원 이하인 모든 사원의 사원명, 사번, 급여조회
SELECT EMP_NAME, EMP_ID, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3500000 AND SALARY <= 6000000;

--급여가 350만원 미만, 600만원 초과인 모든 사원의 사원명, 사번, 급여조회
SELECT EMP_NAME, EMP_ID, SALARY
FROM EMPLOYEE
WHERE SALARY <= 3500000 OR SALARY >= 6000000;

--입사일이 '90/01/01' ~ '01/01/01' 사원을 전체 조회
SELECT *
FROM EMPLOYEE
WHERE HIRE_DATE >= '90/01/01' AND HIRE_DATE <= '01/01/01';

--사원들 중에서 성이 전씨인 사원들의 사원명, 급여, 입사일 조회
SELECT EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '전%';

--사원들 중에서 이름에 '하'라는 글자가 포함된 사원의 이름, 전화번호 목록을 조회
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%하%';

--사원들 중에서 이름에 중간 글자가 '하'인 사원의 이름, 전화번호 목록을 조회
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '_하_';

--전화번호의 3번째 자리가 1인 사원들의 사번, 사원명, 전화번호 조회
SELECT EMP_ID, EMP_NAME, PHONE
FROM EMPLOYEE
WHERE PHONE LIKE '__1%';

--이메일 중 _앞글자가 3글자인 사원들의 사번, 이름, 이메일 조회
SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___\_%' ESCAPE '\';

-- 위 사원들이 아닌 그 외의 사원들을 조회하고 싶을 때(컬럼 동일)
SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL NOT LIKE '___\_%' ESCAPE '\';

--실습==========================================================================

-- 1. 이름이 '연'으로 끝나는 사원들의 사원명, 입사일조회
SELECT EMP_NAME, HIRE_DATE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%연';

-- 2. 전화번호 처음 3자리가 '010'이 아닌 사원들의 사원명 전화번호 조회
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE PHONE NOT LIKE '010%';

-- 3. 이름에 '하'가 포함되어있고 급여가 240만원 이상인 사원들의 사원명, 급여 조회
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY >= 2400000;

-- 4. 부서테이블에서 해외영업부인 부서들의 부서코드, 부서명 조회
SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT
WHERE DEPT_TITLE LIKE '해외%';

--==============================================================================


--부서코드가 D6이거나 D8이거나 D5인 부서원들의 이름, 부서코드, 급여 조회
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE LIKE 'D6' OR DEPT_CODE LIKE 'D8' OR DEPT_CODE LIKE 'D5';

--보너스를 받지 않는 사원들의 사번, 이름, 급여, 보너스 조회
SELECT EMP_ID,  EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NULL;

--보너스를 받는 사원들의 사번, 이름, 급여, 보너스 조회
SELECT EMP_ID,  EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

--사수가 없는 사원들의 사원명, 사수사번, 부서코드, 조회
SELECT EMP_NAME, MANAGER_ID, DEPT_CODE
FROM EMPLOYEE
WHERE MANAGER_ID IS NULL;

--부서배치를 아직 받지 않았고 보너스를 받은 사원들의 이름, 보너스, 부서코드를 조회
SELECT EMP_NAME , BONUS, DEPT_CODE
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL AND BONUS IS NOT NULL;

--직급코드가 J7이거나 J2인 사원들 중에 급여가 200만원 이상인 사원들의 모든 컬럼 조회
SELECT *
FROM EMPLOYEE
WHERE (JOB_CODE LIKE 'J7' OR JOB_CODE  LIKE 'J2') AND SALARY >= 2000000;

--실습==========================================================================

--1. 사수가 없고 부서배치도 받지 않은 사원들의 사원명, 사번, 부서코드 조회
SELECT EMP_NAME, EMP_ID, DEPT_CODE
FROM EMPLOYEE
WHERE MANAGER_ID IS NULL AND DEPT_CODE IS NULL;

--2. 연봉(보너스 미포함)이 3천만원 이상, 보너스를 받지 않는 사원들의 사번, 사원명, 급여, 보너스 조회
SELECT EMP_ID, EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE SALARY * 12 >= 30000000 AND BONUS IS NULL;

--3. 입사일이 '95/01/01' 이상이고 부서배치를 받지 않은 사원들의 사번, 사원명, 입사일, 부서코드 조회
SELECT EMP_ID, EMP_NAME, HIRE_DATE, DEPT_CODE
FROM EMPLOYEE
WHERE HIRE_DATE >= '95/01/01' AND DEPT_CODE IS NULL;

--4. 급여가 200만원 이상, 500만원 이하인 사원 중에서 입사일이 '01/01/01' 이상이고
--   보너스를 받지 않는 사원들의 사번, 사원명, 급여, 입사일, 보너스 조회
SELECT EMP_ID, EMP_NAME, SALARY, HIRE_DATE, BONUS
FROM EMPLOYEE
WHERE SALARY >= 2000000 AND SALARY <= 5000000 AND  (HIRE_DATE >= '01/01/01') AND (BONUS IS NULL);

--5. 보너스를 포함한 연봉이 NULL이 아니고, 이름에 '하'가 포함된 사원들의 사번, 사원명, 급여, 보너스 포함 연봉 조회
SELECT EMP_ID, EMP_NAME, SALARY, (SALARY + (SALARY * BONUS)) * 12 AS "보너스 포함 연봉"
FROM EMPLOYEE
WHERE BONUS IS NOT NULL AND EMP_NAME LIKE '%하%';


