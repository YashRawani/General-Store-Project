<%-- 
    Document   : UpdateOrderdetails
    Created on : 12 Feb, 2015, 2:16:32 AM
    Author     : YASH
--%>


<%@page import="org.entity.Orderdetails"%>
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
            Orderdetails o=(Orderdetails)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Orderdetails</h1>
                        <p><form action="UpdaterOrderdetails">
            <table>
                <tr><td>OrderdetailsId:</td>
                    <td><input type="text" name="txtOrderdetailsid" value="<%=o.getOrderdetailsid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Orderid:</td>
                    <td><input type="text" name="txtOrderid" value="<%=o.getOrderid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Productid:</td>
                    <td><input type="text" name="txtProductid" value="<%=o.getProductid()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Quantity:</td>
                    <td><textarea name="txtQuantity" rows="4" cols="20"><%=o.getQuantity()%></textarea>
                    </td>
                </tr>
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount" value="<%=o.getAmount()%>"/>
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

