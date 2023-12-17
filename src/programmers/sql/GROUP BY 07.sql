SELECT B.AUTHOR_ID
     , AUTHOR_NAME
     , CATEGORY
     , SUM(SALES * PRICE) AS TOTAL_SALES
FROM BOOK AS B
         JOIN AUTHOR AS A
              ON B.AUTHOR_ID = A.AUTHOR_ID
         JOIN BOOK_SALES AS S
              ON B.BOOK_ID = S.BOOK_ID
WHERE S.SALES_DATE LIKE '2022-01%'
GROUP BY AUTHOR_ID, CATEGORY
ORDER BY AUTHOR_ID, CATEGORY DESC