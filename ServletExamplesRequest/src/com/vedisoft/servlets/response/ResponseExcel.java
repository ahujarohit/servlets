package com.vedisoft.servlets.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseExcel
 */
@WebServlet("/ResponseExcel")
public class ResponseExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResponseExcel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String format = request.getParameter("format");
		if (format != null && format.equals("excel")) {
			response.setContentType("application/vnd.ms-excel");
			PrintWriter out = response.getWriter();
			out.println("\tApples\tOranges");
			out.println("Bhopal\t100\t200");
			out.println("Indore\t200\t100");
		} else {
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
			out.println("<h1><span>Vedisoft : Fetching Data from Request Example 1</span> Registration Form </h1>");
			out.println("</header>");
			out.println("<div  class=\"form\">");
			out.println("<table border=\"1\" width=\"50%\">");
			out.println("<tr>");
			out.println("<th>&nbsp;</th>");
			out.println("<th>Apples</th>");
			out.println("<th>Oranges</th>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>Bhopal </th>");
			out.println("<td>100</td>");
			out.println("<td>200</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>Indore</th>");
			out.println("<td>200</td>");
			out.println("<td>100</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</div>");
			out.println("</div>");

			out.println("</body>");
			out.println("</html>");
		}

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
