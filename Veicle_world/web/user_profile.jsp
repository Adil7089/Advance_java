<%-- 
    Document   : user_profile
    Created on : Feb 13, 2024, 6:43:36 PM
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
            try {

                //Load the driver class
                //Class.forName("com.mysql.cj.jdbc.Driver");
                //create the connection
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                //Make the statement object
                //Statement smt=cn.createStatement();
                //execute query
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                ResultSet rs = smt.executeQuery("select * from vehicle");
        %>
    <center>
        <h2>users_profile</h2>
        <table border="2">
            <tr>
                <th>id</th>
                <th>user_name</th>
                <th>user_id</th>
                <th>user_mobile</th>
                <th>user_password</th>
                <th>Edit</th>
            </tr>

            <%
                while (rs.next()) {
                    String id = rs.getString(1);
                    String user_name = rs.getString(2);
                    String user_id = rs.getString(3);
                    String user_mobile = rs.getString(4);
                    String user_password = rs.getString(5);
            %>

            <tr>
                <td><%=id%></td>
                <td><%=user_name%></td>
                <td><%=user_id%></td>
                <td><%=user_mobile%></td>
                <td><%=user_password%></td>
                <td><a href="user_edit.jsp?password=<%=user_password%>">Edit</a></td>

            </tr>  

            <%
                    }
                    out.println("</table>");
                    out.println("<a href='show_message.jsp'>show message of user booking</a><br>");
                    out.println("<a href='fetches_data_job_apply.jsp'>show data which person want to jop</a>");
                    CreateConnection.closeConnection();

                } catch (Exception e) {
                    out.print(e.getMessage());
                }


            %>
    </center>
</body>
</html>
