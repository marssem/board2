<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
2.jsp<br>
<%
RequestDispatcher requestDispatcher = request.getRequestDispatcher("/for/3.jsp");
requestDispatcher.forward(request, response);
%>
</body>
</html>