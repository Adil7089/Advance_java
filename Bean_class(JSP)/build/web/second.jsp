<%-- 
    Document   : second
    Created on : Feb 12, 2024, 6:52:10 PM
    Author     : welcome
--%>
<%@page import="com.univarsal.Foo"   %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Foo f=(Foo)session.getAttribute("obj");
        
        
        %>
        
        Name-><%=f.getName() %>
        Age-><%=f.getAge() %>
        
    </body>
</html>
