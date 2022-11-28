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
	Cookie[] cookies = request.getCookies();
	String userId = "";
	if (cookies != null) {
		for (Cookie c : cookies) {
			System.out.println("cName : " + c.getName());
			System.out.println("cAge : " + c.getMaxAge());
			if (c.getName().equals("memberId")) {
				userId = c.getValue();

			}
		}
	}
	%>
	<h1>
		여기는
		<%=userId%>
		홈
	</h1>
</body>
</html>