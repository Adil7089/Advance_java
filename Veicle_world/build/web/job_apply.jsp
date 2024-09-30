<%-- 
    Document   : job_apply
    Created on : Feb 26, 2024, 11:09:52 AM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                background-color: aquamarine;
                height: 600px;
                width: 50%;
                font-size: 30px;
            }
            tr{
                font-size: 67px;
            }
            body{
                background-color:antiquewhite
            }
        </style>
    </head>
    <body>
        <center>
        <form action="insert_data_job_apply.jsp" method="post" >
        <div>
            <h3>----Apply for job----</h3>
            
        <tr>
            <td><label>Enter_name:</label></td><br>
        <td>
            <input type="text" name="name"  placeholder="Enter name" required>
        </td>

          </tr>
                <br>
         <tr>
            <td><label>Enter_email:</label></td><br>
                <td> <input type="email" name="email" value="" placeholder="Enter email" required>
        </td>
                    
           </tr>
           <br>
           <tr>
            <td><label>Enter_mobile:</label></td><br>
                <td> <input type="text" name="mobile" value="" placeholder="Enter mobile" required>
        </td>
           </tr>
           <br>
          
           
           <tr>
            <td><label>Enter_Job_Experince_year:</label></td><br>
                <td>
                    <input type="text" name="experince" value="" placeholder="Enter job experince" required>
        
                </td>

           </tr>
           <br>
           <tr>
            <td><label> Job_type:</label></td><br>
           <td><select name="job_type">
                    <option>job_type</option>
                    <option value="Driver">Driver</option>
                    <option value="Machine">Machine</option>
                    
                </select></td>

           </tr>
           <br><br>
            <tr>
                <td colspan="2" ><input type="submit" value="Submit" >
               
            </tr>
        </div>
        </form>
    </center>
    </body>
</html>
