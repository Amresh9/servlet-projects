package com.prog;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

  @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
        Cookie ck2 = new Cookie("email_key",email);
        Cookie ck1 = new Cookie("name_key",name);
        Cookie ck3 = new Cookie("pass_key",pass);
      
        response.addCookie(ck1);
        response.addCookie(ck2);
        response.addCookie(ck3);
        
  
        response.sendRedirect("profile");
		
		
	}

}
