SELECT c.name AS country_name, SUM(g.goals) AS total_goals
FROM country c
JOIN goals g ON c.id = g.country_id
GROUP BY c.name, c.id
ORDER BY total_goals DESC, c.id ASC;