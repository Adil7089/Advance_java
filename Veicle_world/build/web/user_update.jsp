<%-- 
    Document   : user_update
    Created on : Feb 13, 2024, 7:08:47 PM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
                String user_name = request.getParameter("name");
                String user_mobile = request.getParameter("mobile");
                String user_password = request.getParameter("user_password");

                //Class.forName("com.mysql.cj.jdbc.Driver");
 //Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                //Statement smt=cn.createStatement();
                //execute query
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                int i = smt.executeUpdate("update vehicle set user_name='" + user_name + "',user_mobile=" + user_mobile + " where user_password=" + user_password);

                if (i > 0) {
                    RequestDispatcher rd = request.getRequestDispatcher("user_profile.jsp");
                    rd.forward(request, response);
                }

                CreateConnection.closeConnection();
            } catch (Exception e) {
                out.println(e.getMessage());
            }

        %>
    </body>
</html>


