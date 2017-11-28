<%-- 
    Document   : UpdateShoppingcart
    Created on : 12 Feb, 2015, 2:26:10 AM
    Author     : YASH
--%>

<%@page import="org.entity.Shoppingcart"%>
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
            Shoppingcart s=(Shoppingcart)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Shoppingcart</h1>
                        <p><form action="UpdaterShoppingcart">
            <table>
                <tr><td>Shoppingcartid:</td>
                    <td><input type="text" name="txtShoppingcartid" value="<%=s.getShoppingcartid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Cartname:</td>
                    <td><input type="text" name="txtCartname" value="<%=s.getCartname()%>"/>
                    </td>
                </tr>
                
                <tr><td>Date:</td>
                    <td><input type="text" name="txtDate"value="<%=s.getShoppingdate()%>"/>
                    </td>
                </tr>
                
                <tr><td>Time:</td>
                    <td><input type="text" name="txtTime" value="<%=s.getShoppingtime()%>"/>
                    </td>
                </tr>
                
                <tr><td>Description:</td>
                    <td><textarea name="txtDescription" rows="4" cols="20"><%=s.getDescription()%></textarea>
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><input type="text" name="txtCustomerid" value="<%=s.getCustomerid()%>"/>
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
