-- Query to display Name, Dept No. And Salary of any employee whose department No. and salary matches both the department no. And the salary of any employee who earns a commission.

SELECT e.Ename, e.Dno, e.Salary
FROM EMPLOYEE e
WHERE e.Dno IN (
    SELECT Dno FROM EMPLOYEE WHERE Commission IS NOT NULL
) AND e.Salary IN (
    SELECT Salary FROM EMPLOYEE WHERE Commission IS NOT NULL
);