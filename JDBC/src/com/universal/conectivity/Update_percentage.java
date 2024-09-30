
package com.universal.conectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_percentage {
    public static void main(String[] args) {
        try{
           Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter new percentage=");
            float per=sc.nextFloat();
            System.out.println("Enter roll number where you want to update percentage=");
            int roll=sc.nextInt();
            
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            Statement smt=cn.createStatement();
            
             //Execute Query
            int i=smt.executeUpdate("update student set Percentage='"+per+"'where rollno="+roll);
            
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
