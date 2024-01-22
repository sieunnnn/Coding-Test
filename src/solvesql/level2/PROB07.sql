SELECT DATE(D.order_purchase_timestamp) AS dt
     , ROUND(SUM(P.payment_value), 2) AS revenue_daily
FROM olist_orders_dataset AS D
         JOIN olist_order_payments_dataset AS P
              ON D.order_id = P.order_id
GROUP BY DATE(D.order_purchase_timestamp)
HAVING D.order_purchase_timestamp >= '2018-01-01'
ORDER BY dt
