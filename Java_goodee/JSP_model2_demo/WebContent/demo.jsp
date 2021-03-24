<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>demo</title>
</head>
<body>
java : <%=request.getAttribute("java") %><br>
java(EL) : ${requestScope.java }<br>
jaba(EL) : ${java}
</body>
</html>