<%@page
	import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
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
	String dan = request.getParameter("dan");
	int gugu = Integer.parseInt(dan);
	for (int i = 1; i < 10; i++) {
	%>
	<div>
		<p>
			<%=gugu%>
			*
			<%=i%>
			=
			<%=gugu * i%>
			<br>
	</div>
	<%
	}
	%>
</body>
</html>