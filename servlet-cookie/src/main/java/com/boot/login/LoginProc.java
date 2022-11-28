package com.boot.login;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginProc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		
		Cookie[] cookies = request.getCookies();
		Cookie serverCookie = null;
		
		// 쿠키 저장
		String isSaveId = request.getParameter("isSaveId");
		System.out.println("isSaveId : " + isSaveId);
		if(isSaveId == null) {
			System.out.println("isSaveId : " + isSaveId);
			for(Cookie c : cookies) {
				System.out.println("c name : " + c.getName());
				// memberId --> 시간을 0으로 돌리고 다시 response에 담아준다.
				c.setMaxAge(0); // 초 단위 : 0으로 하면 삭제 효과
				response.addCookie(c);
			}
		}else {
			// 쿠키 저장 코드 why (기억하라고 허락했음)
			serverCookie = new Cookie("memberId", mId); // 사용자가 입력한 값을 저장
			response.addCookie(serverCookie); // 저장한 값을 보낸다.
		}
		response.sendRedirect("home.jsp");
		
		
		// JSESSIONID : 자바로 만들어진 서버 프로그램에서 기본적으로 브라우저가 
		// 첫 요청시 발급하는 쿠키 입니다.
		/*
		 * for(Cookie reqCookie : cookies) { System.out.println("reqCookie : " +
		 * reqCookie); System.out.println("cookie name : " + reqCookie.getName());
		 * System.out.println("cookie name : " + reqCookie.getValue());
		 * 
		 * if(reqCookie.getName().equals("memberId")) { serverCookie = reqCookie; } } //
		 * 브라우저에게 넘겨준 쿠키 이름이 memberId가 없다면 서버측에서 생성한 쿠키를 담아라 if(serverCookie == null) {
		 * System.out.println("내가 생성한 쿠키가 없다면 다시 만듭니다."); serverCookie = new
		 * Cookie("memberId", mId); } serverCookie.setMaxAge(60 * 60);
		 * System.out.println(serverCookie.getMaxAge());
		 * response.addCookie(serverCookie);
		 */
		
//		response.sendRedirect("home.jsp");
		
	}

}
