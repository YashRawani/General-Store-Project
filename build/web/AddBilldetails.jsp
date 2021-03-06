<%-- 
    Document   : AddBilldetails
    Created on : 11 Feb, 2015, 3:34:52 PM
    Author     : YASH
--%>

<%@page import="org.dao.BilldetailsDAO"%>
<%@page import="org.entity.Orders"%>
<%@page import="org.dao.OrdersDAO"%>
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
            Orders arrOrders[]=(new OrdersDAO()).getAll();
            %>
        <%
        String id=(new BilldetailsDAO()).getFuncCall();
        %>
        
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Billdetails</h1>
                        <p><form action="AdderBilldetails">
            <table>
                <tr><td>Billid:</td>
                    <td><input type="text" name="txtBillid" value="<%=id%>" readonly />
                        <input type="hidden" name="txtBillid" value="<%=id%>" />
                    </td>
                </tr>
                
                <tr><td>Orderid:</td>
                    <td><%--<input type="text" name="txtOrderid"/>--%>
                        <select name="txtOrderid">
                            <%
            for(int i=0; i<arrOrders.length;i++)
                    {
                %>
                <option value="<%=arrOrders[i].getOrderid()%>">
                    <%= arrOrders[i].getOrderid()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount"/>
                    </td>
                </tr>
                
                <tr><td>Bankname:</td>
                    <td><input type="text" name="txtBankname"/>
                    </td>
                </tr>
                
                <tr><td>Cardnumber:</td>
                    <td><input type="text" name="txtCardnumber"/>
                    </td>
                </tr>
                
                <tr><td>Date:</td>
                    <td><input type="text" name="txtBilldate"/>
                    </td>
                </tr>
                
                <tr><td>Time:</td>
                    <td><input type="text" name="txtBilltime"/>
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
