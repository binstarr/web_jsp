package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDao;
import com.dto.MovieDto;

@WebServlet("/moviesave")
public class MovieInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieInsertServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MovieDao dao = new MovieDao();
		MovieDto dto = new MovieDto();
		request.setCharacterEncoding("UTF-8");

		String number = request.getParameter("number");
		String name = request.getParameter("name");
		String year = request.getParameter("year");
		String revenue = request.getParameter("revenue");
		String people = request.getParameter("people");
		String rate = request.getParameter("rate");

		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		dto.set번호(number);
		dto.set이름(name);
		dto.set개봉연도(year);
		dto.set매출액(revenue);
		dto.set관객수(people);
		dto.set평점(rate);
		int result = dao.insertMovie(dto);
		if (result == 1) {
			out.print("정상 등록 되었습니다.");
		} else {
			out.print("잘못된 요청 입니다.");
			out.print(dto.toString());
		}

	}

}
