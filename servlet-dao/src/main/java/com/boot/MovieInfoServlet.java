package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDao;
import com.dto.MovieDto;

@WebServlet("/movieInfo")
public class MovieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	public MovieInfoServlet() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청 처리
		request.setCharacterEncoding("UTF-8");

		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		MovieDao dao = new MovieDao();
		ArrayList<MovieDto> movieList = (ArrayList<MovieDto>)dao.selectMovie();
		
		request.setAttribute("movieList", movieList);
		//response.sendRedirect("movie-info.jsp");
		ServletContext context = getServletContext();
		// 요청 + 관리자 (배치 운행자)
		RequestDispatcher dispatcher = context.getRequestDispatcher("/movie-info.jsp");
		dispatcher.forward(request, response);
		
//		for (int i = 0; i < movieList.size(); i++) {
//			out.print(movieList.get(i).get번호());
//			out.print(movieList.get(i).get이름());
//			out.print(movieList.get(i).get개봉연도());
//			out.print(movieList.get(i).get매출액());
//			out.print(movieList.get(i).get관객수());
//			out.print(movieList.get(i).get평점());
//			out.print("<br>");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
