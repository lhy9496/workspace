--전 사원의 사원명, 연봉(보너스 제외) 조회(연봉별 내림차순 정렬)
SELECT EMP_NAME, SALARY * 12
FROM EMPLOYEE
ORDER BY SALARY DESC;

--여사원들만 조회
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 2;

--남사원들만 조회
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 1;

--이메일 아이디부분만 추출
--사원목록에서 사원명, 이메일, 아이디 조회
SELECT EMP_NAME, EMAIL, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') - 1) AS "ID"
FROM EMPLOYEE;

--사원들의 사원명, 주민번호 조회(뒷자리는 2번째부터 *처리)
SELECT EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') AS "EMP_NO"
FROM EMPLOYEE;

--검색하고자 하는 내용
--JOB_CODE가 J7이거나 J6, SALARY값은 200만원 이상이며 BONUS가 있음
--여성이고 이메일 주소는 _앞에 3글자만 있는 사원
--위 조건을 만족하는 사원의 이름, 주민등록번호, 직급코드, 부서코드, 급여, 보너스를 조회
--정상적으로 조회되면 결과는 2개
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
WHERE (JOB_CODE = 'J6' OR JOB_CODE = 'J7') AND (SALARY >= 2000000)
        AND (BONUS IS NOT NULL) AND (SUBSTR(EMP_NO, 8, 1) = 2)
        AND (EMAIL LIKE '___\_%' ESCAPE '\');
-- 사원들의 사원명, 입사일, 근무일수, 근무개월수를 조회
SELECT EMP_NAME, HIRE_DATE, FLOOR(SYSDATE-HIRE_DATE) AS "근무일수"
        , CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS "근무개월수"
FROM EMPLOYEE;

--근로자 테이블에서 사원명, 입사일, 입사후 3개월의 날짜 조회(정규직 전환일)
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 3) AS "정규직 전환일"
FROM EMPLOYEE;

-- 사원테이블에서 사원명, 입사일, 입사달의 마지막 날짜, 입사달의 근무일수 조회
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE), FLOOR(LAST_DAY(HIRE_DATE) - HIRE_DATE)
FROM EMPLOYEE;

--사원의 사원명, 입사년도, 입사월, 입사일 조회
SELECT EMP_NAME
    , EXTRACT(YEAR FROM HIRE_DATE) AS "입사년도"
    , EXTRACT(MONTH FROM HIRE_DATE) AS "입사월"
    , EXTRACT(DAY FROM HIRE_DATE) AS "입사일"
FROM EMPLOYEE
ORDER BY 2, 3, 4;

--사원들의 사원명, 월금, 연봉 조회
SELECT EMP_NAME, TO_CHAR(SALARY, 'L99,999,999') AS "월급"
    , TO_CHAR(SALARY * 12, 'L99,999,999') AS "연봉"
FROM EMPLOYEE;

--사원들의 이름, 입사날짜(0000년, 00월, 00일) 조회
SELECT EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"')AS "입사날짜"
FROM EMPLOYEE;

-- 사원들의 사원명, 부서배치여부(배정완료, 미배정) 조회
SELECT EMP_NAME, NVL2(DEPT_CODE, '배정완료', '미배정') AS "부서배치여부"
FROM EMPLOYEE;

--사번, 사원명, 주민번호, 성별 조회
SELECT EMP_ID, EMP_NAME, EMP_NO,
        DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남성', '2', '여성') AS "성별"
FROM EMPLOYEE;

--직원의 성명, 기존 급여, 인상된 급여 조회 * 각 직급별로 인상해서 조회
-- J7인 사원은 10% 인상(SALARY *1.1)
-- J6는 15% 인상
-- J5는 20% 인상
-- 그 외에는 5% 인상
SELECT EMP_NAME, SALARY AS "인상 전 급여",
    DECODE(JOB_CODE, 'J7', (SALARY * 1.1), 'J6', (SALARY * 1.15),
    'J5', (SALARY * 1.2), (SALARY * 1.05)) AS "인상 후 급여"
FROM EMPLOYEE;

--직원의 성명, 급여, 직원의 급여에 따라 '고급', '중급', '초급'으로 분류해서 조회
--500만 이상이 고급, 250만 이상이 중급, 그 미만은 초급
SELECT EMP_NAME, SALARY,
    CASE
        WHEN SALARY >= 5000000 THEN '고급'
        WHEN SALARY >= 2500000 THEN '중급'
        WHEN SALARY < 2500000 THEN '초급'
    END AS "비고"
FROM EMPLOYEE;

--근로자테이블의 전 사원의 총 급여를 구해라
SELECT SUM(SALARY)
FROM EMPLOYEE;

--남사원들의 총 급여 합
SELECT SUM(SALARY)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 1;

--부서코드가 D5인 사원들의 총 연봉(급여 * 12)
SELECT SUM(SALARY * 12)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--전체 사원 수
SELECT COUNT(*)
FROM EMPLOYEE;

--여사원 수
SELECT COUNT(*)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 2;

--보너스를 받는 사원 수
SELECT COUNT(*)
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

--부서배치를 받은 사원 수
SELECT COUNT(*)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL;

--현재 사원들이 총 몇개의 부서에 분포되어 있는지 조회
SELECT COUNT(DISTINCT DEPT_CODE)
FROM EMPLOYEE;
