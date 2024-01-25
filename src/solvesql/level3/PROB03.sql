SELECT
    SUB.region AS Region,
    SUM(
            CASE
                WHEN SUB.category = 'Furniture' THEN SUB.orderId
                END
        ) AS Furniture,
    SUM(
            CASE
                WHEN SUB.category = 'Office Supplies' THEN SUB.orderId
                END
        ) AS Office_Supplies,
    SUM(
            CASE
                WHEN SUB.category = 'Technology' THEN SUB.orderId
                END
        ) AS Technology
FROM
    (
        SELECT
            region,
            category,
            COUNT(DISTINCT order_id) AS orderId
        FROM
            records
        GROUP BY
            region,
            category
        ORDER BY region
    ) AS SUB
GROUP BY
    SUB.region;