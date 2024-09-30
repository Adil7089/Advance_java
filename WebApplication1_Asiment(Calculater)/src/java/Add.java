    
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Add implements Servlet
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
           
           String num2=req.getParameter("no2");
          
           int n1=Integer.parseInt(num1);
           int n2=Integer.parseInt(num2);
           
           int n3=n1+n2;
           pw.print("<b>value="+n3+"<b/>");
           
            
           
           
    }
    
    @Override
    public String getServletInfo() {
        return null;
}

    @Override
    public void destroy() {
      
    }
  }

