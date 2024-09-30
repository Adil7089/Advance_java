

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


public class Fetches extends HttpServlet {

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
        
     //Load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
		
		//Make the statement object
		
	Statement smt=cn.createStatement();
		
		//execute query
ResultSet rs=smt.executeQuery("select * from student");
	

out.println("<table border='2' align='center'>");
out.println("<caption><h2>Student List</h2></caption>");
out.println("<tr><th>Roll no</th><th>Name</th><th>Percentage</th><th>Edit</th><th>Delete</th></tr>");

while(rs.next())
{
    
    String roll=rs.getString(1);
    String name=rs.getString(2);
    String per=rs.getString(3);
    
   out.println("<tr><td>"+roll+"</td><td>"+name+"</td><td>"+per+"</td><td><a href='Edit?rolll="+roll+"'><center><img src='image/Edit.png' height='20%' width='20%'></center></a></td><td><a href='Delete?roll="+roll+"'><center><img src='image/Delete.png' height='20%' width='20%'></center></a></td></tr>");  

}



		
        
        cn.close();
    }
     catch(Exception e)
     {
         System.out.println(e.getMessage());  
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
