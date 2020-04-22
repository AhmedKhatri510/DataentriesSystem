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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class ShowData extends Connect{
    String first_name,last_name,country,city,course,department,college,university,Mastery_field,Phd_field;
    int year;
    static Connection conn=null;
    public ShowData(Connection conn){
        this.conn=conn;
    }
   public ShowData(String TableName) throws SQLException{
try{
		Statement stmt = null; 
		ResultSet rs = null;
              stmt = conn.createStatement(); 
              stmt.execute("SELECT * FROM "+TableName);
              rs = stmt.getResultSet();
              if(TableName.equals("UG") || TableName.equals("ug")){
              while (rs.next()) {
			first_name = rs.getString("FirstName");
			last_name = rs.getString("LastName");
			country= rs.getString("Country");
			city = rs.getString("City");
                        course=rs.getString("Course");
                        year=rs.getInt("Yearofstudy");
                        department=rs.getString("Department");
                        college=rs.getString("College");
			System.out.print("\nFirst name : "+first_name+"\tlast_name : "+last_name);
                        System.out.print("\tcountry : "+country+"\tcity : "+city+"\tcourse : "+course);
                        System.out.print("\tcollege : "+college+"\tdepartment : "+department+"\tyear of study : "+year);
			}
              }
              else{
                  while (rs.next()) {
                  first_name = rs.getString("FirstName");
			last_name = rs.getString("LastName");
			country= rs.getString("Country");
			city = rs.getString("City");
                        course=rs.getString("Course");
                        year=rs.getInt("Yearofstudy");
                        university=rs.getString("University");
                        Mastery_field=rs.getString("Mastery_field");
                        Phd_field=rs.getString("Phd_field");
                        System.out.print("\tFirst name : "+first_name+"\tlast_name : "+last_name);
          System.out.print("\tcountry : "+country+"\tcity : "+city+"\tcourse : "+course);
          System.out.print("\tuniversity : "+university);
          if(     Phd_field == null){
              System.out.println("\tMastery_field : "+Mastery_field);
          }else{
              System.out.println("\tPhd_field : "+Phd_field);
          }
                  System.out.println("\tYearOfStudy : "+year);
                  
              }
          }
    }
    catch(Exception e){
        
    }
   }
}
