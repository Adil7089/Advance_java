<%-- 
    Document   : fetch
    Created on : Feb 2, 2024, 4:24:41 PM
    Author     : welcome
--%>

<%@page import="java.sql.ResultSet"%>
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
        body{
            background-color: cyan
        }
        table{
            text-align: center;
            font-size: 28px;
            
        }
    </style>
    <body>
   <%
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
%>
<table border="2">
    <tr>
        <th>Roll no</th>
        <th>Name</th>
        <th>Percentage</th>
        <th>Edit</th>
        <th>Delete</th></tr>

      <%
		while(rs.next())
                {
            String roll=rs.getString(1);
            String name=rs.getString(2);
            String per=rs.getString(3);
      %>
            
            <tr>
                <td><%=roll%></td>
                <td><%=name%></td>
                <td><%=per%></td>
                <td><a href="edit.jsp?rolll=<%=roll%>">Edit</a></td>
                <td><a href="delete.jsp?roll=<%=roll%>">Delete</a></td>
            </tr>  
            
        <%    
        }
        out.println("</table>");
        cn.close();
         
        }
        catch(Exception e)
        {
          out.print(e.getMessage());
        }
            
            
        %>
    </body>
</html>
