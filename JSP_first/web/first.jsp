<%-- 
    Document   : first
    Created on : Feb 1, 2024, 3:31:01 PM
    Author     : welcome
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println(new Date());
        %>
        <br><!-- comment -->
        
        <%= new Date()
            %>
    </body>
</html>
