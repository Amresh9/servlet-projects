package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie[]  carr=req.getCookies();
		if(carr.length == 0) {
			res.sendRedirect("index.html");
			
		}
		else {
			
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			
			pw.print("<h1>Name = "+carr[0].getValue()+"</h1>");
			
			pw.print("<h1>Email = "+carr[1].getValue()+"</h1>");
			
			pw.print("<h1>Password = "+carr[2].getValue()+"</h1>");
			
			pw.print("<a href='logout'>Logout</a>");
			
			
		}
		
		
	}

}
