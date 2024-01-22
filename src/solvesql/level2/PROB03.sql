SELECT event_date_kst AS dt
     , COUNT(DISTINCT user_pseudo_id) AS users
FROM ga
GROUP BY event_date_kst
HAVING event_date_kst >= '2021-08-02'
   AND event_date_kst <= '2021-08-09'
ORDER BY event_date_kst