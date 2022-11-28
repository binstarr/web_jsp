<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
		// 준비물
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/blog?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
		String dbUser = "root";
		String dbPw = "asd1234";
		String query = "SELECT * FROM board";
		conn = DriverManager.getConnection(url, dbUser, dbPw);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()){
			out.write("id : " +rs.getString("id"));
			
		}
	%>
</body>
</html>