<%-- 
    Document   : UpdateOrders
    Created on : 12 Feb, 2015, 2:18:00 AM
    Author     : YASH
--%>

<%@page import="org.entity.Category"%>
<%@page import="org.entity.Orders"%>
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
            Orders o=(Orders)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Orders</h1>
                        <p><form action="UpdaterOrders">
            <table>
                <tr><td>OrderId:</td>
                    <td><input type="text" name="txtOrderid" value="<%=o.getOrderid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Orderdate:</td>
                    <td><input type="text" name="txtOrderdate" value="<%=o.getOrderdate()%>"/>
                    </td>
                </tr>
                
                <tr><td>Ordertime:</td>
                    <td><input type="text" name="txtOrdertime" value="<%=o.getOrdertime()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><input type="text" name="txtCustomerid" value="<%=o.getCustomerid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Totalamount:</td>
                    <td><input type="text" name="txtTotalamount" value="<%=o.getTotalamount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Discountamount:</td>
                    <td><input type="text" name="txtDiscountamount" value="<%=o.getDiscountamount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Giftvoucherid:</td>
                    <td><input type="text" name="txtGiftvoucherid" value="<%=o.getGiftvoucherid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Billamount:</td>
                    <td><input type="text" name="txtBillamount" value="<%=o.getTotalamount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Taxamount:</td>
                    <td><input type="text" name="txtTaxamount" value="<%=o.getTaxamount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Paymenttype:</td>
                    <td><input type="text" name="txtPaymenttype" value="<%=o.getPaymenttype()%>"/>
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
