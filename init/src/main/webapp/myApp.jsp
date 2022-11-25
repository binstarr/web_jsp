<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 여기 페이지에서 예외가 발생한다면 어디로 이동하라고 지정 가능 하다. -->
	<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String imgDir;
	String testServerIp;
	String realServerIp;
	String str;
	%>
	
	<%
	/* PrintWriter out2 = response.getWriter();
	out2.write(buf);
	out.write(); */
	
	
	imgDir = application.getInitParameter("imgDir");
	testServerIp = application.getInitParameter("testServerIp");
	realServerIp = application.getInitParameter("realServerIp");
	
	// setAttribute 와 getAttribute
	/* application.setAttribute(name, object); */
	getServletContext().setAttribute("mySqlServerIp", "177.1.23.12");
	getServletContext().setAttribute("mySqlUser", "root");
	%>
	
	testServer : <%=testServerIp %>
	<br>
	realServerIp : <%=realServerIp %>
	<div>
		<img alt="" src="<%=imgDir %>/img1.jpg">
	</div>
	
	
	
	
	
	<!-- GET, SET 사용 -->
	<p>sqlIp : <%=getServletContext().getAttribute("mySqlServerIp") %></p>
	<p>mySqlUser : <%=getServletContext().getAttribute("mySqlUser") %></p>
	
	<%
		out.print(str.toString());
		/* response.sendRedirect("myApp2.jsp"); */
	%>

</body>
</html>
