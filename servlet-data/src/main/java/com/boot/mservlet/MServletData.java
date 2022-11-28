package com.boot.mservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MServletData")
public class MServletData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MServletData() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aId = getServletConfig().getInitParameter("adminId");
		String aPw = getServletConfig().getInitParameter("adminPw");
		
		PrintWriter writer = response.getWriter();
		writer.print("<p>adminId : " + aId + "</p>");
		writer.print("<p>adminPw : " + aPw + "</p>");
		System.out.println("------------------------------------");
		String imgDir = getServletContext().getInitParameter("imgDir");
		writer.print("<p>imgDir : " + imgDir + "</p>");
		
		getServletContext().setAttribute("MyName", "you");
		
		String temp = (String) getServletContext().getAttribute("MyName");
		writer.print("<p>temp : " + temp + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
