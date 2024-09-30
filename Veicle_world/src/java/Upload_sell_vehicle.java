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
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author welcome
 */
public class Upload_sell_vehicle extends HttpServlet {

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
        //out.println("hello");
         try
    {
        HttpSession hs=request.getSession(false);
              String id=(String)hs.getAttribute("id");
              //out.println(id);
              
        String vehicle_type=request.getParameter("vehicle_type");
        String vehicle_name=request.getParameter("vehicle_name");
        String vehicle_ragistration=request.getParameter("vehicle_registration");
        String vehicle_engine=request.getParameter("engine_type");
        String vehicle_oprating=request.getParameter("operating_type");
        String vehicle_price=request.getParameter("vehicle_price");
        String description=request.getParameter("Description");
        
   
 // out.print(vehicle_type);
  //out.print(vehicle_name);
  //out.print(vehicle_price);
  //out.print(vehicle_ragistration);
  
    //      out.print(vehicle_engine);
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
		
		
	//Statement smt=cn.createStatement();
		
		//execute query
                 Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();
		
int i=smt.executeUpdate("insert into sell_vehicle(vehicle_type,vehicle_name,vehicle_ragistration,vehicle_engine,vehicle_oprating,vehicle_price,description,user_id) values('"+vehicle_type+"','"+vehicle_name+"',"+vehicle_ragistration+",'"+vehicle_engine+"','"+vehicle_oprating+"',"+vehicle_price+",'"+description+"',"+id+")");
		
		if(i>0)
                {
                   // out.println("Data insert"); 
                   
             out.println("<form action='image_upload.jsp' method='post'enctype='multipart/form-data'>");
out.println("<input type='file' name='File'/><br>");

out.println("<input type='submit' value='Upload File'/>");
out.println("</form>");

//HttpSession hs=request.getSession(false);
//            
//           String user_id=(String)hs.getAttribute("user_id");
//           out.println(user_id);
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
