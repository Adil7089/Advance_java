<%-- 
    Document   : rental_vehicle
    Created on : Feb 14, 2024, 7:08:17 PM
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
        <style>
            body{
                background-color: aqua
            } 
           
            table{
                font-size: 30px;
            }
            td{
                color:beige
            }
            h2{
               font-weight: bold;
               text-transform: capitalize; 
            }
            a{
                font-size: 34px;
            }
        </style>
       
    </head>
    <body>
       <%
        String id=request.getParameter("id");
        %>
             <h1>User id:<%=id%></h1>
    <center>
          <form action="book_vehicle.jsp" method="put">
              <h2> Book_vehicle</h2>
        <table border="2">
            <tr>
                <td><label>vehicle_id</label></td>
                <td><input type="text" name="vehicle_id"  value="<%=id%>" placeholder="Enter name" readonly></td>
            </tr>
            <tr>
                <td><label>Name</label></td>
                <td><input type="text" name="name"  value="" placeholder="Enter name" required></td>
            </tr>
<!--            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="pass" value="" placeholder="Enter password" required></td>
            </tr>-->
            
             <tr>
                <td><label>email</label></td>
                <td><input type="email" name="email" value="" placeholder="Enter email" required></td>
            </tr>
             <tr>
                <td><label>mobile</label></td>
                <td><input type="text" name="mobile" value="" placeholder="Enter mobile" required></td>
            </tr>
             <tr>
                <td><label>Booking_date</label></td>
                <td><input type="date" name="date"  value=""  placeholder="select date" required></td>
            </tr>
            <tr>
                <td colspan="2" ><input type="submit" value="Book" >
                <input type="reset" value="Reset"></td>
            </tr>
            
        </table>
            </form>
    </center>

            
            

      
     

       
    
    
    </body>
</html>
