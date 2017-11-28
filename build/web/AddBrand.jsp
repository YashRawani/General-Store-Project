<%-- 
    Document   : AddBrandid
    Created on : 11 Feb, 2015, 1:39:01 PM
    Author     : YASH
--%>

<%@page import="org.dao.BrandDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>General Store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>

    <body>
        <jsp:include page="header.jsp"/>
        <%
        String id=(new BrandDAO()).getFuncCall();
        %>
        
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Brand</h1>
                        <p><form action="AdderBrand">
            <table>
                <tr><td>Brandid:</td>
                    <td><input type="text" name="txtBrandid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtBrandid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Brandname:</td>
                    <td><input type="text" name="txtBrandname"/>
                    </td>
                </tr>
                
                <tr><td>Brandlogo:</td>
                    <td><input type="text" name="txtBrandlogo"/>
                    </td>
                </tr>
                
                
                <tr><td>Description:</td>
                    <td><textarea name="txtDescription" rows="4" cols="20"></textarea>
                    </td>
                </tr>
                
                
                
                <tr>
                    <td colspan="2" align="centre">
                        <input type="submit" name="btnAdd" value="Add"/>
                        &nbsp;&nbsp;
                        <input type="reset" name="btnClear" value="Clear"/>
                        
                    </td>
                </tr>
            </table>
            
        </form></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
