<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int num = 200;
	String str = "boot camp jsp";
	ArrayList<String> list = new ArrayList<String>();%>
	
	<!-- if문과 HTML 태그 활용 -->
	<%if(num > 100){%>
		<div><p> num은 100보다 큰 값을 가지고 있네요</div>
	<%}else{%>
		<div><p> num은 100보다 작은 값을 가지고 있네요</div>
	<%}%>
	
	<!-- 표현식 태그 -->
	<div>
		<p>자바 변수의 num 값은 <%=num %> 입니다.
		<p>표현식에서 간단한 연산해보기 :<%=num %> * 100 = <%=num * 100 %>
	</div>


</body>
</html>