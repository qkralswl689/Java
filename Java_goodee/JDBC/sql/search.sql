-- �˻�

--- �˻� Ű����(�ʵ�) : ex) "�̸�"  -> member_name (ġȯ)
--- ����/���� �˻� ����
--- ���꿡 ���� ������ ����(like(����), =(����)) 
--- �˻��� ó�� : ����/���� �˻��� ���� �ٸ�
--- ������ �� ���ڵ�(��) ��
--- ���� ������

SELECT *
FROM (SELECT ROWNUM,  
             m.*,    
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (  
             SELECT * FROM member 
             WHERE member_name like '%��%'
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
             WHERE member_name = 'ȫ�浿'
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