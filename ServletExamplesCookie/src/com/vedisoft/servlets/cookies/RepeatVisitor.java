package com.vedisoft.servlets.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RepeatVisitor
 */
@WebServlet("/RepeatVisitor")
public class RepeatVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RepeatVisitor() {
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

		boolean cookieFound = false;

		String message = new String();
		Cookie cookies[] = request.getCookies();
		if (cookies != null) {
			for (Cookie cook : cookies) {
				if (cook.getName().equals("repeatVisitor")) {
					message = "Last Visit : " + cook.getValue();
					cookieFound = true;
					break;
				}
			}
		}

		if (!cookieFound) {
			message = "Welcome Newcomer";
		}

		Cookie cook = new Cookie("repeatVisitor", new java.util.Date().toString());
		cook.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cook);

		response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Vedisoft Software & Education Services Pvt. Ltd.</title>");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7; IE=EmulateIE9\">");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
		out.println(
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequest/resources/style.css\" media=\"all\" />");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequest/resources/demo.css\" media=\"all\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<header>");
		out.println("<h1><span>Vedisoft : Cookies Example 1</span> Repeat Visitor </h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<br>");
		out.println("<h1>" + message + "</h1>");
		out.println("<br>");

		out.println("</div>");
		out.println("</div>");

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
