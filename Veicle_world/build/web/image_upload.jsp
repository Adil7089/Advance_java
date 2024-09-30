<%@page import="com.universal.connection.CreateConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Guru File Upload</title>
    </head>
    <body>
        <%
            String id = (String) session.getAttribute("id");

            // String vehicle_id = (String) session.getAttribute("vehicle_id");
            File file;
            int maxFileSize = 5000 * 1024;
            // int maxMemSize = 5000 * 1024;
            String filePath = "C:/Users/welcome/Documents/NetBeansProjects/Veicle_world/web/image/";

            String contentType = request.getContentType();

            if ((contentType.indexOf("multipart/form-data") >= 0)) {

                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setSizeThreshold(maxFileSize);
                factory.setRepository(new File("c://Temp"));
                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setSizeMax(maxFileSize);

                try {

                    int vid = 0;
                    //  Class.forName("com.mysql.cj.jdbc.Driver");

//                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VLE", "root", "");
                    //                  Statement smt = cn.createStatement();
                    Connection cn = CreateConnection.getConnection();
                    Statement smt = cn.createStatement();
                    ResultSet rs = smt.executeQuery("select max(vehicle_id) from sell_vehicle");

                    if (rs.next()) {
                        //out.println("Image insert");
                        vid = rs.getInt(1);

                    }

                    List fileItems = upload.parseRequest(request);
                    Iterator i = fileItems.iterator();
                    // out.println("<html>");
                    //out.println("<body>");
                    while (i.hasNext()) {
                        FileItem fi = (FileItem) i.next();
                        if (!fi.isFormField()) {
                            String fieldName = fi.getFieldName();
                            String fileName = fi.getName();

                            //out.println(fileName + "<br>");
                            String ss[] = fileName.split("\\.");
                            int index = ss.length;
                            String ext = ss[index - 1];
                            String fn = vid + "." + ext;

                            //out.print("first="+fn);
                            boolean isInMemory = fi.isInMemory();
                            long sizeInBytes = fi.getSize();
                            file = new File(filePath + fn);

                            fi.write(file);

                            out.println("Uploaded Filename: " + filePath + fileName + "value=" + fn + "<br>");
                            int ii = smt.executeUpdate("update sell_vehicle set image='" + fn + "' where vehicle_id=" + vid);

                            if (ii > 0) {
                                out.println("Detail added");
                            }
                        }
                    }
                    CreateConnection.closeConnection();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {

                out.println("<p>No file uploaded</p>");

            }
        %>
    </body>
</html>