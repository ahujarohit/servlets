package com.vedisoft.servlets.design;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterUp
 */
@WebServlet("/FooterUp")
public class FooterUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FooterUp() {
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
		out.println("<div class=\"fbg\">");
		out.println("<div class=\"fbg_resize\">");
		out.println("<div class=\"col c1\">");
		out.println("<h2>Image Gallery</h2>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix1.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix2.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix3.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix4.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix5.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("<a href=\"#\"><img src=\"/ServletExamplesRequestDispatcher/template/images/pix6.jpg\" width=\"56\" height=\"56\" alt=\"pix\" /></a>");
		out.println("</div>");
		out.println("<div class=\"col c2\">");
		out.println("<h2>Personal Accountant</h2>");
		out.println(
				"<p>A minor project<br />It records daily income and expense made by an individual. It also contains reports like Bank Book, Cash Book, Balance sheet etc.</p>");
		out.println("</div>");
		out.println("<div class=\"col c3\">");
		out.println("<h2>About</h2>");
		out.println("<img src=\"/ServletExamplesRequestDispatcher/template/images/white.jpg\" width=\"56\" height=\"56\" alt=\"pix\" />");
		out.println(
				"<p>Servlet Reference Project and part of Java Module II - Web and Enterprise Technologies.  Vedisoft Software & Education Services Pvt. Ltd.<a href=\"www.vedisoft.com\">Learn more...</a></p>");
		out.println("</div>");
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
		out.println("</div>");
	}

}
