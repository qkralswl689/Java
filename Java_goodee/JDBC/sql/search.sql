-- 검색

--- 검색 키워드(필드) : ex) "이름"  -> member_name (치환)
--- 유사/동등 검색 여부
--- 연산에 따른 연산자 구별(like(유사), =(동등)) 
--- 검색어 처리 : 유사/동등 검색에 따라 다름
--- 페이지 당 레코드(행) 수
--- 현재 페이지

SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_name like '%순%'
             ORDER BY member_id ASC  
           ) m    
      )    
WHERE page = 1;


SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_name = '홍길동'
             ORDER BY member_id DESC 
           ) m    
      )    
WHERE page = 1;

SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_birth = TO_DATE('1990-01-02')
             ORDER BY member_id DESC 
           ) m    
      )    
WHERE page = 1;

SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_birth like '%' || TO_DATE('1990-01-02') || '%' 
             ORDER BY member_id DESC 
           ) m    
      )    
WHERE page = 1;


SELECT TO_CHAR(member_joindate, 'YYYY-MM-DD') FROM member;


SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE TO_CHAR(member_joindate, 'YYYY-MM-DD') = TO_DATE('2021-03-16') 
             ORDER BY member_id DESC 
           ) m    
      )    
WHERE page = 1;


SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_joindate like '%' || TO_DATE('2021-03-16') || '%' 
             ORDER BY member_id DESC 
           ) m    
      )    
WHERE page = 1;