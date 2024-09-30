
package com.universal.conectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insert_data {
    public static void main(String[] args) {
        try{
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            Statement smt=cn.createStatement();
            
            //Execute Query
            int i=smt.executeUpdate("insert into student values(104,'Adil',86.7)");
            
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
