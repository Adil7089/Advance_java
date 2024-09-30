<%-- 
    Document   : insert
    Created on : Feb 2, 2024, 4:30:35 PM
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
    <style>
        h1{
            background-color: burlywood
        }
    </style>
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
  int i=smt.executeUpdate("insert into student values("+roll+",'"+name+"',"+per+")");
		
		if(i>0)
                {
                %>
                <h1> your Data succesfull insert</h1>
                <%
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
