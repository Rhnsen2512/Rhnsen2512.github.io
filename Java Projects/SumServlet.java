package com.shelby;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
@WebServlet("/add")
public class SumServlet extends HttpServlet{
	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {\
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//res.sendRedirect("sq?k="+k);
		//HttpSession session=req.getSession();
		//session.setAttribute("k",k);
		Cookie cookie= new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");

		//System.out.println("result is "+k);
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("result is "+k);
		out.println("</body></html>");
		//req.setAttribute("k",k);-> Since we do not send request obj in sendRedirect() method
		//RequestDispatcher rd=req.getRequestDispatcher("sq");
		//rd.forward(req,res);		
		
	}

}
