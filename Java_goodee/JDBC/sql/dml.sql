-- CRUD(insert, select, update, delete) : DML

-- ���� ȸ������ ����
INSERT INTO member VALUES
('java1234', '#Abcd1234', '�ڹٸ�', 'ȫ�浿', 'm', 'abcd@abcd.com',
'010-1234-5678', '1990-01-01', '12345','���� ��õ�� ����',
'�븢 3�� 11��', sysdate);
 

-- ���� ȸ������ ��ȸ
SELECT * FROM member WHERE member_id='java1234';
 
-- ��ü ȸ������ ��ȸ
SELECT * FROM member;

-- ���� ȸ������ ����(����)
UPDATE member SET
member_password='#Spring1234',
member_zip='12345',
member_address_basic='���� ��õ�� ��������д���',
member_address_detail='�����ī����'
WHERE member_id='java1234';
 
-- ���� ȸ������ ����
DELETE member WHERE member_id='java1234';

-- ��ü ȸ������ ����
DELETE member;

-- ȸ�� ���� ����
-- SELECT * FROM member WHERE member_id = 'java';
SELECT count(*) FROM member WHERE member_id = 'java';

-- ȸ�� ���� ��ȸ
SELECT count(*) FROM member WHERE member_id = 'java' AND member_Password = '1234';

--SQL ����¡
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