<%-- 
    Document   : second
    Created on : Feb 13, 2024, 12:11:45 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Record:<br> 
        <%
            out.print(session.getAttribute("naam")+"<br>");
            out.print(session.getAttribute("mail")+"<br>");
        out.print(session.getAttribute("pass"));    
        %>
    </body>
</html>
