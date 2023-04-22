-- 23. Query to display Unique Listing of all Jobs that are in Department 101.

SELECT DISTINCT e.Job_type
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno
WHERE e.Dno = 101;