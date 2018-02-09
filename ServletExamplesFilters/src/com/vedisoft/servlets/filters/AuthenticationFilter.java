package com.vedisoft.servlets.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/*")
public class AuthenticationFilter implements Filter {

	private ServletContext context;

	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("AuthenticationFilter initialized");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURI();
		this.context.log("Requested Resource::" + uri);
		System.out.println("URI: " + uri);

		if ((uri.endsWith("LoginForm") || (uri.endsWith("LoginServlet")))) {
			this.context.log("Home Page Access");
			chain.doFilter(request, response);
		} else {
			HttpSession session = req.getSession();
			String username = new String();
			String password = new String();
			if (session != null) {
				username = (String) session.getAttribute("username");
				password = (String) session.getAttribute("password");

				if (username != null && password != null && username.equals("admin") && password.equals("admin"))
					chain.doFilter(request, response);
				else
					res.sendRedirect("LoginForm");
			}
		}

	}

	public void destroy() {
		// close any resources here
	}
}
