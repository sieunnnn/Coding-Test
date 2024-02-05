SELECT
    order_date,
    COUNT(
            DISTINCT (
        CASE
            WHEN category = 'Furniture' THEN order_id
            END
        )
        ) AS 'furniture',
    ROUND(
                    COUNT(
                            DISTINCT (
                        CASE
                            WHEN category = 'Furniture' THEN order_id
                            END
                        )
                        ) * 100.0 / COUNT(DISTINCT order_id),
                    2
        ) AS 'furniture_pct'
FROM
    records
GROUP BY
    order_date
HAVING
        COUNT(DISTINCT order_id) >= 10
   AND furniture_pct >= 40
ORDER BY
    furniture_pct DESC,
    order_date