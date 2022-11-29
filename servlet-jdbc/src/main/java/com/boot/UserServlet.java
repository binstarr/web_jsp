package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/us")
public class UserServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public UserServlet() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // 준비물
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

      String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
      String dbUser = "root";
      String dbPw = "asd1234";
      String driverName = "com.mysql.cj.jdbc.Driver";

      // 요청 처리
      request.setCharacterEncoding("UTF-8");
      String userName = request.getParameter("username");

      // 응답처리
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();

      // DB접근 처리
      
      String query = "SELECT * FROM usertbl WHERE username ='" + userName + "' ";
      System.out.println(query);
      try {
         Class.forName(driverName);
         conn = DriverManager.getConnection(url, dbUser, dbPw);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);

         while (rs.next()) {
            out.print(rs.getString("username"));
            out.print(rs.getString("birthYear"));
            out.print(rs.getString("addr"));
            out.print(rs.getString("mobile"));
            
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            rs.close();
            stmt.close();
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }

   }

   private void setCharacterEncoding(String string) {
      // TODO Auto-generated method stub
      
   }

}