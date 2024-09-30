import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class Insert_data {
    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            
            //make statement Object
            Statement smt=cn.createStatement();
            
            //Execute Query
            int i=smt.executeUpdate("insert into result values(1001,Adi,306,76)");
            
          if(i>0)
          {
              System.out.println("Data insert");
              
          }
          
          //close the connection
          cn.close();
            
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
}
