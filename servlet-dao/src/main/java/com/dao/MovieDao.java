package com.dao;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dto.MovieDto;

public class MovieDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	String dbUser = "root";
	String dbPw = "asd1234";
	String driverName = "com.mysql.cj.jdbc.Driver";

	public MovieDao() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DB연결 처리
	// CRUD
	public List<MovieDto> selectMovie() {
		List<MovieDto> list = new ArrayList();
		
		String query = "SELECT * FROM 영화 ";
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MovieDto dto = new MovieDto();
				dto.set번호(rs.getString("번호"));
				dto.set이름(rs.getString("이름"));
				dto.set개봉연도(rs.getString("개봉연도"));
				dto.set매출액(rs.getString("매출액"));
				dto.set관객수(rs.getString("관객수"));
				dto.set평점(rs.getString("평점"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<MovieDto> selectMovieByTitle() {
		List<MovieDto> list = new ArrayList();
		
		return list;
	}
	
	
	public int insertMovie(MovieDto dto) {
		int result = -1;
		String query = "insert into 영화(번호, 이름, 개봉연도, 매출액, 관객수, 평점) values(?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.get번호());
			pstmt.setString(2, dto.get이름());
			pstmt.setString(3, dto.get개봉연도());
			pstmt.setString(4, dto.get매출액());
			pstmt.setString(5, dto.get관객수());
			pstmt.setString(6, dto.get평점());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public void update() {
	}

	public void deleteMovie() {
	}

}
