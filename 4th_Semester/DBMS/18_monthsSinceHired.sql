-- 18. Query to display Name and calculate the number of months between today and the 
-- date each employee was hired

SELECT Ename, TIMESTAMPDIFF(MONTH, Hire_date, CURDATE()) AS "Months Since Hired"
FROM Employee;
