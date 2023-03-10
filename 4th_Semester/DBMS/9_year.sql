-- 9. Query to display Name and Hire Date of every Employee who was hired in 2020.

SELECT Ename, Hire_date
FROM EMPLOYEE
WHERE YEAR(Hire_date) = 2020;