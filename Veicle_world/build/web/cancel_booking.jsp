<%-- 
    Document   : cancel_booking
    Created on : Feb 24, 2024, 3:43:29 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.universal.mailer.Mail"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
        try
        {
       String to=request.getParameter("email");
       
       String sub="From vehicle_world";
       String msg="hello user your booking has been canceld";
       
       Mail.send(to,sub,msg);
       out.println("Successfully send");
        }
        catch(Exception e)
        {
            out.println(e.getMessage());
        }
    
%>
    </body>
</html>
