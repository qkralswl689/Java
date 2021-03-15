-- CRUD(insert, select, update, delete) : DML

-- 개별 회원정보 생성
INSERT INTO member VALUES
('java1234', '#Abcd1234', '자바맨', '홍길동', 'm', 'abcd@abcd.com',
'010-1234-5678', '1990-01-01', '12345','서울 금천구 가산',
'대륭 3차 11층', sysdate);
 

-- 개별 회원정보 조회
SELECT * FROM member WHERE member_id='java1234';
 
-- 전체 회원정보 조회
SELECT * FROM member;

-- 개별 회원정보 수정(갱신)
UPDATE member SET
member_password='#Spring1234',
member_zip='12345',
member_address_basic='서울 금천구 가산디지털단지',
member_address_detail='구디아카데미'
WHERE member_id='java1234';
 
-- 개별 회원정보 삭제
DELETE member WHERE member_id='java1234';

-- 전체 회원정보 삭제
DELETE member;

-- 회원 여부 점검
-- SELECT * FROM member WHERE member_id = 'java';
SELECT count(*) FROM member WHERE member_id = 'java';

-- 회원 정보 조회
SELECT count(*) FROM member WHERE member_id = 'java' AND member_Password = '1234';

--SQL 페이징
SELECT *  
FROM (SELECT ROWNUM,  
             m.*,  
             FLOOR((ROWNUM - 1) / 10 + 1) page  
      FROM (
             SELECT * FROM member  
             ORDER BY member_id ASC
           ) m  
      )  
WHERE page = 1;