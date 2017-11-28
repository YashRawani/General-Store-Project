<%-- 
    Document   : AddCarddetails
    Created on : 12 Feb, 2015, 1:54:10 AM
    Author     : YASH
--%>

<%@page import="org.dao.CarddetailsDAO"%>
<%@page import="org.dao.ProductDAO"%>
<%@page import="org.entity.Product"%>
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
        String id=(new CarddetailsDAO()).getFuncCall();
        %>
        
        
        <%
            Product arrPro[]=(new ProductDAO()).getAll();
            %>
            
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Carddetails</h1>
                        <p><form action="AdderCarddetails">
            <table>
                <tr><td>Carddetailsid:</td>
                    <td><input type="text" name="txtCarddetailsid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtCarddetailsid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Cardid:</td>
                    <td><input type="text" name="txtCardid"/>
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
