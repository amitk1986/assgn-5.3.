package com.diablo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Converter
 */
@WebServlet("/Converter")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pp = response.getWriter();
		pp.println("<!DOCTYPE html>");
		pp.println("<HTML>");
	    pp.println("<TITLE>convertor</TITLE>");
	    pp.println("<BODY>"); 
		pp.println("<form method='post' action='Converter'>");
		pp.println("<input type='text' placeholder='Dollars' name='rupees'>");
		pp.println("<input type='submit' value=' dollars to rupees'>");
		pp.println("</form>");
		pp.println("</body>");
		pp.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  i = request.getParameter("rupees");
		 int j = Integer.parseInt(i);
		 j = j*71;
		 PrintWriter pw = response.getWriter();
		 pw.println(i+" dollars = "+j+" rupees");
	}

}
