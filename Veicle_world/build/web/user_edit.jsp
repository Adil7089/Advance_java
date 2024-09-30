<%-- 
    Document   : edit
    Created on : Feb 13, 2024, 6:56:18 PM
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
                background-color: turquoise
            }
            table{
                font-size: 30px;
            }
            td{
                color:beige
            }
            h1{
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

            String user_name = "", user_mobile = "", user_password = "";
            try {

                user_password = request.getParameter("password");
//        String user_name=request.getParameter("user_name");
//         user_mobile=request.getParameter("user_mobile");

                //Class.forName("com.mysql.cj.jdbc.Driver");
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                //Statement smt=cn.createStatement();
                //execute query
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                ResultSet rs = smt.executeQuery("select * from vehicle where user_password='" + user_password + "'");

                if (rs.next()) {
                    user_name = rs.getString(2);
                    user_mobile = rs.getString(4);
                }

                CreateConnection.closeConnection();

            } catch (Exception e) {
                out.println(e.getMessage());
            }
        %>
    <center>
        <form action="user_update.jsp" method="post">
            <table border="2">
                <tr>
                    <td><label>user_Name</label></td>
                    <td><input type="text" name="name" value="<%=user_name%>"></td>
                </tr>
                <tr>
                    <td><label>user_mobile</label></td>
                    <td><input type="text" name="mobile" value="<%=user_mobile%>"></td>
                </tr>
                <tr>
                    <td><label>user_password</label></td>
                    <td><input type="text" name="user_password" value="<%=user_password%>" readonly></td>
                </tr>

                <tr>
                    <td colspan="2" ><input type=submit value="update">
                        <input type=reset value="Reset"></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
