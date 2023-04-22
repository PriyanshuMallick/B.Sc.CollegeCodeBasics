-- 19. Query to display the following for each employee <E-Name> earns < Salary> 
-- monthly but wants < 3 * Current Salary >. Label the Column as Dream Salary.

SELECT CONCAT(Ename, ' earns ', Salary, ' monthly but wants ', 3 * Salary) AS 'Dream Salary'
FROM EMPLOYEE;
