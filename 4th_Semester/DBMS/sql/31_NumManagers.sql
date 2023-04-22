-- 31. Query to display the no. of managers without listing their names.

SELECT COUNT(*) AS "No. of Managers"
FROM EMPLOYEE
WHERE Eno = Manager;