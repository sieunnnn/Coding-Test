SELECT
    DATE(order_purchase_timestamp) AS 'purchase_date',
    COUNT(
            CASE
                WHEN order_estimated_delivery_date > order_delivered_customer_date THEN order_id
                END
        ) AS 'success',
    COUNT(
            CASE
                WHEN order_estimated_delivery_date < order_delivered_customer_date THEN order_id
                END
        ) AS 'fail'
FROM
    olist_orders_dataset
WHERE
        DATE(order_purchase_timestamp) LIKE '2017-01%'
GROUP BY
    DATE(order_purchase_timestamp)