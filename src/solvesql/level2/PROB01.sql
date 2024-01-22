SELECT DISTINCT athlete_id
FROM events AS E
         JOIN records AS R
              ON E.id = R.event_id
WHERE E.sport LIKE 'golf'