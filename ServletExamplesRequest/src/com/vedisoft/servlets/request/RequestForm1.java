package com.vedisoft.servlets.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestForm1
 */
@WebServlet("/RequestForm1")
public class RequestForm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestForm1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String bdate = request.getParameter("birthday") +"-" + request.getParameter("birthmonth") +"-" + request.getParameter("birthyear");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		

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
		out.println("<h1><span>Vedisoft : Fetching Data from Request Example 2</span> Registration Form </h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<h2> Name : " + name + "</h2>  <br>");
		out.println("<h2> Email : " + email + "</h2> <br> ");
		out.println("<h2> User Name : " + username + "</h2> <br>");
		out.println("<h2> Password  : " + password + "</h2> <br>");
		out.println("<h2> Repeat Password : " + repassword + "</h2> <br>");
		out.println("<h2> Birth Date : " + bdate + "</h2> <br>");
		out.println("<h2> Gender : " + gender + "</h2> <br>");
		out.println("<h2> Phone : " + phone + "</h2> <br>");
		out.println("</div>");
		out.println("</div>");
		out.println("	</body>");
		out.println("</html>");
	}
}
