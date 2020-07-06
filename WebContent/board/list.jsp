<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="test.Connector"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection con = Connector.getConnection();
	String search = request.getParameter("search");
	String searchStr = request.getParameter("searchStr");
	String sql = "select num, title, content, credat, creusr from board ";

	if (search != null && !"".equals(search)) {
		sql += " where ";
		if ("1".equals(search)) {
			sql += " num like '%'||'test'||'%'";
		} else if ("2".equals(search)) {
			sql += " title like '%'||'test'||'%'";
		} else if ("3".equals(search)) {
			sql += " content like '%'||'test'||'%'";
		} else if ("4".equals(search)) {
			sql += " credat like '%'||'test'||'%'";
		} else if ("5".equals(search)) {
			sql += " creusr like '%'||'test'||'%'";
		}
	}
	PreparedStatement ps = con.prepareStatement(sql);
	if (search != null && !"".equals(search)) {
		ps.setString(1, searchStr);
		if ("3".equals(search)) {
			ps.setString(2, searchStr);
		}
	}
	ResultSet rs = ps.executeQuery();// 쿼리의 결과가 중요.
	%>
	<form>
		<select name="search">
			<option value="1">번호</option>
			<option value="2">제목</option>
			<option value="3">내용</option>
			<option value="4">작성일</option>
			<option value="5">작성자</option>
		</select><input type"text' name="searcStr">
		<button>검색</button>
	</form>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
			<th>작성자</th>
		</tr>
		<%
			while (rs.next()) {//title, content, credat, cretim, creusr
		%>
		<tr>
			<td><%=rs.getInt("num")%></td>
			<td><%=rs.getString("title")%></td>
			<td><%=rs.getString("credat")%></td>
			<td><%=rs.getString("cretim")%></td>
			<td><%=rs.getString("creusr")%></td>
		</tr>
		<%
			}
		con.close();
		%>
	</table>
</body>
</html>