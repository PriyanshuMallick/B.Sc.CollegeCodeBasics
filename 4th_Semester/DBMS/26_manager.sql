-- Query to display Name and Employee no. Along with their Manger's Name and the Manager's employee no; along with the Employees Name who do not have a manager.

SELECT e1.Ename, e1.Eno, COALESCE(e2.Ename, "No Manager") AS "Manager Name", COALESCE(e2.Eno, "No Manager") AS "Manager's Employee No."
FROM EMPLOYEE e1
LEFT JOIN EMPLOYEE e2 ON e1.Manager = e2.Eno
ORDER BY e1.Eno;
