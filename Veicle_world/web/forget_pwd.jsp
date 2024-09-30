<%-- 
    Document   : forget_pwd
    Created on : Feb 24, 2024, 4:19:30 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         body{
                background-color: turquoise
            }
            table{
                font-size: 30px;
            }
            td{
                color:beige
            }
            
           
        </style>
           <script>
          function valid()
          {
        pwd1=document.getElementById("pwd1").value;    
        pwd2=document.getElementById("pwd2").value;    
            if(pwd1===pwd2)
            {
              return true;  
            }
            else
            {
                document.getElementById("one").innerHTML="password and confirm password not match";
              return false;  
            }
    }
         
            </script>
    </head>
    <body>
       <center>
        
             <form action="update_login_password" method="post">
        <table border="2">
            <tr>
                <td><label>New password</label></td>
                <td><input type="password" name="pass" id="pwd1" placeholder="Enter new password" required></td>
            </tr>
            <tr>
                <td><label>Confirm_Password</label></td>
                <td><input type="password" name="password" id="pwd2" placeholder="Enter confirm password" required></td>
            <tr><span id="one" style="color: red"></span></tr>
            </tr>
            
            <tr>
                <td colspan="2" ><input type="submit" value="update password" onclick="return valid()">
                
            </tr>
            
        </table>
            </form>
        
    </center>

    </body>
</html>
