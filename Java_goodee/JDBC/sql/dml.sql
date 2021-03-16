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

-- 이메일 중복 점검
SELECT count(*) FROM member
WHERE member_email = 'skfksnsk1@gmail.com' ;

-- decode 함수(조건 구문 함수) 활용
-- DECODE조건 : count가 0(중복 없음) 이면 true(사용가능)로 리턴, 1(중복 있음)이면 false(사용 불가)로 리턴한다
SELECT DECODE(count(*), 0, 'true', 1, 'false') FROM member
WHERE member_email = 'skfksnsk1@gmail.com' ;

-- 회원 아이디/이메일 => 수정시
-- 기존의 이메일과 중복이 안되면서 
-- 기존의 자신의 이메일과는 중복 허용(수정 안하고 재사용 가능)

-- case) 회원 이메일 변경하고자 함

-- 0 : 사용가능 : 자신의 것을 재사용
SELECT count(*) FROM member
WHERE member_id != 'hyun' AND member_email = 'skfksnsk@gmail.com' ;

-- 1 : 사용 불가  : 다른 회원 아이디의 이메일과 중복
SELECT count(*) FROM member
WHERE member_id != 'hyun' AND member_email = 'goodee_2@abcd.com' ;

-- 0 : 사용 가능 : 중복 안되는 새로운 이메일 
SELECT count(*) FROM member
WHERE member_id != 'hyun' AND member_email = 'skfksn1@gmail.com' ;