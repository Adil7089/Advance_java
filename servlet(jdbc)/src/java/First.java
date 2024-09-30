
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
         
        
        out.print("Hello");
        
        try{
       String roll=req.getParameter("roll");
        String name=req.getParameter("n");
        String per=req.getParameter("per");
        
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
                out.println("Data insert");
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
 
    