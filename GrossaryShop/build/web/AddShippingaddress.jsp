<%-- 
    Document   : AddShippingaddress
    Created on : 12 Feb, 2015, 1:57:23 AM
    Author     : YASH
--%>

<%@page import="org.dao.ConsigneeDAO"%>
<%@page import="org.entity.Consignee"%>
<%@page import="org.entity.Customer"%>
<%@page import="org.dao.CustomerDAO"%>
<%@page import="org.entity.Orders"%>
<%@page import="org.entity.Product"%>
<%@page import="org.dao.OrdersDAO"%>
<%@page import="org.dao.ProductDAO"%>
<%@page import="org.dao.ShippingaddressDAO"%>
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
        Product arrPro[]=(new ProductDAO()).getAll();
        Orders arrOrd[]=(new OrdersDAO()).getAll();
        Customer arrCus[]=(new CustomerDAO()).getAll();
        Consignee arrCon[]=(new ConsigneeDAO()).getAll();
        %>
        <%
        String id=(new ShippingaddressDAO()).getFuncCall();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Shippingaddress</h1>
                        <p><form action="AdderShippingaddress">
            <table>
                <tr><td>Shippingaddressid:</td>
                    <td><input type="text" name="txtShippingaddressid" value="<%=id%>" readonly/>
                    <input type="hidden" name="txtShippingaddressid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Orderid:</td>
                    <td><%--<input type="text" name="txtOrderid"/>--%>
               <select name="txtOrderid">
                            <%
            for(int i=0; i<arrOrd.length;i++)
                    {
                %>
                <option value="<%=arrOrd[i].getOrderid()%>">
                    <%= arrOrd[i].getOrderid()%>
                </option>
                <%
            }
                  %>
                        </select>
         
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><%--<input type="text" name="txtCustomerid"/>--%>
              <select name="txtCustomerid">
                            <%
            for(int i=0; i<arrCus.length;i++)
                    {
                %>
                <option value="<%=arrCus[i].getCustomerid()%>">
                    <%= arrCus[i].getCustomerfirstname()%>
                </option>
                <%
            }
                  %>
                        </select>

                    </td>
                </tr>
                
                <tr><td>Productid:</td>
                    <td><%--<input type="text" name="txtProductid"/>--%>
               <select name="txtProductid">
                            <%
            for(int i=0; i<arrPro.length;i++)
                    {
                %>
                <option value="<%=arrPro[i].getProductid()%>">
                    <%= arrPro[i].getProductname()%>
                </option>
                <%
            }
                  %>
                        </select>

                    </td>
                </tr>
                
                <tr><td>Quantity:</td>
                    <td><input type="text" name="txtQuantity"/>
                        
                    </td>
                </tr>
                
                <tr><td>Consigneeid:</td>
                    <td><%--<input type="text" name="txtConsigneeid"/>--%>
                    <select name="txtConsigneeid">
                            <%
            for(int i=0; i<arrCon.length;i++)
                    {
                %>
                <option value="<%=arrCon[i].getConsigneeid()%>">
                    <%= arrCon[i].getConsigneename()%>
                </option>
                <%
            }
                  %>
               </select>
                    
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
