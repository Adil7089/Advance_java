/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.universal.connection.CreateConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author welcome
 */
public class user_ragister extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       try{
         
            String uname=request.getParameter("uname");
            String password=request.getParameter("password");
            String mobile=request.getParameter("mobile");
            String email=request.getParameter("email");
            
            
        
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		
    //Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
		
		//Make the statement object
		
	//Statement smt=cn.createStatement();
		//execute query
                 Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();
int i=smt.executeUpdate("insert into vehicle (user_name,user_id,user_mobile,user_password) values('"+uname+"','"+email+"','"+mobile+"','"+password+"')");
		
		if(i>0)
                {
                    //out.println("Data delete"); 
                   out.print("your ragistration completed");
                RequestDispatcher rd=request.getRequestDispatcher("index.html");
                rd.include(request,response);
                    
                }
        
        CreateConnection.closeConnection();
    }
    catch(Exception e)
    {
        out.println(e.getMessage());
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
