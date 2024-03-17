package com.shelby;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int k=(int)req.getAttribute("k");
		//HttpSession session=req.getSession();
		//int k=(int)session.getAttribute("k");
		//int k=Integer.parseInt(req.getParameter("k"));
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
        PrintWriter out=res.getWriter();
        out.println("<html><body bgcolor='cyan'>");
		out.println("result is "+k);
		out.println("</body></html>");
		System.out.println("May the Force be with you!");
}
}
