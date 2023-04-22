-- 21. Query to display Name, Hire Date and Day of the week on which the employee started.

SELECT Ename, Hire_date, DAYNAME(Hire_date) AS 'Start Day'
FROM EMPLOYEE;