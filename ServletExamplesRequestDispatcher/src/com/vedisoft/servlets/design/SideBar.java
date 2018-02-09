package com.vedisoft.servlets.design;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SideBar
 */
@WebServlet("/SideBar")
public class SideBar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SideBar() {
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
		out.println("<div class=\"sidebar\">");
		out.println("<div class=\"gadget\">");
		out.println("<h2 class=\"star\"><span>Sidebar</span> Menu</h2>");
		out.println("<ul class=\"sb_menu\">");
		out.println("<li><a href=\"#\">Home</a></li>");
		out.println("<li><a href=\"#\">Income Categories</a></li>");
		out.println("<li><a href=\"#\">Expense Categories</a></li>");
		out.println("<li><a href=\"#\">Incomes</a></li>");
		out.println("<li><a href=\"#\">Expenses</a></li>");
		out.println("</ul>");
		out.println("</div>");
		out.println("<div class=\"gadget\">");
		out.println("<h2 class=\"star\"><span>Reports</span></h2>");
		out.println("<ul class=\"ex_menu\">");
		out.println(
				"<li><a href=\"http://www.dreamtemplate.com\" title=\"Website Templates\">Day Book</a><br />Records Daily Incomes and Expenses</li>");
		out.println(
				"<li><a href=\"http://www.templatesold.com\" title=\"WordPress Themes\">Cash Book</a><br />Records Daily Cash Transactions</li>");
		out.println(
				"<li><a href=\"http://www.imhosted.com\" title=\"Affordable Hosting\">Bank Book</a><br />Records Daily Bank Transactions</li>");
		out.println(
				"<li><a href=\"http://www.dreamstock.com\" title=\"Stock Photos\">Profit & Loss Account</a><br />Records Profit and Loss details</li>");
		out.println(
				"<li><a href=\"http://www.evrsoft.com\" title=\"Website Builder\">Balance Sheet</a><br />Displays Balance sheet</li>");
		
		out.println("</ul>");
		out.println("</div>");
		out.println("      </div>");
		out.println("<div class=\"clr\"></div>");
		out.println("</div>");
	}

}
