-- 17. Query to display Name, Hire Date and Salary Review Date which is the 1st Monday 
-- after six months of employment.

SELECT Ename, Hire_date, Salary,
DATE_ADD(DATE_ADD(Hire_date, INTERVAL 6 MONTH), 
INTERVAL (CASE WHEN DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) = 1 THEN 1
               WHEN DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) = 7 THEN 2
               ELSE 8 - DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) END) DAY) AS "Salary Review Date"
FROM EMPLOYEE;