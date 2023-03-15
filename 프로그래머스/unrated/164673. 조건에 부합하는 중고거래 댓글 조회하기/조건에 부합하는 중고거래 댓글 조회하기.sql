-- 코드를 입력하세요
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD as b, USED_GOODS_REPLY as r
WHERE b.BOARD_ID = r.BOARD_ID
AND YEAR(b.CREATED_DATE) = 2022
AND MONTH(b.CREATED_DATE) = 10
ORDER BY CREATED_DATE, b.TITLE;