package com.coforge.servletJenkinsEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", request.getLocale());

		try {
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
			String title = rb.getString("helloworld.title");
			out.println("<title>" + title + "</title></head>");
			out.println("<body>");
			out.println("<h1>" + title + "</h1>");
			out.println("<a href='" + request.getRequestURI() + "'><img src='images/return.gif'></a>");
			out.println("</body></html>");
		} finally {
			out.close();
		}
	}
}
