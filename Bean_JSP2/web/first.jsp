<%-- 
    Document   : first
    Created on : Feb 13, 2024, 11:48:35 AM
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
         <jsp:useBean id="U" class="com.universal.bean.User" scope="session" />
        
        <jsp:setProperty property="na" value="U"/>
        <jsp:setProperty property="email" value="U"/>
        <jsp:setProperty property="pwd" value="U"/>
        
        <%
        session.setAttribute("naam", U.getNa());
        session.setAttribute("mail", U.getEmail());
         session.setAttribute("pass", U.getPwd());
         
        RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
         rd.forward(request, response);
        
        %>    
        
    </body>
</html>
