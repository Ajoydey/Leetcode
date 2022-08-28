CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT DISTINCT Salary FROM Employee AS a
      WHERE N=(SELECT COUNT(DISTINCT Salary) FROM Employee AS b
              WHERE a.Salary<=b.Salary)
      
  );
END