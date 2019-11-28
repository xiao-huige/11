package com.hongzhen.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class servletLifeCycle2 implements Servlet {   
	public servletLifeCycle2() {
		super();
		System.out.println("实例2");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init2");
	}
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getservletConfig2");
		return null;
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service2");

	}
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo2");
		
		return null;
	}
	@Override
	public void destroy() {
		System.out.println("destroy2");
	}
}
