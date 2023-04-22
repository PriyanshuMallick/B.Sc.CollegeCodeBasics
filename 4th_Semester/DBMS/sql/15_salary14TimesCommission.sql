-- 15. Query to display Name, Salary and Commission for all employees whose Commission 
-- Amount is 14 greater than their Salary increased by 5%

SELECT Ename, Salary, Commission
FROM EMPLOYEE
WHERE Commission = (Salary * 1.05) + 14;