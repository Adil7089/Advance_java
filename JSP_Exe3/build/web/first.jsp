<%-- 
    Document   : first
    Created on : Feb 1, 2024, 4:17:13 PM
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
                color: crimson;
                font-family: cursive
            }
            body{
                background-color: khaki
            }
        </style>
    </head>
    <body>
        <%! //declearation tag
            int a=10;
            int add(int b,int c)
            {
                return(b+c);
            }
            %>
            <h1> value=<%=a%></h1>
            <h1>add=<%=add(199,345)%></h1>
    </body>
</html>
