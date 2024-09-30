
package com.universal.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_data {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
           
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
            
            //make statement object
            PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?)");
           
            ps.setInt(1 , roll);
            ps.setString(2 , name);
            ps.setFloat(3 , per);
            
            //Execute Query
            boolean b=ps.execute();
            if(b==false) // false ka data insert ho gaya h our agar true hua to data insert nhi hua h 
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
