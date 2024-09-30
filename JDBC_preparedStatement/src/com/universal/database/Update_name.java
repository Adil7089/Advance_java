
package com.universal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_name {
     public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter new Name=");
            String name=sc.next();
            System.out.println("Enter roll number where you want to update name=");
            int roll=sc.nextInt();
            
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            PreparedStatement ps=cn.prepareStatement("update student set name=? where rollno=?");
            ps.setString(1, name);
            ps.setInt(2, roll);
            
            //Execute Query
            boolean b=ps.execute();
            if(!b) // iska means h false jub data update hoga jub fakse hoga h our agar true hua to data update nhi  nhi hua h 
            {
                System.out.println("Data update");
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