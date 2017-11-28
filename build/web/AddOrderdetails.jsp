<%-- 
    Document   : AddOrderdetails
    Created on : 11 Feb, 2015, 2:41:00 PM
    Author     : YASH
--%>

<%@page import="org.entity.Orders"%>
<%@page import="org.dao.OrdersDAO"%>
<%@page import="org.entity.Product"%>
<%@page import="org.dao.ProductDAO"%>
<%@page import="org.dao.OrderdetailsDAO"%>
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
        String id=(new OrderdetailsDAO()).getFuncCall();
        %>
        <%
            Product arrPro[]=(new ProductDAO()).getAll();
            Orders arrOrd[]=(new OrdersDAO()).getAll();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Orderdetails</h1>
                        <p><form action="AdderOrderdetails">
            <table>
                <tr><td>Orderdetailsid:</td>
                    <td><input type="text" name="txtOrderdetailsid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtOrderdetailsid" value="<%=id%>"/>
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
                
                <tr><td>Productid 1:</td>
                      <td><%--<input type="text" name="txtProductid"/>--%>
               <select name="txtProductid1">
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
                <tr><td>Productid 2:</td>
                      <td><%--<input type="text" name="txtProductid"/>--%>
               <select name="txtProductid2">
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
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount"/>
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
