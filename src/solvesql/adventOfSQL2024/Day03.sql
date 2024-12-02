-- level1
SELECT title
FROM film
WHERE (
    rating = 'R'
        OR rating = 'NC-17'
    )
  AND (
    title NOT LIKE '%A'
        AND title NOT LIKE '%E'
        AND title NOT LIKE '%I'
        AND title NOT LIKE '%O'
        AND title NOT LIKE '%U'
    )
