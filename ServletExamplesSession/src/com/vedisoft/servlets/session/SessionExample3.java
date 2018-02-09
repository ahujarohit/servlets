package com.vedisoft.servlets.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionExample3
 */
@WebServlet("/SessionExample3")
public class SessionExample3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionExample3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<String> nameList = (ArrayList<String>) 
				session.getAttribute("nameList");
		if (nameList == null) {
			nameList = new ArrayList<String>();
			session.setAttribute("nameList", nameList);
		}

		String name = request.getParameter("name");
		if (name != null) {
			nameList.add(name);

		}

		PrintWriter out = response.getWriter();
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
		out.println("<h1><span>Vedisoft : Vedisoft : Session Tracking Example 3</span></h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<form id=\"contactform\">");
		out.println("<p class=\"contact\">");
		out.println("<label for=\"name\">Name</label>");
		out.println("</p>");
		out.println(
				"<input id=\"name\" name=\"name\" placeholder=\"Name \" required=\"\" tabindex=\"1\" type=\"text\" >");
		out.println(
				"<br> <input class=\"buttom\" name=\"add\" id=\"add\" tabindex=\"2\" value=\"Add !\" type=\"submit\">");
		out.println("</form>");
		out.println("</div>");
		out.println("<br>");
		out.println("<div  class=\"form\">");
		out.println("<br>");
		out.println("<ul>");
		for (String str : nameList) {
			out.println("<li>" + str + "</li>");
		}
		out.println("</ul>");
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
