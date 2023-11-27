package com.java.be;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
	protected static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=Connection;integratedSecurity=true;";
        String user = "sa";
        String password = "12345";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("connected!");
        return con;
    }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c = dbConnect.initializeDatabase();
		Statement stm = c.createStatement();
		
		String SQL = "select * from UserName";
        ResultSet rs = stm.executeQuery(SQL);

        while (rs.next()) {
            System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
        }
         
	}
	
}

