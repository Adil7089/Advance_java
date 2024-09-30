<%-- 
    Document   : update
    Created on : Feb 2, 2024, 4:45:37 PM
    Author     : welcome
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <%
 try
    {
        String roll=request.getParameter("roll");
        String name=request.getParameter("n");
        String per=request.getParameter("per");
   
    //out.println(roll+":"+name+":"+per);
    
      //Load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
		
		//Make the statement object
		
	Statement smt=cn.createStatement();
		
		//execute query
int i=smt.executeUpdate("update student set Name='"+name+"',Percentage="+per+" where Rollno="+roll);
		
         if(i>0)
           {
                RequestDispatcher rd=request.getRequestDispatcher("fetch.jsp");
                rd.forward(request, response);
                    }
        
        cn.close();
    }
    catch(Exception e)
    {
        out.println(e.getMessage());
    }
            
   %>
    </body>
</html>
