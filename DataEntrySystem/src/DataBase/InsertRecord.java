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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class InsertRecord {
     static int  id_count=0; 
    String first_name,last_name,country,city,course,department,college,university,Mastery_field,Phd_field;
     int year;
     static Connection conn=null;
     public InsertRecord(Connection conn){
         this.conn=conn;
     }
	public  InsertRecord(String first_name,String last_name,String country,String city,String course,int year,String department,String college){
            
            
		Statement stmt = null; 
		ResultSet rs = null;
		
		
		try{               
			stmt = conn.createStatement();
                        stmt.execute("SELECT * FROM UG");
                        rs = stmt.getResultSet();
                        rs.last();
                        id_count=rs.getRow();
                        String query="insert into UG (id,FirstName,LastName,Country,City,Course,Yearofstudy,Department,College) values(?,?,?,?,?,?,?,?,?)";
                        PreparedStatement ps=conn.prepareStatement(query);
                        ps.setInt(1, id_count);ps.setString(2, first_name);ps.setString(3, last_name);ps.setString(4,country);
                        ps.setString(5, city);ps.setString(6, course);ps.setInt(7, year);ps.setString(8, department);
                        ps.setString(9,college);
                        ps.executeUpdate();
			
			} 
		catch (SQLException ex){
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e){
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore
				stmt = null;
			}
			
		}
	}
       public InsertRecord(String first_name,String last_name,String country,String city,String course,String university,String Mastery_field,int year){

		
		Statement stmt = null; 
		ResultSet rs = null;
		
		
		try{             
			stmt = conn.createStatement(); 
                        stmt.execute("SELECT * FROM PG");
                        rs = stmt.getResultSet();
                        rs.last();
                        id_count=rs.getRow();
			String query="insert into PG  (id,FirstName,LastName,Country,City,Course,Yearofstudy,University,Mastery_field,Phd_field) values(?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement ps=conn.prepareStatement(query);
                        ps.setInt(1, id_count);ps.setString(2, first_name);ps.setString(3, last_name);ps.setString(4,country);
                        ps.setString(5, city);ps.setString(6, course);ps.setInt(7, year);ps.setString(8, university);
                        ps.setString(9,Mastery_field);ps.setString(10,null);
                         ps.executeUpdate();
			
			} 
		catch (SQLException ex){
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e){
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore
				stmt = null;
			}
			
		}
	}
       public  InsertRecord(String first_name,String last_name,String country,String city,String course,String university,int year,String Phd_field){
            
		
		Statement stmt = null; 
		ResultSet rs = null;
		
		
		try{               
			stmt = conn.createStatement();  
                        stmt.execute("SELECT * FROM PG");
                        rs = stmt.getResultSet();
                        rs.last();
                        id_count=rs.getRow();
			String query="insert into PG  (id,FirstName,LastName,Country,City,Course,Yearofstudy,University,Mastery_field,Phd_field) values(?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement ps=conn.prepareStatement(query);
                        ps.setInt(1, id_count);ps.setString(2, first_name);ps.setString(3, last_name);ps.setString(4,country);
                        ps.setString(5, city);ps.setString(6, course);ps.setInt(7, year);ps.setString(8, university);
                        ps.setString(9,null);ps.setString(10,Phd_field);
                        ps.executeUpdate();
			
			} 
		catch (SQLException ex){
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e){
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore
				stmt = null;
			}
			
		}
	}

    
    }


