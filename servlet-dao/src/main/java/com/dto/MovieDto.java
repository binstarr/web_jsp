package com.dto;

public class MovieDto {
	private String 번호;
	private String 이름;
	private String 개봉연도;
	private String 매출액;
	private String 관객수;
	private String 평점;
	public String get번호() {
		return 번호;
	}
	public void set번호(String 번호) {
		this.번호 = 번호;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get개봉연도() {
		return 개봉연도;
	}
	public void set개봉연도(String 개봉연도) {
		this.개봉연도 = 개봉연도;
	}
	public String get매출액() {
		return 매출액;
	}
	public void set매출액(String 매출액) {
		this.매출액 = 매출액;
	}
	public String get관객수() {
		return 관객수;
	}
	public void set관객수(String 관객수) {
		this.관객수 = 관객수;
	}
	public String get평점() {
		return 평점;
	}
	public void set평점(String 평점) {
		this.평점 = 평점;
	}
	@Override
	public String toString() {
		return "MovieDto [번호=" + 번호 + ", 이름=" + 이름 + ", 개봉연도=" + 개봉연도 + ", 매출액=" + 매출액 + ", 관객수=" + 관객수 + ", 평점=" + 평점
				+ "]";
	}
	
	
	
	
	
}
