<%-- 
    Document   : show_request
    Created on : Feb 23, 2024, 8:34:32 PM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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

                //Class.forName("com.mysql.cj.jdbc.Driver");
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VlE","root","");
                //Statement smt=cn.createStatement();
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                ResultSet rs = smt.executeQuery("select * from book_vehicle");

        %>
        <table border="2" align="center">
            <tr>
                <th>vehicle_id</th>
                <th>Name</th>
                <th>Mobile</th>
                <th>email</th>
                <th>Booking_date</th>
                <th>confirm_booking</th>
                <th>cancel_Booking</th>
            </tr>

            <tr>
                <%            while (rs.next()) {

                        String vehicle_id = rs.getString(2);
                        String name = rs.getString(3);
                        String mobile = rs.getString(4);
                        String email = rs.getString(5);
                        String date = rs.getString(6);

                %>
                <td><%=vehicle_id%></td>
                <td><%=name%></td>
                <td><%=mobile%></td>
                <td><%=email%></td>
                <td><%=date%></td

            <tr>

                <td><a href="confirm_booking.jsp?id=<%=email%>">confirm</a></td>
                <td><a href="cancel_booking.jsp?id=<%=email%>">cancel</a></td>

            </tr> 

            <%

                    }
                    CreateConnection.closeConnection();
                    out.println("</table>");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            %>
    </body>
</html>
