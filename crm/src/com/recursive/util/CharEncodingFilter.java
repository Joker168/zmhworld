package com.recursive.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns="/*")
public class CharEncodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest requst, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter");
		HttpServletRequest httpReq=(HttpServletRequest)requst;
		HttpServletResponse httpResp=(HttpServletResponse)resp;
		httpReq.setCharacterEncoding("UTF-8");
		httpResp.setCharacterEncoding("UTF-8");
		httpResp.setContentType("text/html;charset=UTF-8");
		chain.doFilter(requst, resp);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
