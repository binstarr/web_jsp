<%@page import="com.dto.MovieDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		display : flex;
		height: 100vh;
		justify-content: center;
		align-items: center;
	}
	table{
		border: 5px dotted black;
	}
</style>
</head>
<body>

<%
	ArrayList<MovieDto> list = (ArrayList<MovieDto>)request.getAttribute("movieList");

%>
	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>영화이름</td>
			</tr><!-- 1줄을 의미함 -->
		</thead>
		<tbody>
			<%	for(int i = 0; i < list.size(); i++){ %>
				<tr>
					<td><%=list.get(i).get번호() %></td>	
					<td><%=list.get(i).get이름() %></td>	
				</tr>
			
			<%}%>
		</tbody>
	</table>

</body>
</html>