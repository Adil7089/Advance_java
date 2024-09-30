
package com.universal.connection;

import java.sql.DriverManager;
import java.sql.Connection;

public class CreateConnection {
    
static Connection cn=null;
public static Connection getConnection()
{
   
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");
             
              cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
             
   }
   catch(Exception e)
   {
       System.out.println(e.getMessage());
   }
   return cn;
}
    public static void closeConnection()
    {
        try
        {
           
       
        cn.close();
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
}
