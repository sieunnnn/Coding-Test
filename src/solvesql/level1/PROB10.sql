SELECT
    quartet,
    ROUND(AVG(x), 2) AS x_mean,
    ROUND((SUM(x*x) - SUM(x) * SUM(x) / COUNT(x)) / (COUNT(x) - 1), 2) AS x_var,
    ROUND(AVG(y), 2) AS y_mean,
    ROUND((SUM(y*y) - SUM(y) * SUM(y) / COUNT(y)) / (COUNT(y) - 1), 2) AS y_var
FROM
    points
GROUP BY
    quartet;