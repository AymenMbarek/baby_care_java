package com.javatpoint.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javatpoint.bean.Baby;
import com.javatpoint.dao.BabyDao;
@WebServlet("/ViewBabyNameByReligion")
public class ViewBabyNameByReligion extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String religion=request.getParameter("religion");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Baby by "+religion.toUpperCase()+"</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navigation.html").include(request, response);
		out.print(" <a href='ViewBabyNameByReligion?religion=tunis' class='btn btn-primary' role='button'>tunis</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=french' class='btn btn-primary' role='button'>french</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=italian' class='btn btn-primary' role='button'>italian</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=english' class='btn btn-primary' role='button'>english</a> ");
		request.getRequestDispatcher("atoz.html").include(request, response);
		
		out.println("<h1>View Baby Names by "+religion.toUpperCase()+"</h1>");
		List<Baby> list=BabyDao.getRecordsByReligion(religion);
		
		out.print("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Id</th><th>Name</th><th>Meaning</th><th>Sex</th><th>Religion</th></tr>");
		for(Baby b:list){
			out.println("<tr><td>"+b.getId()+"</td><td>"+b.getName()+"</td><td>"+b.getMeaning()+"</td><td>"+b.getSex()+"</td><td>"+b.getReligion()+"</td></tr>");
		}
		out.println("</table>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}


}
