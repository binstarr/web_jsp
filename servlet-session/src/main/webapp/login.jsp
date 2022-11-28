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
	System.out.print("여기는 로그인 jsp");
	session = request.getSession();
	if(session.getAttribute("mId") != null){
		response.sendRedirect("login_ok.jsp");
	}
%>

	<form action="ms1" method="post">
		id : <input type="text" name="mId">
		pw : <input type="text" name="mPw">
		<input type="submit" value="login">
	</form>
</body>
</html>