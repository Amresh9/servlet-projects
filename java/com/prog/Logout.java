package com.prog;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
Cookie[] ck = 	req.getCookies();
	
ck[0].setMaxAge(0);
ck[1].setMaxAge(0);
ck[2].setMaxAge(0);
res.addCookie(ck[0]);
res.addCookie(ck[1]);
res.addCookie(ck[2]);
res.sendRedirect("index.html");

	}

}
