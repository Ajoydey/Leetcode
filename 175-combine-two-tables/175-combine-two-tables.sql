SELECT a.firstName, a.lastName, b.city, b.state FROM Person as a
LEFT OUTER JOIN Address as b
ON a.personId = b.personId
GROUP BY a.personId
