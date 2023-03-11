-- 22. Query to display Name, Department Name and Department No for all the employees.

SELECT e.Ename, d.Dname, d.Dno
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno;