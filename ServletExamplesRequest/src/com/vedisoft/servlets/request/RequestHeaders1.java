package com.vedisoft.servlets.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeaders1
 */
@WebServlet("/RequestHeaders1")
public class RequestHeaders1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestHeaders1() {
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
				"<h1><span>Vedisoft : Request Headers - Methods from ServletRequest (Request Protocol and Transmission Data) </span> </h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<h3> Character Encoding : " + request.getCharacterEncoding() + "</h3> <br>");
		out.println("<h3> Content Length : " + request.getContentLength() + "</h3> <br>");
		out.println("<h3> Content Type : " + request.getContentType() + "</h3> <br>");
		out.println("<h3> Locale : " + request.getLocale() + "</h3> <br>");
		out.println("<h3> Protocol : " + request.getProtocol() + "</h3> <br>");
		out.println("<h3> Scheme : " + request.getScheme() + "</h3><br>");
		out.println("<h3> Secure : " + request.isSecure() + "</h3><br>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	

}
