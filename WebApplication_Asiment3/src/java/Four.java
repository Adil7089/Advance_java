
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Four implements Servlet
{

    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter pw=res.getWriter();
    
    String num1=req.getParameter("no1");
    
    int n1=Integer.parseInt(num1);
    
    if(n1<=18)
    {
        pw.println("this person is Not eligible for vote");
    }
    else {
         pw.println("this person is eligible for vote");
    }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        
    
  }



}