//isme servlet me hame ayk hi mathed ko override karna padta h khud se baki ki four implements kra sakte h
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    PrintWriter pw=res.getWriter();
    pw.println("hello");
    }
    
    
}
