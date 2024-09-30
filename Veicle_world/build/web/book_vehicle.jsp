<%-- 
    Document   : book_vehicle
    Created on : Feb 23, 2024, 7:59:06 PM
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
    </head>
    <body>
        <%
            try {

                String vehicle_id = request.getParameter("vehicle_id");
                String name = request.getParameter("name");
                String mobile = request.getParameter("mobile");
                String email = request.getParameter("email");
                String date = request.getParameter("date");

               // Class.forName("com.mysql.cj.jdbc.Driver");

                //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE", "root", "");

               // Statement smt = cn.createStatement();
               Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();
                int i = smt.executeUpdate("insert into book_vehicle(vehicle_id,name,mobile,email,date) values(" + vehicle_id + ",'" + name + "','" + mobile + "','" + email + "','" + date + "')");

                if (i > 0) {
                    //out.print("Added");
                    out.println("your booking request has done please wait for conformation mail");
                }

               CreateConnection.closeConnection();
            } catch (Exception e) {
                out.println(e.getMessage());
            }


        %>

    </body>
</html>
