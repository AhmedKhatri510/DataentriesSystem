/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PG;
import Students.*;
/**
 *
 * @author HP
 */
public class Phd extends student{
    String Phd_field,university;
    public void getdata(String first_name,String last_name,String country,String city,String course,int year,String university,String Phd_field){
        super.getdata(first_name,last_name,country,city,course,year);
        this.university=university;
        this.Phd_field=Phd_field;
    }
    public void printdata(){
        System.out.println("\nFirst name : "+first_name+"\nlast_name : "+last_name);
          System.out.println("country : "+country+"\ncity : "+city+"\ncourse : "+course);
          System.out.println("university : "+university+"\nPhd_field : "+Phd_field+"\nyear of study : "+year);
    }
}
