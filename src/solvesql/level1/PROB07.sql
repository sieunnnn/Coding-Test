SELECT ROUND(AVG(daily_sales), 2) as avg_sales
FROM (
         SELECT day, SUM(total_bill) as daily_sales
         FROM tips
         GROUP BY day
     ) as daily_totals;
