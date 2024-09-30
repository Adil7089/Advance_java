<%-- 
    Document   : fetches_data_job_apply
    Created on : Feb 26, 2024, 12:00:10 PM
    Author     : welcome
--%>
<%@page import="com.universal.connection.CreateConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: khaki;
            }
            table{
                text-align: center;
            }
        </style>
    </head>
    <body>
    <center><h1>Information of job_applied_person</h1></center>
        <%
       
       try
    {
     
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
//Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/VlE","root","");
		
		
//	Statement smt=cn.createStatement();
 Connection cn=CreateConnection.getConnection();
              Statement smt=cn.createStatement();		
		
ResultSet rs=smt.executeQuery("select * from job_apply");
	
%>
<table border="2" align="center">
 <tr>
     <th>id</th>
      <th>Name</th>
      <th>Mobile</th>
      <th>email</th>
      <th>Experince_year</th>
      <th>job_type</th>
      <th>send_email</th>
     <!--<th>cancel_Booking</th>-->
 </tr>

 <tr>
        <%
while(rs.next())
{
               
           String id=rs.getString(1);
            String name=rs.getString(2);
             String mobile=rs.getString(4);
             String email=rs.getString(3);
             String experince=rs.getString(5);
             String job_type=rs.getString(6);
   %>
                <td><%=id%></td>
                <td><%=name%></td>
                <td><%=mobile%></td>
                <td><%=email%></td>
                <td><%=experince%></td>
                <td><%=job_type%></td>
   
               
                <td><a href="send_email_for_job.jsp?email=<%=email%>">Send_email</a></td>
                
            
 </tr>
            <%
         
}
        CreateConnection.closeConnection();
out.println("</table>");
    }
     catch(Exception e)
     {
         System.out.println(e.getMessage());  
     }
    
     
    %>
    </body>
</html>
