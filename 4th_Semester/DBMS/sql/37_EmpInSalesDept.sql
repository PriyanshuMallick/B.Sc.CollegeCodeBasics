-- 37. Query to display the department no, name and job for all employees in the Development department.

SELECT d.Dno, d.Dname, e.Job_type
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno
WHERE d.Dname = 'Development';
