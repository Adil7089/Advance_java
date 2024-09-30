<%-- 
    Document   : sell_vehicle
    Created on : Feb 15, 2024, 4:51:41 PM
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
        <form action="Upload_sell_vehicle" method="post" >
        <div>
            <h3>----Sell_Old_Vehicle----</h3>
            
        <tr>
            <td><label>Vehicle_type:</label></td><br>
        <td>
            <input type="text" name="vehicle_type"  placeholder="Enter vehicle_type" required>
        </td>

          </tr>
                <br>
         <tr>
            <td><label>Vehicle_name:</label></td><br>
                <td> <input type="text" name="vehicle_name" value="" placeholder="Enter vehicle_name" required>
        </td>
                    
           </tr>
           <br>
           <tr>
            <td><label>  vehicle Registration_year:</label></td><br>
                <td> <input type="text" name="vehicle_registration" value="" placeholder="Enter Ragistration_year" required>
        </td>
           </tr>
           <br>
           <tr>
            <td><label> Vehicle Engine_type:</label></td><br>
           <td><select name="engine_type">
                    <option>Engine_type</option>
                    <option value="petrol">Petrol</option>
                    <option value="CNG">CNG</option>
                    <option value="Desal">Desal</option>
                    <option value="Electronic">Electronic</option>
                </select></td>

           </tr>
           <br>
           <tr>
            <td><label> Vehicle Oprating_type :</label></td><br>
                <td><select name="operating_type">
                    <option>Oprating_type</option>
                    <option value="manual">manual</option>
                    <option value="Automatic">Automatic</option>
                    <option value="manual and automatic">manual and automatic</option>
                    
                </select></td>

           </tr>
           <br>
           <tr>
            <td><label> Vehicle Excepted_price:</label></td><br>
                <td>
                    <input type="text" name="vehicle_price" value="" placeholder="Enter price" required>
        
                </td>

           </tr>
           <br>
           <tr>
                <td><label>Description:</label></td>
                <td><input type="text" name="Description" placeholder="Description" required></td>
            </tr>
            <br>
            <tr>
                <td colspan="2" ><input type="submit" value="Upload" >
               
            </tr>
        </div>
        </form>
    </center>
    </body>
</html>
