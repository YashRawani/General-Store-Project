<%-- 
    Document   : AddGiftvoucher
    Created on : 11 Feb, 2015, 3:15:44 PM
    Author     : YASH
--%>

<%@page import="org.dao.GiftvoucherDAO"%>
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
        <%
        String id=(new GiftvoucherDAO()).getFuncCall();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Giftvoucher</h1>
                        <p><form action="AdderGiftvoucher">
            <table>
                <tr><td>GiftvoucherId:</td>
                    <td><input type="text" name="txtGiftvoucherid" value="<%=id%>" readonly/>
                    <input type="hidden" name="txtGiftvoucherid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Giftvouchername:</td>
                    <td><input type="text" name="txtGiftvouchername"/>
                    </td>
                </tr>
                
                <tr><td>Giftvouchernumber:</td>
                    <td><input type="text" name="txtGiftvouchernumber"/>
                    </td>
                </tr>
                
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount"/>
                    </td>
                </tr>
                
                <tr><td>Validfromdate:</td>
                    <td><input type="text" name="txtValidfromdate"/>
                    </td>
                </tr>
                
                <tr><td>Validtodate:</td>
                    <td><input type="text" name="txtValidtodate"/>
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
