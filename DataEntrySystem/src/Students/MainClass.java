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
import DataBase.*;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    Scanner sc=new Scanner(System.in);
   static String fn,ln,country,city,course,department,college;
   static String Mastery_field,university;
   static String Phd_field;
    static int yearofstudy;
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
       // u.getdata(fn, ln, country, city, course,  yearofstudy,department, college);
       // u.printdata();
    }
    void Mastersdetail(){
        Masters m = new Masters();
        
        System.out.println("university : ");
        university=sc.nextLine();
        System.out.println("Masters field : ");
        Mastery_field=sc.nextLine();
       // m.getdata(fn, ln, country, city, course, yearofstudy,university,Mastery_field);
       // m.printdata();
    }
    void Phddetail(){
        Phd p = new Phd();
        
        System.out.println("university : ");
        university=sc.nextLine();
        System.out.println("Phd field : ");
        Phd_field=sc.nextLine();
       // p.getdata(fn, ln, country, city, course, yearofstudy,university,Phd_field);
        //p.getdata(fn, ln, country, city, course, yearofstudy,university,Phd_field);
        //p.printdata();
    }
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MainClass s = new MainClass();
        Connect c=new Connect();
        Connection conn=null;
        conn=c.ct_open();
        System.out.println("Student of UG or PG");
        String choice =sc.nextLine();
        CreateTable Ct=new CreateTable(conn);
        InsertRecord ir=new InsertRecord(conn);
        ShowData sr =new ShowData(conn);
        String temp;
        if(choice.equals("UG") || choice.equals("ug") ){
            new CreateTable(choice);
            s.Studentdetail();
            s.UGdetail();
            
            new InsertRecord(conn);
             new InsertRecord(fn, ln, country, city, course,yearofstudy,department, college);
            new ShowData(choice);
            c.ct_close();
            
        }
        else if(choice.equals("PG") || choice.equals("pg") ){
             temp=choice;
            System.out.println("Pursuing Master's or Phd ");
            choice =sc.nextLine();
            new CreateTable(temp);
            if(choice.equals("Master's")  || choice.equals("masters")  || choice.equals("Masters")  || choice.equals("master's") ){
                s.Studentdetail();
                s.Mastersdetail();
                new InsertRecord(fn, ln, country, city, course,university,Mastery_field,yearofstudy);
                new ShowData(temp);
                c.ct_close();
            }
            else{
                s.Studentdetail();
                s.Phddetail();
                new InsertRecord(fn, ln, country, city, course,university,yearofstudy,Phd_field);
                new ShowData(temp);
                c.ct_close();
            }
        }
        else{
            System.out.println("Invalid choice");
        }
        
        
       
    }
    
}