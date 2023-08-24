SELECT surname 
FROM (
  SELECT surname, ROW_NUMBER() OVER (ORDER BY experience DESC) as row_num
  FROM employees
) as sorted_employees
WHERE row_num = 2;