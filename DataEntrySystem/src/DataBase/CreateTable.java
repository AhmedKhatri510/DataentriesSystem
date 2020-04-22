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
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CreateTable {
    Scanner sc=new Scanner(System.in);
   static Connection conn=null;
    public CreateTable(Connection conn){
        this.conn=conn;
        
    }
   
  
	public CreateTable(String TableName){
                
		Statement stmt = null; 
		ResultSet rs = null;
		try  {
                    
			stmt = conn.createStatement();
                        
			//Creating table
                        if(TableName.equals("ug") || TableName.equals("UG")){
                            
                            stmt.execute("create table "+TableName+"(id Integer primary key,FirstName Varchar(30), LastName Varchar(30), Country Varchar(30) , City Varchar(30), Course Varchar(30),Yearofstudy Integer ,Department Varchar(30),College Varchar(30))"); 
                        }
                        else if(TableName.equals("pg") || TableName.equals("PG")){
                            stmt.execute("create table "+TableName+"(id Integer primary key,FirstName Varchar(30), LastName Varchar(30), Country Varchar(30) , City Varchar(30), Course Varchar(30),yearofstudy Integer, University Varchar(30),Mastery_field Varchar(30),Phd_field Varchar(30))"); 
                        }
		} catch (SQLException ex){
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e){
                    System.out.println(""+e.getCause());
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {}
				stmt = null; 
			}
			
			}	   
		} 
        }

