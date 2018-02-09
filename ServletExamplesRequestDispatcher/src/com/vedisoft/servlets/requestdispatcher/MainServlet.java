package com.vedisoft.servlets.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		out.println("<head>");
		out.println("<title>Template</title>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
		out.println("<link href=\"/ServletExamplesRequestDispatcher/template/style.css\" rel=\"stylesheet\" type=\"text/css\" />");

		out.println("<script type=\"text/javascript\" src=\"/ServletExamplesRequestDispatcher/template/js/cufon-yui.js\"></script>");
		out.println("<script type=\"text/javascript\" src=\"/ServletExamplesRequestDispatcher/template/js/georgia.js\"></script>");
		out.println("<script type=\"text/javascript\" src=\"/ServletExamplesRequestDispatcher/template/js/cuf_run.js\"></script>");

		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"main\">");

		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("Header");
		rd.include(request, response);

		out.println("<div class=\"content\">");
		out.println("<div class=\"content_resize\">");
		out.println("<div class=\"mainbar\">");
		out.println("<div class=\"article\">");
		out.println("<h2><span>Welcome to Personal Accountant</span></h2>");
		out.println(
				"<p>Posted by <a href=\"#\">Owner</a> | Filed under <a href=\"#\">templates</a>, <a href=\"#\">internet</a></p>");

		out.println("</div>");
		out.println("</div>");
		rd = request.getRequestDispatcher("SideBar");
		rd.include(request, response);
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
		out.println("</div>");

		rd = request.getRequestDispatcher("FooterUp");
		rd.include(request, response);
		rd = request.getRequestDispatcher("FooterDown");
		rd.include(request, response);
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");	
	}


}
