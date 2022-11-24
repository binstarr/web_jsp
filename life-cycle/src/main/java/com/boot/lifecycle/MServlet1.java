package com.boot.lifecycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ms1")
public class MServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 직접 어노테이션을 붙여서 설정해줘야 하는 부분
	@PostConstruct
	public void postConstruct() {
		System.out.println(">>>>>>>>>postConstruct<<<<<<<<<<<<");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println(">>>>>>>>>init<<<<<<<<<<<<");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>service<<<<<<<<<<<<");
	}
	

	
	@Override
	public void destroy() {
		System.out.println(">>>>>>>>>destroy<<<<<<<<<<<<");
	}
	
	@PreDestroy
	private void PreDestroy() {
		System.out.println(">>>>>>>>>PreDestroy<<<<<<<<<<<<");

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>doGet<<<<<<<<<<<<");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>doPost<<<<<<<<<<<<");
	}

}