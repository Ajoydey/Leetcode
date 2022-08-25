SELECT name FROM SalesPerson
WHERE sales_id NOT IN (SELECT DISTINCT sales_id FROM Orders
                       WHERE com_id in (SELECT com_id FROM Company 
                                       WHERE name = 'RED'))