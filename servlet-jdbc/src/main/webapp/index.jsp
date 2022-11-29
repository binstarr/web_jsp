<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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

   <header>
      <h1>MySql 연결 테스트</h1>
   </header>

   <%
   Connection conn = null ;
   Statement stmt = null ;
   ResultSet rs = null;

   String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
   String dbUser = "root";
   String dbPw = "asd1234";
   String query = "SELECT * FROM usertbl";

   try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, dbUser, dbPw);
      stmt = conn.createStatement();
      rs = stmt.executeQuery(query);
      
      while (rs.next()){
         out.print(rs.getString("username"));
         out.print(rs.getString("birthYear"));
         out.print(rs.getString("addr"));
         out.print(rs.getString("mobile"));
         out.print("<br>");
      }
   } catch (Exception e) {
      e.printStackTrace();
   } finally {
      try{
         rs.close();
         stmt.close();
         conn.close();
      }catch(Exception e){
         e.printStackTrace();   
      }

      
   }
   
   
   %>
   <div>
   	<form action="us" method="post">
   	username : <input type="text" name="username">
   	<input type="submit" value="유저 검색">
   	</form>
   </div>
   
   <div>
   	<form action="ActorServlet" method="get">
   		번호 : <input type="text" name ="number">
   		<input type="submit" value="배우검색">
   	</form>
   </div>
   
   <div style="margin-top: 20px">
   		<form action="ActorServlet" method="post">
   			번호 : <input type="text" name="number">
   			이름 : <input type="text" name="name">
   			<input type="submit" value="배우등록">
   		</form>
   </div>

</body>
</html>