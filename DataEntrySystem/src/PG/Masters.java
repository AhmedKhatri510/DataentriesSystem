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
public class Masters extends student {
    String university,Mastery_field;
    public void getdata(String first_name,String last_name,String country,String city,String course,int year,String university,String Mastery_field){
        super.getdata(first_name,last_name,country,city,course,year);
        this.Mastery_field=Mastery_field;

        this.university=university;
        
    }
    public void printdata(){
        System.out.println("\nFirst name : "+first_name+"\nlast_name : "+last_name);
          System.out.println("country : "+country+"\ncity : "+city+"\ncourse : "+course);
          System.out.println("university : "+university+"\nMastery_field : "+Mastery_field+"\nyear of study : "+year);
    }
    
}
