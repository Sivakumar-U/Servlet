package com.blz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		PrintWriter out=res.getWriter();
		out.println("<html><body>"+"<h1>Hi "+firstName+" "+lastName+"</h1>"+"</body></html>");
		out.close();
	}
}
