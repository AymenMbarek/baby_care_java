package com.javatpoint.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/AdminAuthenticator")
public class AdminAuthenticator extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if(name.equals("admin")&&password.equals("admin123")){
			HttpSession session=request.getSession();
			session.setAttribute("adminlogin","true");
			request.getRequestDispatcher("AdminHome").forward(request, response);
		}else{
			request.getRequestDispatcher("AdminError").forward(request, response);
		}
			
	}

}
