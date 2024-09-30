<%-- 
    Document   : first
    Created on : Feb 4, 2024, 3:56:07 PM
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
            String name=request.getParameter("na");
            int age=Integer.parseInt(request.getParameter("age"));
            
           Foo f=new Foo();
           f.setName(name);
           f.setAge(age);
           
    // out.println("Name="+f.getName());
    // out.println("Age="+f.getAge());
    
      session.setAttribute("obj",f);

RequestDispatcher rd=request.getRequestDispatcher("second.jsp");

rd.forward(request,response);    

                %>
    </body>
</html>
