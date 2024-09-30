
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First_filter implements Filter
{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
     PrintWriter out=response.getWriter();
     String name=request.getParameter("na");
     String age=request.getParameter("age");
     if(name.equals("")){
         out.println("please Enter the name");
     }
     else if(age.equals("")){
         out.println("please Enter the age");
     }
     else{
         out.println("<pre>");
         chain.doFilter(request, response);
         out.println("</pre>");
         out.println("<body bgcolor='aqua'>");
         out.println("<body>");
     }
    }
    
}