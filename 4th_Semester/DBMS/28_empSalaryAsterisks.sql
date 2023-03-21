-- 28. Query to display Name and Salaries represented by asterisks, where each asterisk (\*) signifies $100.

SELECT Ename, CONCAT(REPEAT('*', FLOOR(Salary/100))) AS Salary
FROM EMPLOYEE;