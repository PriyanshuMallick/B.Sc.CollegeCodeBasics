-- 14. Query to display Name of all employees either have two 'R's or have two 'A's in 
-- their name and are either in Dept No = 5 or their Manger‘s Employee No = 001.

SELECT Ename FROM EMPLOYEE 
WHERE (UPPER(Ename) LIKE '%A%A%' OR UPPER(Ename) LIKE '%R%R%')
AND (Dno = 5 OR Manager = 001);