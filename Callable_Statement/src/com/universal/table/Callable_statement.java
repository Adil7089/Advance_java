
package com.universal.table;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Callable_statement {
    public static void main(String[] args) {
        try
        {
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
         CallableStatement cs=cn.prepareCall("call insert_update(103,'sameer',85,'sohan',105)");
             boolean b=cs.execute();
             if(b!=true)
             {
                 System.out.println("Data update");
             }
             else
             {
                 System.out.println("Data not update");
             }
             
             cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
