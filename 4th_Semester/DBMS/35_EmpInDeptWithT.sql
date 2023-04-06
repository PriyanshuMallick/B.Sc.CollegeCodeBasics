-- 35. Query to display Employee Number and Name for all employees who work
-- in a department with any employee whose name contains a 'T'.

SELECT Eno, Ename
FROM EMPLOYEE
WHERE Dno IS NOT NULL AND Ename LIKE '%t%' OR Ename LIKE '%T%';