SELECT DATE(order_delivered_carrier_date) AS delivered_carrier_date
     , COUNT(order_id) AS orders
FROM olist_orders_dataset
WHERE DATE(order_delivered_carrier_date) LIKE '2017-01%'
  AND order_delivered_customer_date IS NULL
GROUP BY DATE(order_delivered_carrier_date)
HAVING COUNT(order_id) > 0
ORDER BY delivered_carrier_date;
