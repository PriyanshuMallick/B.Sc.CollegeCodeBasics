-- 36. Query to display the names and salaries of all employees who report to 'Divya Mishra'.

SELECT Ename, Salary
FROM EMPLOYEE
WHERE Manager = (
    SELECT Eno
    FROM EMPLOYEE
    WHERE Ename = 'Divya Mishra'
);