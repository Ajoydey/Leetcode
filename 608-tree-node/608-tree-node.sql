# Write your MySQL query statement below
SELECT id,
CASE
    WHEN p_id IS null THEN 'Root'
    WHEN id IN (SELECT p_id FROM Tree) THEN 'Inner'
    ElSE 'Leaf'
END
AS Type
FROM Tree
ORDER BY id
