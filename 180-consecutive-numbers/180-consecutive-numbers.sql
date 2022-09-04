SELECT DISTINCT num AS ConsecutiveNums FROM Logs a
WHERE 
num = (SELECT num FROM Logs b WHERE a.id = b.id+1)
AND
num = (SELECT num FROM Logs c WHERE a.id = c.id+2)
