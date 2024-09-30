<%-- 
    Document   : insert_data_job_apply
    Created on : Feb 26, 2024, 11:25:28 AM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
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

                String name = request.getParameter("name");
                String mobile = request.getParameter("mobile");
                String job_type = request.getParameter("job_type");
                String email = request.getParameter("email");
                String experince = request.getParameter("experince");

                // Class.forName("com.mysql.cj.jdbc.Driver");
                //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE", "root", "");
                //Statement smt = cn.createStatement();
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                int i = smt.executeUpdate("insert into job_apply(Name,Email,Mobile,Exprince_year,Job_type) values('" + name + "','" + email + "','" + mobile + "'," + experince + ",'" + job_type + "')");

                if (i > 0) {
                    //out.print("Added");
                    out.println("insert data");
                }

                CreateConnection.closeConnection();
            } catch (Exception e) {
                out.println(e.getMessage());
            }


        %>

    </body>
</html>
