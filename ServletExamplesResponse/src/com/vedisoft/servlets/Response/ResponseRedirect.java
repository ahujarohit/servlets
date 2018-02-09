package com.vedisoft.servlets.Response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseRedirect
 */
@WebServlet("/ResponseRedirect")
public class ResponseRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseRedirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username!=null && password!=null) {
			if(username.equals("admin") && password.equals("admin")) {
					response.sendRedirect("/ServletExamplesResponse/ResponseWelcome");
			}
			else {
				response.sendError(401, "You are not authorized to access this Page");
			}
		}
		else {
			response.sendError(401, "You are not authorized to access this Page");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username!=null && password!=null) {
			if(username.equals("admin") && password.equals("admin")) {
					response.sendRedirect("/ServletExamplesResponse/ResponseWelcome");
			}
			else {
				response.sendError(401, "You are not authorized to access this Page");
			}
		}
		else {
			response.sendError(401, "You are not authorized to access this Page");
		}
		
	}

}
