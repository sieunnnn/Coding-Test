SELECT day, ROUND(SUM(tip), 3) AS tip_daily
FROM tips
GROUP BY day
ORDER BY tip_daily DESC
LIMIT 1