<%-- 
    Document   : purches_vehicle
    Created on : Feb 20, 2024, 8:23:06 PM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css&quot; rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>Hello, world!</title>
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
        <!--        <h1>Purchase Vehicle</h1>-->
        <%
            try {
                //Class.forName("com.mysql.cj.jdbc.Driver");

                //Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE","root","");
                //Statement smt=cn.createStatement();
                Connection cn = CreateConnection.getConnection();
                Statement smt = cn.createStatement();
                ResultSet rs = smt.executeQuery("select * from sell_vehicle");

                while (rs.next()) {
                    int vid = rs.getInt(1);
                    String vehicle_type = rs.getString(2);
                    String vehicle_name = rs.getString(3);
                    int vehicle_rag = rs.getInt(4);
                    String vehicle_engine = rs.getString(5);
                    String vehicle_oprating = rs.getString(6);
                    int vehicle_price = rs.getInt(7);
                    String description = rs.getString(8);
                    String image = rs.getString(9);
                    int user_id = rs.getInt(10);

                    //  out.print(user_id);
                    //out.println(vid+":"+vehicle_type+":"+vehicle_name+":"+vehicle_rag+":"+vehicle_engine+":"+vehicle_oprating+":"+vehicle_price+":"+description+":<img src='image/"+image+"' width='10%' height='10%'>:"+user_id+"<br>");
%>
        <div class="card" style="width: 26rem; display: inline-block;   margin-top: 5px; margin-left: 2px; border: solid black 2px;">
            <img src="image/<%=image%>" class="card-img-top" alt="..." style="height:300px; width:415px;" >
            <div class="card-body">
                <center>
                    <h1 class="card-title"><%=vehicle_name%></h1>
                <h2 class="card-title"><p>Price <%=vehicle_price%></h2></p>
                
                <p class="card-text">

                </p>
                <h3><a href="detail.jsp?seller_id=<%=user_id%>&vehicle_id=<%=vid%>" class="btn btn-primary">Detail</a></h3>
            </div>
            </center>
        </div>
        <%
                }
                CreateConnection.closeConnection();
            } catch (Exception e) {
                out.println(e.getMessage());
            }
        %>
    </body>
</html>
