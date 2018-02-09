package com.vedisoft.servlets.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeaders2
 */
@WebServlet("/RequestHeaders2")
public class RequestHeaders2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestHeaders2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				"<h1><span>Vedisoft : Request Headers - Methods from ServletRequest (Request Resource Information) </span> </h1>");
		out.println("</header>");
		out.println("<div  class=\"form\">");
		out.println("<h3> Local Address (Server) : " + request.getLocalAddr() + "</h3> <br>");
		out.println("<h3> Local Name (Server) : " + request.getLocalName() + "</h3><br>");
		out.println("<h3> Local Port (Server) : " + request.getLocalPort() + "</h3><br>");
		out.println("<h3> Server Name (Server) : " + request.getServerName() + "</h3><br>");
		out.println("<h3> Local Port (Server) : " + request.getServerPort() + "</h3><br>");
		out.println("<h3> Remote Address (Client) : " + request.getRemoteAddr()+ "</h3><br>");
		out.println("<h3> Remote Host (Client) : " + request.getRemoteHost() + "</h3><br>");
		out.println("<h3> Remote Port (Client) : " + request.getRemotePort() + "</h3><br>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	

}
