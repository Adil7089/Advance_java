/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class Edit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        String roll=request.getParameter("rolll");
        String name="",per="";
        //out.println("hello="+roll);
        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/CLG","root","root");
               Statement smt=cn.createStatement();
            ResultSet rs=smt.executeQuery("select * from student where rollno="+roll);
        if(rs.next())
        {
            name=rs.getString(2);
            per=rs.getString(3);
        }
        cn.close();
        
    }
      catch(Exception e)
      {
          out.println(e.getMessage());
      }
        out.println("<form action='UpdateData' method='get'>");
        out.println("<pre>");
        out.println("<input type='text' name='roll' value='"+roll+"' readonly>");
        out.println("<input type='text' name='n'value='"+name+"'>");
out.println("<input type='text' name='per' value='"+per+"'>");
      out.println("<input type='submit' value='Update'>");
            out.println("</pre>");   
        out.println("</form>");       
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
