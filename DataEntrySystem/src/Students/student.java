/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author HP
 */
public class student {
    protected String first_name,last_name,country,city,course;
    protected int year;
   protected void getdata(String first_name,String last_name,String country,String city,String course,int year){
        this.first_name=first_name;
        this.last_name=last_name;
        this.country=country;
        this.city=city;
        this.course=course;
        this.year=year;
    }
    void printdata(){
        System.out.println("First Name : "+first_name+"\nLast name : "+last_name+"\ncountry : "+country+"\ncity : "+city+"\ncourse : "+course+"year"+year);
    }
}
