<%-- 
    Document   : UpdateShippingaddress
    Created on : 12 Feb, 2015, 2:29:12 AM
    Author     : YASH
--%>

<%@page import="org.entity.Shippingaddress"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>General Shop</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>

    <body>
        <%
            Object obj=request.getAttribute("data");
            Shippingaddress s=(Shippingaddress)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Shippingaddress</h1>
                        <p><form action="UpdaterShippingaddress">
            <table>
                <tr><td>Shippingaddressid:</td>
                    <td><input type="text" name="txtShippingaddressid" value="<%=s.getShippingaddressid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Orderid:</td>
                    <td><input type="text" name="txtOrderid" value="<%=s.getOrderid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><input type="text" name="txtCustomerid" value="<%=s.getCustomerid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Productid:</td>
                    <td><input type="text" name="txtProductid" value="<%=s.getProductid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Quantity:</td>
                    <td><input type="text" name="txtQuantity" value="<%=s.getQuantity()%>"/>
                    </td>
                </tr>
                
                <tr><td>Consigneeid:</td>
                    <td><input type="text" name="txtConsigneeid" value="<%=s.getConsigneeid()%>"/>
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
