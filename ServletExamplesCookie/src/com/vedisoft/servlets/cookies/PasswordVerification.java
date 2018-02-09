package com.vedisoft.servlets.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordVerification
 */
@WebServlet("/PasswordVerification")
public class PasswordVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordVerification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rememberme = request.getParameter("rememberme");
		if(username!=null && password!=null) {
			if(username.equals("admin") && password.equals("admin")) {
				if(rememberme != null && rememberme.equals("yes")) {
					Cookie cuser = new Cookie("username", username);
					cuser.setMaxAge(60*60*24*7);
					response.addCookie(cuser);
					Cookie cpass = new Cookie("password", password);
					cpass.setMaxAge(60*60*24*7);
					response.addCookie(cpass);
				}
					response.sendRedirect("/ServletExamplesCookie/WelcomePage");
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


