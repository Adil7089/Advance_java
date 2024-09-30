<%-- 
    Document   : fetches_rental_rent
    Created on : Feb 13, 2024, 9:44:44 PM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
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
        <style>
            body{
                background-color: khaki;
            }
            table{
                text-align: center;
            }
        </style>
    </head>
    <body>
         <%
         try
         {
         String vehicle_type=request.getParameter("vehicle_type");
         //Load the driver class
		
	//Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection
		
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
		
     //Make the statement object
		
	//Statement smt=cn.createStatement();
        Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();
		
		//execute query
ResultSet rs=smt.executeQuery("select * from rental_vehicle where vehicle_type='"+vehicle_type+"'");
%>
    <center>
        <h2>Vehicle_informations</h2>
<table border="2">
    <tr>
        <th>id</th>
        <th>vehicle_name</th>
        <th>vehicle_type</th>
        <th>Rent_Rate</th>
        <th>Book</th>
    </tr>
        

      <%
		while(rs.next())
                {
            String id=rs.getString(1);
            String vehicle_name=rs.getString(2);
            //String vehicle_type=rs.getString(3);
             String Rent_Rate=rs.getString(4);
              
      %>
            
            <tr>
                <td><%=id%></td>
                <td><%=vehicle_name%></td>
                <td><%=vehicle_type%></td>
                <td><%=Rent_Rate%></td>
                
                <td><a href="rental_book.jsp?id=<%=id%>">Book></td>
                
            </tr>  
            
        <%    
        }
        out.println("</table>");
         CreateConnection.closeConnection();
        }
        catch(Exception e)
        {
          out.print(e.getMessage());
        }
            
            
        %>
        </center>
    </body>
</html>

    

