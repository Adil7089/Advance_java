// runtime me user se data vales leke data ko insert kar raha h
package com.universal.conectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_valuesdata {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("if you want to Insert data in table");
            
            System.out.println("Enter roll number=");
            int roll=sc.nextInt();
            System.out.println("Enter Name=");
            String name=sc.next();
            System.out.println("Enter percentage=");
            float per=sc.nextFloat();
            
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            Statement smt=cn.createStatement();
            
             //Execute Query
            int i=smt.executeUpdate("insert into student values("+roll+",'"+name+"',"+per+")");
            
            if(i>0)
            {
                System.out.println("Data insert");
            }
            
            //close connection
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
