package com.vedisoft.servlets.design;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Header
 */
@WebServlet("/Header")
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Header() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<div class=\"header\">");
		out.println("<div class=\"header_resize\">");
		out.println(
				"<div class=\"logo\"><h1><a href=\"index.html\">Personal Accountant<br /><small>developed by Rohit Ahuja</small></a></h1></div>");
		out.println("<div class=\"menu_nav\">");
		out.println("<ul>");
		out.println("<li class=\"active\"><a href=\"index.html\">Home</a></li>");
		out.println("<li><a href=\"support.html\">Database</a></li>");
		out.println("<li><a href=\"about.html\">Reports</a></li>");
		out.println("<li><a href=\"blog.html\">Search</a></li>");
		out.println("<li><a href=\"contact.html\">Contact Us</a></li>");
		out.println("</ul>");
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
		out.println("</div>");

	}

}
