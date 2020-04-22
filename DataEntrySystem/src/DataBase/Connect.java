/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author HP
 */
import java.sql.*;
public class Connect {
    Connection conn = null;
    public Connection ct_open(){
        
        try{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/Students";
			//Class.forName ("com.mysql.jdbc.Driver").newInstance (); // This is depricated
			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();// This is the newest driver
			conn = DriverManager.getConnection (url, userName, password);
			System.out.println ("Database connection established");
		}
		catch (Exception e) {
			System.err.println ("Cannot connect to database server:"+e);
                        System.out.println ("Database connection terminated:"+e);
		}
        return conn;
    }
     public Connection ct_close() throws SQLException{
                        if (conn != null) {
				
					conn.close();
                        }
					
				
                return conn;
     }
    
}
