package com.cr7;
import javax.servlet.http.HttpServlet;   
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//System.out.println("result is "+k);
		PrintWriter out=res.getWriter();
		out.println("result is "+k);
		
	}


	
}
