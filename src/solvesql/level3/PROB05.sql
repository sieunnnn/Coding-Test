SELECT
    DATE(D.order_purchase_timestamp) AS 'dt',
    COUNT(DISTINCT D.order_id) AS 'pu',
    SUM(O.payment_value) AS 'revenue_daily',
    ROUND(
                SUM(O.payment_value) / COUNT(DISTINCT D.order_id),
                2
        ) AS 'arppu'
FROM
    olist_orders_dataset AS D
        JOIN olist_order_payments_dataset AS O ON D.order_id = O.order_id
WHERE
        DATE(D.order_purchase_timestamp) >= '2018-01-01'
GROUP BY
    DATE(D.order_purchase_timestamp)
ORDER BY
    DATE(D.order_purchase_timestamp)