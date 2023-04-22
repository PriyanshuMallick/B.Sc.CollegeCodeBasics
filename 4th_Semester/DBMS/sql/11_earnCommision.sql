-- 11. Query to display the Name, Salary and Commission for all the employees who earn 
-- commission.

SELECT Ename, Job_type
FROM EMPLOYEE
WHERE Commission IS NOT NULL;