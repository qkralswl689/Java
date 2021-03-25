<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>action</title>
</head>
<body>
<%-- <%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id") == null ? "없음" : request.getParameter("id");
	String pw = request.getParameter("pw") == null ? "없음" 
			  : request.getParameter("pw");
	String name = request.getParameter("name") == null ? "없음" 
				: request.getParameter("name");
	String address = request.getParameter("address") == null ? "없음" 
				   : request.getParameter("address");
%>
id : <%=id %><br>
pw : <%=pw %><br>
네임 : <%=name %><br>
주소 : <%=address %>
 --%>
 
 id : ${param.id }<br>
 pw : ${param.pw }<br>
 이름 : ${param.name }<br>
 사는곳 : ${param.address }<br>
</body>
</html>