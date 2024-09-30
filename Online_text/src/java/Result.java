/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class Result extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter(); 
         
       try {
           String name=request.getParameter("Name");
           String email=request.getParameter("email");
           String Mo=request.getParameter("Mo");
           
            String Q1=request.getParameter("b");
            String Q2=request.getParameter("c");
            String Q3=request.getParameter("a");
            String Q4=request.getParameter("isro");
            String Q5=request.getParameter("p");
            String Q6=request.getParameter("r");
            String Q7=request.getParameter("s");
            String Q8=request.getParameter("vice");
            String Q9=request.getParameter("l");
            String Q10=request.getParameter("su");
            
            
            int n1=Integer.parseInt(Q1);
            int n2=Integer.parseInt(Q2);
            int n3=Integer.parseInt(Q3);
            int n4=Integer.parseInt(Q4);
            int n5=Integer.parseInt(Q5);
            int n6=Integer.parseInt(Q6);
            int n7=Integer.parseInt(Q7);
            int n8=Integer.parseInt(Q8);
            int n9=Integer.parseInt(Q9);
            int n10=Integer.parseInt(Q10);
            
            int marks=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)*10;
            out.print("<h1>your score</h1>"+"<h1>"+marks+"%</h1>");
            
            
            if(marks>=70)
            {
                out.println("<h2>congratulation you are Selected</h2>");
            }
            else
            {
                out.print("<h2>sorry you are not Selected becuse your score less then 70%</h2>");
            }
            
             //Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create Connection Object
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
            
            //make Statement object
            Statement smt=cn.createStatement();
            
            //Execute Query
          int i=smt.executeUpdate("insert into result_test (Name,emil_id,Mobile_No,Marks) values('"+name+"','"+email+"','"+Mo+"','"+marks+"')"		);
		
            if(i>0)
            {
                System.out.println("data insert");
            }
       }
           
            catch(Exception e){
                    out.print(e.getMessage());
                    }
            
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
