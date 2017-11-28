<%-- 
    Document   : AddShoppingcart
    Created on : 12 Feb, 2015, 1:49:50 AM
    Author     : YASH
--%>

<%@page import="org.entity.Customer"%>
<%@page import="org.dao.CustomerDAO"%>
<%@page import="org.dao.ShoppingcartDAO"%>
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
        <jsp:include page="header.jsp"/>
        <%
        Customer arrCus[]=(new CustomerDAO()).getAll();
        %>
        
        <%
        String id=(new ShoppingcartDAO()).getFuncCall();
        %>

        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Shoppingcart</h1>
                        <p><form action="AdderShoppingcart">
            <table>
                <tr><td>Shoppingcartid:</td>
                    <td><input type="text" name="txtShoppingcartid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtShoppingcartid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Cartname:</td>
                    <td><input type="text" name="txtCartname"/>
                    </td>
                </tr>
                
                <tr><td>Date:</td>
                    <td><input type="text" name="txtShoppingdate"/>
                    </td>
                </tr>
                
                <tr><td>Time:</td>
                    <td><input type="text" name="txtShoppingtime"/>
                    </td>
                </tr>
                
                <tr><td>Description:</td>
                    <td><textarea name="txtDescription" rows="4" cols="20"></textarea>
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
