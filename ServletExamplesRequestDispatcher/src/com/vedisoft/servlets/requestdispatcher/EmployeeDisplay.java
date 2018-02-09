package com.vedisoft.servlets.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vedisoft.servlets.pojos.Employee;

/**
 * Servlet implementation class EmployeeDisplay
 */
@WebServlet("/EmployeeDisplay")
public class EmployeeDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDisplay() {
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
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Vedisoft Software & Education Services Pvt. Ltd.</title>");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7; IE=EmulateIE9\">");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
		out.println(
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequestDispatcher/resources/style.css\" media=\"all\" />");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequestDispatcher/resources/demo.css\" media=\"all\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<header>");
		out.println("<h1><span>Vedisoft : Request Dispatcher Example 1</span> Forward</h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		Employee emp = (Employee) request.getAttribute("emp");
		if(emp == null) {
			out.println("<h1> No Employee Data Found</h1> <br>");
		}
		else {
			out.println("<h1> Code : " + emp.getCode() + "</h1> <br>");
			out.println("<h1> Name : " + emp.getName() + "</h1> <br>");
			out.println("<h1> Department : " + emp.getDept() + "</h1> <br>");
			out.println("<h1> Designation : " + emp.getDesig() + "</h1> <br>");
			out.println("<h1> Basic : " + emp.getBasic() + "</h1> <br>");
			out.println("<h1> Date Of Joining : " + emp.getDoj() + "</h1> <br>");
				
		}
		out.println("</div>");
		out.println("</div>");
		out.println("	</body>");
		out.println("</html>");
	}

}
