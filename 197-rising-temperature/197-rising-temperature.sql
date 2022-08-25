SELECT a.id FROM Weather AS a
WHERE temperature > (SELECT temperature FROM Weather as b WHERE datediff(a.recordDate, b.recordDate) = 1)