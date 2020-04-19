/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UG;
import Students.student;
/**
 *
 * @author HP
 */
public class UG extends student{
    String department,college;
  
     public void getdata(String first_name,String last_name,String country,String city,String course,int year,String department,String college){
            super.getdata( first_name, last_name, country, city, course,year);
            this.department=department;
         
            this.college=college;
       }
     public  void printdata(){
          System.out.println("\nFirst name : "+first_name+"\nlast_name : "+last_name);
          System.out.println("country : "+country+"\ncity : "+city+"\ncourse : "+course);
          System.out.println("college : "+college+"\ndepartment : "+department+"\nyear of study : "+year);
      }

    
}