SELECT
    A.artist_id,
    A.name
FROM
    artists AS A
        LEFT JOIN
    artworks_artists AS AA ON A.artist_id = AA.artist_id
WHERE
    A.death_year IS NOT NULL
  AND AA.artwork_id IS NULL
GROUP BY
    A.artist_id;
