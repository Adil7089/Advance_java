<%-- 
    Document   : add_rental_vehicle
    Created on : Feb 13, 2024, 10:17:13 PM
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
               
                background-color: grey;
            }
            table{
                font-size: 30px;
            }
            td{
                color:beige
            }
            h2{
               font-weight: bold;
               text-transform: capitalize; 
            }
            a{
                font-size: 34px;
            }
        </style>
    
    </head>
    <body>
        <body>
        <center>
         <form action="Add_rentalv_vehicle" method="post">
             <h2>Add Vehicle</h2>
        <table border="2">
            <tr>
                <td><label>Vehicle_name</label></td>
                <td><input type="text" name="name" ></td>
            </tr>
            <tr>
                <td><label>Vehicle_type</label></td>
                <td><input type="text" name="type"></td>
            </tr>
            <tr>
                <td><label>Rent_Rate</label></td>
                <td><input type="text" name="rate"></td>
            </tr>
            
            <tr>
                <td colspan="2" ><input type=submit value="Add">
        </table>
                   
    </body>
</html>
