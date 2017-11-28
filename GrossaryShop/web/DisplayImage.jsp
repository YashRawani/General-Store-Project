<%-- 
    Document   : DisplaySingleImage
    Created on : May 31, 2015, 12:52:41 PM
    Author     : Rho
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
    </head>
    <body>
        <%
            try {
                String id = request.getParameter("id");
                String table = request.getParameter("table");
                String column = request.getParameter("column");
                String pk = request.getParameter("pk");
                
                System.out.println("inside jsp try");
                Connection con = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grossarydb", "root", "admin");
                //con = Db.getConnection();
                Statement st = null;
                st = con.createStatement();
                //sql="select image from demoimage where id="+id;
                sql = "select " + column + " from " + table + " where "+ pk +" = '" + id + "'";
                System.out.println("sql----" + sql);
                rs = st.executeQuery(sql);
                //rs = st.executeQuery("select image from demoimage where id='1'");
                String imgLen = "";
                while (rs.next()) {
                    imgLen = rs.getString(column);
                    int len = imgLen.length();
                    byte[] rb = new byte[len];
                    InputStream readImg = rs.getBinaryStream(column);
                    int index = readImg.read(rb, 0, len);
                    response.reset();
                    response.setContentType("image/jpg");
                    response.getOutputStream().write(rb, 0, len);
                    response.getOutputStream().flush();
                }
                st.close();

                //  response.getContentType();
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        %>
    </body>
</html>