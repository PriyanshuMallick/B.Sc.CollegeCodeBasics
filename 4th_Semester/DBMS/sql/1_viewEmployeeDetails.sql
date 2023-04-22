-- 1. Query to display Employee Name, Job, Hire Date, Employee Number; for each 
-- employee with the Employee Number appearing first.

SELECT Eno, Ename, Job_type, Hire_date
From EMPLOYEE
ORDER BY Eno;