package com.java.be;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
    public static void main(String[] args) throws SQLException {
        Connection c = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cURL = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=unitest;integratedSecurity=true;";
            String user = "sa";
            String password = "12345";
            c = DriverManager.getConnection(cURL, user, password);
            Statement stm = c.createStatement();

            String SQL = "select * from Khachhang";
            rs = stm.executeQuery(SQL);

            System.out.println("connected!");

            while (rs.next()) {
                System.out.println(rs.getString("Idkhachhang") + " " + rs.getString("diachi"));
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("connection failed!");
            e.printStackTrace();
        }
    }
}