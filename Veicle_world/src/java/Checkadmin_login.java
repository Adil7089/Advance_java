/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import com.universal.connection.CreateConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author welcome
 */
public class Checkadmin_login extends HttpServlet {

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
        
    try
    {
    //out.println("hello");
            String password=request.getParameter("password");
            
            String user_id=request.getParameter("email_id");
           
    
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
		
		
		Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();
	//Statement smt=cn.createStatement();
		
ResultSet rs=smt.executeQuery("select*from admin where email_id='"+user_id+"' and  binary password="+password);
		
		if(rs.next())
                {
                    //String name=rs.getString("Name");
                    //out.println("Data delete");
                    int id=rs.getInt(1);
                    HttpSession hs=request.getSession(true);
                    hs.setAttribute("user_id",user_id);
                    hs.setAttribute("password",password);
                    
                   
                    out.println("<h1>your login Sucessfuly</h1>");
                RequestDispatcher rd=request.getRequestDispatcher("Home_user");
                rd.include(request,response);
                
                 //out.print("<a href="Add_rentalv_vehicle">Add_rental_vehicle</a>");
                }
                    else{
                out.println("<h2>Invalid Email and password please enter true password ");
                 RequestDispatcher rd=request.getRequestDispatcher("admin_login.html");
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
