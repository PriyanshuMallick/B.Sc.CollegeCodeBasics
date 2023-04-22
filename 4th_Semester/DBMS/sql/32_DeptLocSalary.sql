-- 32. Query to display the Department Name, Location Name,
-- No. of Employees and the average salary for all employees in that department.

SELECT d.Dname, d.Location, COUNT(e.Eno) AS "No. of Employees", AVG(e.Salary) AS "Avg Salary"
FROM EMPLOYEE e
LEFT JOIN DEPARTMENT d ON e.Dno = d.Dno
GROUP BY d.Dname, d.Location;