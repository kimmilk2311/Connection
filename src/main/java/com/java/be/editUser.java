package com.java.be;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/edit","/edit/*"})
public class editUser  extends HttpServlet {
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
        
        try {
			Connection c = dbConnect.initializeDatabase();
			
			Statement stm = (Statement) c.createStatement();
			ResultSet rs = ((java.sql.Statement) stm).executeQuery("select top 1 idUser from [USERNAME] order by idUser desc");
			int idUser = 0;
			while(rs.next()) {
	            	idUser = rs.getInt("idUser");
	            }
	            System.out.println(idUser);
	        String sql = "update [USERNAME] set firstName=?, lastName=?, doB=?, poB=?, sex=? where idUser=?";
	        PreparedStatement pstm = c.prepareStatement(sql);
	        pstm.setString(1, fName);
            pstm.setString(2, lName);
            pstm.setString(3, DoB);
            pstm.setString(4, PoB);
            pstm.setString(5, Sex);
            pstm.setInt(6, idUser);
            
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            session.setAttribute("idUser", idUser);
            String url = "/Confirm.jsp";
            getServletContext().getRequestDispatcher(url).forward(req, res);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}

