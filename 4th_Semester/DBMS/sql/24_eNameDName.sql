-- 24. Query to display Name, Dept Name of all employees who have an 'A' in their name.

SELECT e.Ename, d.Dname
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno
WHERE UPPER(Ename) LIKE '%A%';