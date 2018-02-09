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
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = new String();
		String password = new String();
		Cookie cookies[] = request.getCookies();
		if (cookies != null) {
			for (Cookie cook : cookies) {
				if (cook.getName().equals("username")) {
					username = cook.getValue();
				}
				else if (cook.getName().equals("password")) {
					password = cook.getValue();
				}
			}
		}
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
		out.println("<h1><span>Vedisoft : Cookie Example 4</span> Welcome Home</h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<form id=\"contactform\" action=\"/ServletExamplesCookie/PasswordVerification\" method=\"post\">");
		out.println("<p class=\"contact\">");
		out.println("<label for=\"username\">Username</label>");
		out.println("</p>");
		out.println("<input id=\"username\" name=\"username\" placeholder=\"username\" required=\"\" tabindex=\"1\" type=\"text\" value=\""+username+"\">");
		out.println("<p class=\"contact\">");
		out.println("<label for=\"password\">Password</label>");
		out.println("</p>");
		out.println("<input type=\"password\" id=\"password\" name=\"password\" required=\"\" tabindex=\"2\" value=\""+password+"\"> <br>");
		out.println("<p class=\"contact\">");
		out.println("<input type=\"checkbox\" id=\"rememberme\" name=\"rememberme\" value=\"yes\"	tabindex=\"3\">"); 	
		out.println("<label for=\"rememberme\">Remeber Me</label>");
		out.println("</p>");
		out.println("<br> <input class=\"buttom\" name=\"submit\" id=\"submit\" tabindex=\"4\" value=\"Login !\" type=\"submit\">");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
