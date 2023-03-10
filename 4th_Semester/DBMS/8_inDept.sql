-- 8. Query to display Employee Name and Department No. of all the employees in Dept 
-- 105 and Dept 103 in the alphabetical order by name.

SELECT Ename, Dno
FROM EMPLOYEE
WHERE Dno = 105 OR Dno = 103;