SELECT
    A.name
FROM
    athletes AS A
WHERE
        A.id IN (
        SELECT
            R.athlete_id
        FROM
            records AS R
                JOIN games AS G ON R.game_id = G.id
                JOIN teams AS T ON R.team_id = T.id
        WHERE
                G.year >= 2000
          AND R.medal IS NOT NULL
        GROUP BY
            R.athlete_id
        HAVING
                COUNT(DISTINCT T.team) >= 2
    )
ORDER BY
    A.name;