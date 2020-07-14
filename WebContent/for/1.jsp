<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
 <%@ include file="/for/common.jsp"%>   
<%
// <%@ <-- Directive(지시자 or설명서)
// <% <-- Scriptlet(실행부) 메소드 안에 , 선언 안됨
// <%= <-- Expression(표현식)
// <%! <-- Declaration(선언부) 클래스 안에 , 실행 안됨, 접근제어자, 변수, static 가능
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1.jsp<br>
<%
RequestDispatcher requestDispatcher = request.getRequestDispatcher("/for/2.jsp");
requestDispatcher.forward(request, response);
%>
</body>
</html>