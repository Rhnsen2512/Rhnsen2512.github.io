package com.shelby;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		PrintWriter out=response.getWriter();
		out.print("Last of Us<br>");
		ServletContext ctx= getServletContext();
		String str=ctx.getInitParameter("Name");
		out.println(str);
	}

}
