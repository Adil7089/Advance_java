<%-- 
    Document   : edit
    Created on : Feb 2, 2024, 4:38:54 PM
    Author     : welcome
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
            background-color: lightpink
        }
    </style>
    <body>
        <%
           
 String roll="",name="",per="";             
try
         {
         roll=request.getParameter("rolll");
            //out.println(roll);    
         
         //Load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage","root","");
		
		//Make the statement object
		
	Statement smt=cn.createStatement();
		
		//execute query
ResultSet rs=smt.executeQuery("select * from student where Rollno="+roll);

        if(rs.next())
        {
        name=rs.getString(2);
        per=rs.getString(3);
        }
        
        cn.close();
         
        }
        catch(Exception e)
        {
         out.println(e.getMessage());
        }
        %>
    <center>
         <form action="update.jsp" method="get">
        <table border="2">
            <tr>
                <td><label>Name</label></td>
                <td><input type="text" name="n" value="<%=name%>"></td>
            </tr>
            <tr>
                <td><label>Roll</label></td>
                <td><input type="text" name="roll" value="<%=roll%>" readonly></td>
            </tr>
            <tr>
                <td><label>Percentage</label></td>
                <td><input type="text" name="per" value="<%=per%>"></td>
            </tr>
            <tr>
                <td colspan="2" ><input type=submit value="submit">
                <input type=reset value="Reset"></td>
            </tr>
        </table>
            </form>
    </center>
    </body>
</html>
