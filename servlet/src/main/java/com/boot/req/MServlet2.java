package com.boot.req;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ms2")
public class MServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("------------------------");
		String contentType = request.getContentType();
		HttpSession getSession = request.getSession();
		System.out.println("contentType : " + contentType);
		System.out.println("getSession : " + getSession.getId());
		System.out.println("------------------------");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		// 응답 처리
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.write("name : " + name);
		out.write("age : " + age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기 오나요?");
		String name = request.getParameter("name");
		System.out.println("post쪽 name : " + name);
		System.out.println("------------------------");
		doGet(request, response);
	}

}
