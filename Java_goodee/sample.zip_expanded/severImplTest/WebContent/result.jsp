<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="severImplTest.DTO" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>
	
 	<jsp:useBean id="dto" class="severImplTest.DTO" scope="page">
		<jsp:setProperty name="dto" property="*" />
	</jsp:useBean> 

	id : <jsp:getProperty property="member_id" name="dto" /><br>
	pw : <jsp:getProperty property="member_pw" name="dto" /><br>
	name : <jsp:getProperty property="member_name" name="dto" /><br>
	address : <jsp:getProperty property="member_address" name="dto" /><br>

</body>
</html>