SELECT
    M.mentee_id,
    M.mentee_name,
    T.mentor_id,
    T.mentor_name
FROM
    (
        SELECT
            e1.employee_id AS mentee_id,
            e1.name AS mentee_name,
            e1.department AS mentee_department
        FROM
            employees AS e1
        WHERE
            DATE(e1.join_date) BETWEEN '2021-10-01' AND '2021-12-31'
    ) AS M
        LEFT JOIN (
        SELECT
            e2.employee_id AS mentor_id,
            e2.name AS mentor_name,
            e2.department AS mentor_department
        FROM
            employees AS e2
        WHERE
                DATE(e2.join_date) <= '2019-12-31'
    ) AS T ON M.mentee_department != T.mentor_department
ORDER BY
    M.mentee_id,
    T.mentor_id;