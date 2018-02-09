package com.vedisoft.servlets.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestForm2
 */
@WebServlet("/RequestForm2")
public class RequestForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestForm2() {
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
		String name = new String();
		String email = new String();
		String username = new String();
		String password = new String();
		String repassword = new String();
		String bdate = new String();
		String gender = new String();
		String phone = new String();
		String day = new String();
		String month = new String();
		String year = new String();
		Enumeration<String> e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String pname = e.nextElement();
			String value = request.getParameter(pname);
			if (pname.equals("name"))
				name = value;
			else if (pname.equals("email"))
				email = value;
			else if (pname.equals("username"))
				username = value;
			else if (pname.equals("password"))
				password = value;
			else if (pname.equals("repassword"))
				repassword = value;
			else if (pname.equals("birthday"))
				day = value;
			else if (pname.equals("birthmonth"))
				month = value;
			else if (pname.equals("birthyear"))
				year = value;
			else if (pname.equals("gender"))
				gender = value;
			else if (pname.equals("phone"))
				phone = value;

		}
		bdate = day + "-" + month + "-" + year;
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
