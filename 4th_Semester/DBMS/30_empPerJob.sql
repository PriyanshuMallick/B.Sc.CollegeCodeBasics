-- 30. Query to display the number of employees performing the same Job type functions.

SELECT Job_type, COUNT(*) AS "No of Employees" 
FROM EMPLOYEE
GROUP BY Job_type;