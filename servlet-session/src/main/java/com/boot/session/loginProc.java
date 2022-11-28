package com.boot.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ms1")
public class loginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		
		HttpSession session = request.getSession();
		session.setAttribute("mId", mId);
			
		// 일반적 로그인 로직을 다 완성 했다면 
		response.sendRedirect("login_ok.jsp");
	}

}
