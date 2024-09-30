<%-- 
    Document   : detail
    Created on : Feb 22, 2024, 10:31:34 PM
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
        <%
//            HttpSession hs=request.getSession(false);
//           String id=(String)hs.getAttribute("vehicle_id");
            String customer_id = (String) session.getAttribute("id");

            String seller_id = request.getParameter("seller_id");
            String vehicle_id = request.getParameter("vehicle_id");

            try {
                //out.println("hello");
                // Class.forName("com.mysql.cj.jdbc.Driver");

                // Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                //Statement smt=cn.createStatement();
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                ResultSet rs = smt.executeQuery("select * from sell_vehicle where vehicle_id=" + vehicle_id);
                // out.println("hello");
                while (rs.next()) {
                    // out.println("hello");
                    // HttpSession hs=request.getSession(false);

                    //String id=(String)hs.getAttribute("id");
                    String vehicle_type = rs.getString(2);
                    String vehicle_name = rs.getString(3);
                    int vehicle_rag = rs.getInt(4);
                    String vehicle_engine = rs.getString(5);
                    String vehicle_oprating = rs.getString(6);
                    int vehicle_price = rs.getInt(7);
                    String description = rs.getString(8);
                    String image = rs.getString(9);
                    int user_id = rs.getInt(10);
                    // out.println(seller_id);
%>

        <img src="image/<%=image%>" class="card-img-top" alt="..." style="height:500px; width:700px;">

        <!--<center>-->
        <div class="card" style="width: 30rem; height: 35rem; display: inline-block;   margin-top: 5px; margin-left: 2px; border: solid black 2px;">
               <!--<img src="image/<%=image%>" class="card-img-top" alt="..." style="height:300px; width:400px;">-->
            <div class="card-body">
                <center>
                    <h1 style="color: red">Vehicle_Information</h1>
                    <h2 class="card-title"><p> Vehicle Name - <%=vehicle_name%></h2>
                    <h2 class="card-title"><p>price - <%=vehicle_price%></h2></p>

                    <h2 class="card-title"><p>Registration_year - <%=vehicle_rag%></h2>
                    <h2 class="card-title"><p> Engine_type - <%=vehicle_engine%></h2>
                    <h2 class="card-title"><p> Operating_type - <%=vehicle_oprating%></h2>

                    <p class="card-text">

                    </p>
                    <div>
                        <form action="Send_message">
                            <input type="hidden" value="<%=seller_id%>" name="seller_id">
                            <input type="hidden" value="<%=customer_id%>" name="customer_id">
                            <textarea style="height: 100px; width: 400px;" name="message" placeholder="Write_Description"> </textarea><br>
                            <input type="submit" value="send">
                            </center>

                        </form></div>
            </div>


        </div>
        <!--</center>-->
        <%
                }
                CreateConnection.closeConnection();
            } catch (Exception e) {
                out.println(e.getMessage());
            }
        %>
    </body>
</html>
