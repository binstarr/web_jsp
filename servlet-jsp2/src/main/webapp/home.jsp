<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 홈 입니다.</h1>
	<%
	  String em = request.getParameter("email");
	System.out.println("email : ");
	%>
</body>
</html>