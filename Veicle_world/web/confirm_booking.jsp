<%--<%@page import="java.io.IOException"%>--%>
<%@page import="com.universal.mailer.Mail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
       String to=request.getParameter("id");
       
       String sub="From vehicle_world";
       String msg="hello user your booking has been done";
       
       Mail.send(to,sub,msg);
       out.println("Successfully send");
        }
        catch(Exception e)
        {
            //out.println(e.getMessage());
            e.printStackTrace();
        }
    
%>
    </body>
</html>
