<%-- 
    Document   : first
    Created on : Feb 12, 2024, 7:31:35 PM
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
        <jsp:useBean id="obj" class="com.universal.bean.Foo"/>
         <%  
    float m=obj.simpleFoo(12000f,2.3f,4.5f);  
    out.print("Simple Interest="+m);  
    %>  
    </body>
</html>
