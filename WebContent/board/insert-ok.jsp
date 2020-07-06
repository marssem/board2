<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="test.Connector"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String title = request.getParameter("title");
String content = request.getParameter("content");
String creusr = request.getParameter("creusr");

String sql = "INSERT INTO board(num, title, content, credat, cretim, creusr)\r\n" +
"VALUES(\r\n"+
"(select nvl(max(num),0)+1 from board),"+
"?,\r\n"+
"?,\r\n"+
"to_char(sysdate, 'YYYYMMDD'),\r\n"+
"to_char(sysdate, 'HH24MiSS'),\r\n"+
"?\r\n"+
")";

Connection con = null;
try{
con = Connector.getConnection();
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, title);//바인딩
ps.setString(2, content);
ps.setString(3, creusr);
int result = ps.executeUpdate();

if(result==1){
%>
<script>
	
	
</script>
<% 
}
	
}catch(SQLException e){
	out.println("에러났음 : "+ e.getMessage());
	e.printStackTrace();
}finally{
	Connector.close();
}
%>
<script>
	location.href = "/board/list.jsp"
</script>