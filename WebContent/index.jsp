<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/board" >
<input type="text"name="name">
<button>전송</button>
</form>
<form action="/board" method="post">
<input type="text"name="name">
<button>전송</button>
</form>
</body>
</html>