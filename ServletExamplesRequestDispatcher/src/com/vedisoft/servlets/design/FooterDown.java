package com.vedisoft.servlets.design;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterDown
 */
@WebServlet("/FooterDown")
public class FooterDown extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FooterDown() {
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
		out.println("<div class=\"footer\">");
		out.println("<div class=\"footer_resize\">");
		out.println(
				"<p class=\"lf\">&copy; Copyright MyWebSite. Designed by Vedisoft <a href=\"http://www.vedisoft.com\">Website Templates</a></p>");
		out.println("<ul class=\"fmenu\">");
		out.println("<li class=\"active\"><a href=\"index.html\">Home</a></li>");
		out.println("<li><a href=\"support.html\">Support</a></li>");
		out.println("<li><a href=\"blog.html\">Blog</a></li>");
		out.println("<li><a href=\"about.html\">About Us</a></li>");
		out.println("<li><a href=\"contact.html\">Contacts</a></li>");
		out.println("</ul>");
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
		out.println("</div>");
	}

}
