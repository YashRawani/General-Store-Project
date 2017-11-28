<%-- 
    Document   : UpdateGiftvoucher
    Created on : 12 Feb, 2015, 2:19:09 AM
    Author     : YASH
--%>

<%@page import="org.entity.Giftvoucher"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Furniture Shop</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>

    <body>
        <%
            Object obj=request.getAttribute("data");
            Giftvoucher g=(Giftvoucher)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Giftvoucher</h1>
                        <p><form action="UpdaterGiftvoucher">
            <table>
                <tr><td>GiftvoucherId:</td>
                    <td><input type="text" name="txtGiftvoucherid" value="<%=g.getGiftvoucherid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Giftvouchername:</td>
                    <td><input type="text" name="txtGiftvouchername" value="<%=g.getGiftvouchername()%>"/>
                    </td>
                </tr>
                
                <tr><td>Giftvouchernumber:</td>
                    <td><input type="text" name="txtGiftvouchernumber" value="<%=g.getGiftvouchernumber()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount" value="<%=g.getAmount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Validfromdate:</td>
                    <td><input type="text" name="txtValidfromdate" value="<%=g.getValidfromdate()%>"/>
                    </td>
                </tr>
                
                <tr><td>Validtodate:</td>
                    <td><input type="text" name="txtValidtodate" value="<%=g.getValidtodate()%>"/>
                    </td>
                </tr>
                
                <tr>
                    <td colspan="2" align="centre">
                        <input type="submit" name="btnUpdate" value="Update"/>
                        &nbsp;&nbsp;
                        <input type="reset" name="btnCancel" value="Cancel"/>
                        
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
