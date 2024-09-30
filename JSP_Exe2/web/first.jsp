<%-- 
    Document   : first
    Created on : Feb 1, 2024, 3:45:43 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
       h1{
        color: palevioletred;
        font-family: fantasy;
        font-style: initial;
        }
        body{
            background-color: palegoldenrod
        }
        </style>
    </head>
    <body>
        <%  //script tag
            int age=Integer.parseInt(request.getParameter("age"));
            if(age>=18){
            %>
            <h1>you are valid for vote<h1>
           <%
                    }
            else {
            %>
            <h1>you are Invalid for vote</h1>
            <%
            }
            %>
    </body>
</html>
