
package com.universal.conectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Result_set {
    public static void main(String[] args) {
        try
        {
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            Statement smt=cn.createStatement();
            
             //Execute Query
            ResultSet rs=smt.executeQuery("select*from student");
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
            }
            
        /* inme se koi bhi while use kar sakte h   
          2.  while(rs.next())
            {
                String roll=rs.getString(1);
                String name=rs.getString(2);
                String per=rs.getString(3);
                System.out.println(roll+":"+name+":"+per);
            }
          
          3.  while(rs.next())
            {
                String roll=rs.getString("Rollno");
                String name=rs.getString("Name");
                String per=rs.getString("Percentage");
                System.out.println(roll+":"+name+":"+per);
            }
          */
            
            //close connection
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        
    }
}
