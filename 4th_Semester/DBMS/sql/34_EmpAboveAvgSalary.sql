-- 34. Query to display the Employee No. And Name for all employees who earn more than the average salary.

SELECT Eno, Ename
FROM EMPLOYEE
WHERE Salary > (SELECT AVG(Salary) FROM EMPLOYEE);