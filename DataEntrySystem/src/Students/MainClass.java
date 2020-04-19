/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;
import Students.*;
import UG.*;
import PG.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    Scanner sc=new Scanner(System.in);
    String fn,ln,country,city,course,department,college;
    int yearofstudy;
    void Studentdetail(){
        
        
        System.out.println("First name : ");
        fn=sc.nextLine();
        System.out.println("Last name : ");
        ln=sc.nextLine();
        System.out.println("Country : ");
        country=sc.nextLine();
        System.out.println("City : ");
        city=sc.nextLine();
        System.out.println("course : ");
        course=sc.nextLine();
         System.out.println("Year of Study : ");
        yearofstudy=Integer.parseInt(sc.nextLine());
    }
    void UGdetail(){
        
        UG u =new UG();
    System.out.println("department : ");
        department=sc.nextLine();
        System.out.println("College : ");
        college=sc.nextLine();
        u.getdata(fn, ln, country, city, course,  yearofstudy,department, college);
        u.printdata();
    }
    void Mastersdetail(){
        Masters m = new Masters();
        String Mastery_field,university;
        System.out.println("university : ");
        university=sc.nextLine();
        System.out.println("Masters field : ");
        Mastery_field=sc.nextLine();
        m.getdata(fn, ln, country, city, course, yearofstudy,university,Mastery_field);
        m.printdata();
    }
    void Phddetail(){
        Phd p = new Phd();
        String Phd_field,university;
        System.out.println("university : ");
        university=sc.nextLine();
        System.out.println("Phd field : ");
        Phd_field=sc.nextLine();
        p.getdata(fn, ln, country, city, course, yearofstudy,university,Phd_field);
        p.printdata();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MainClass s = new MainClass();
        System.out.println("Student of UG or PG");
        String choice =sc.nextLine();
        if(choice.equals("UG") || choice.equals("ug") ){
            s.Studentdetail();
            s.UGdetail();
        }
        else if(choice.equals("PG") || choice.equals("pg") ){
            System.out.println("Pursuing Master's or Phd ");
            choice =sc.nextLine();
            
            if(choice.equals("Master's")  || choice.equals("masters")  || choice.equals("Masters")  || choice.equals("master's") ){
                s.Studentdetail();
                s.Mastersdetail();
            }
            else{
                s.Studentdetail();
                s.Phddetail();
            }
        }
        else{
            System.out.println("Invalid choice");
        }
        /*System.out.println("First name : ");
        fn=sc.nextLine();
        System.out.println("Last name : ");
        ln=sc.nextLine();
        System.out.println("Country : ");
        country=sc.nextLine();
        System.out.println("City : ");
        city=sc.nextLine();
        System.out.println("course : ");
        course=sc.nextLine();
        System.out.println("Year of Study : ");
        yearofstudy=Integer.parseInt(sc.nextLine());
        System.out.println("department : ");
        department=sc.nextLine();
        System.out.println("College : ");
        college=sc.nextLine();
        u.getdata(fn, ln, country, city, course,  yearofstudy,department, college);
        u.printdata();
        */
        
       
    }
    
}
