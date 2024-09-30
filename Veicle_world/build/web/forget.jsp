<%-- 
    Document   : forget
    Created on : Feb 24, 2024, 3:53:40 PM
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
        <form action="Forget_password" method="put">
        <table border="2">
            <tr>
                <td><label>email_id</label></td>
                <td><input type="email" name="email" placeholder="Enter email_id" required></td>
            </tr>
            
            <tr>
                <td colspan="2" ><input type="submit" value="submit">
            </tr>
            
        </table>
            </form>
    </body>
</html>
