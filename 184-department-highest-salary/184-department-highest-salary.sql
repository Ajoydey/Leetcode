SELECT d.name AS Department, e.name AS Employee, e.Salary FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE e.Salary IN (SELECT MAX(Salary) FROM Employee f WHERE f.departmentID=e.departmentID)
