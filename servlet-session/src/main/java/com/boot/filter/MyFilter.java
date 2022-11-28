package com.boot.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		System.out.println("필터 초기화 하는 부분");
	}

	// 보통 실제 동작을 구현 하는 부분
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터 동작 1");
		req.setCharacterEncoding("UTF-8");
//		System.out.println("웹 컨테이너로 들어가기 전에 동작 하나요?");
//		System.out.println("필터를 web.xml 에 설정 후 req, res가 웹 컨테이너로 잘 넘어 가나요?");
		chain.doFilter(req, res);
		System.out.println("필터 동작 2");
		System.out.println("----------------------");
		res.setContentType("text/html; charset=UTF-8");
	}
	// 필터 종료시
	@Override
	public void destroy() {
		Filter.super.destroy();
		System.out.println(">>>>> 필터 종료 <<<<<");
	}
	
}