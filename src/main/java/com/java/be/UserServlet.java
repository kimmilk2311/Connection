package com.java.be;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/usercomfirm","/usercomfirm/*"})
public class UserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		
		String fName = req.getParameter("FirstName");
        String lName = req.getParameter("LastName");	
        String DoB = req.getParameter("DoB");
        String PoB = req.getParameter("PoB");
        String Sex = req.getParameter("Sex");
        String[] freeDay = req.getParameterValues("freeday");
        
        User user = new User(fName, lName, DoB, PoB, Sex, freeDay);
        req.setAttribute("user", user); //yêu cầu đến user
        String url ="/Conform.jsp"; // đẩy tới file confom
        getServletContext().getRequestDispatcher(url).forward(req, res);
        
        PrintWriter printWriter = res.getWriter();
        printWriter.close();
	}
}