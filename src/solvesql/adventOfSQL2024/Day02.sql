-- level 1
SELECT DISTINCT species, island
FROM penguins
GROUP BY island, species -- 각 서식지에 대해 / 펭귄의 종을 집계
ORDER BY island, species