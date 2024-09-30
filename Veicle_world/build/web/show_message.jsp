<%-- 
    Document   : show_message
    Created on : Feb 24, 2024, 8:09:58 AM
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

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Bootstrap CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css&quot; rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

            <title>JSP Page</title>
        </head>
        <body>

            <!-- Optional JavaScript; choose one of the two! -->

            <!-- Option 1: Bootstrap Bundle with Popper -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js&quot; integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

            <!-- Option 2: Separate Popper and Bootstrap JS -->
            <!--
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js&quot; integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js&quot; integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
            -->

            <div class="card" style="width: 25rem; height:auto; display: inline-block; margin-top: 5px; margin-left:2px; border: solid black 2px;">

                <div class="card-body">

                    <%

                        String customer_id = (String) session.getAttribute("id");

                        try {

                            // Class.forName("com.mysql.cj.jdbc.Driver");
                            // Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                            // Statement smt=cn.createStatement();
                            Connection cn = CreateConnection.getConnection();
                            Statement smt = cn.createStatement();
                            ResultSet rs = smt.executeQuery("select*from chat_box where to_user_id=" + customer_id);

                            while (rs.next()) {

                                String from_user_id = rs.getString(2);

                                String message = rs.getString(4);

                    %>

                    <h2 class="card-title"><%=message%></h2>
                    <!--                <p class="card-text">
                                       
                                    </p>-->
                    <div>
                        <form action="Send_message">
                            <input type="hidden" value="<%=from_user_id%>" name="seller_id">
                            <input type="hidden" value="<%=customer_id%>" name="customer_id">
                            <textarea style="height: 80px; width: 350px;" name="message"> </textarea><br>
                            <input type="submit" value="send">


                        </form></div>



                    <%
                            }
                            CreateConnection.closeConnection();
                        } catch (Exception e) {
                            out.println(e.getMessage());
                        }
                    %>

                </div>


            </div>
        </body>
    </html>


