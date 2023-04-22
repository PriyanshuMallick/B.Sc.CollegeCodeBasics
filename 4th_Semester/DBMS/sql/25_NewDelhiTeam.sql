-- 25. Query to display Name, Job, Department No. And Department Name for all the employees working at the New Delhi location.

SELECT e.Ename, e.Job_type, e.Dno AS "Department No.", d.Dname AS "Department Name"
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno
WHERE d.Location = "New Delhi";