-- 10. Query to display Name and Job of all employees who don‘t have a current Manager.

SELECT Ename, Job_type
FROM EMPLOYEE
WHERE Manager IS NULL;