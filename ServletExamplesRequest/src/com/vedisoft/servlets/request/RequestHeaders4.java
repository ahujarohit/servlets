package com.vedisoft.servlets.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeaders4
 */
@WebServlet("/RequestHeaders4")
public class RequestHeaders4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestHeaders4() {
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
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequest/resources/style.css\" media=\"all\" />");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletExamplesRequest/resources/demo.css\" media=\"all\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<header>");
		out.println(
				"<h1><span>Vedisoft : Request Headers - Methods from HttpServletRequest (Request Protocol Data and Resource Path) </span> </h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<h3> Context Path : " + request.getContextPath() + "</h3> <br>");
		out.println("<h3> Method : " + request.getMethod() + "</h3><br>");
		out.println("<h3> Path Info : " + request.getPathInfo() + "</h3><br>");
		out.println("<h3> Path Translated : " + request.getPathTranslated() + "</h3><br>");
		out.println("<h3> Query String : " + request.getQueryString() + "</h3><br>");
		out.println("<h3> Request URI : " + request.getRequestURI() + "</h3><br>");
		out.println("<h3> Request URL : " + request.getRequestURL() + "</h3><br>");
		out.println("<h3> Servlet Path : " + request.getServletPath() + "</h3><br>");
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
