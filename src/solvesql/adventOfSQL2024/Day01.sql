-- level 1
SELECT DISTINCT game_id, name, year
FROM games
WHERE name LIKE '%Christmas%' OR name LIKE '%Santa%'
    AND year >= 1980 AND year <= 2016;
