<%-- 
    Document   : AddProduct
    Created on : 11 Feb, 2015, 1:41:47 PM
    Author     : YASH
--%>

<%@page import="org.entity.Unitofmeasurement"%>
<%@page import="org.dao.UnitofmeasurementDAO"%>
<%@page import="org.entity.Brand"%>
<%@page import="org.dao.BrandDAO"%>
<%@page import="org.entity.Subcategory"%>
<%@page import="org.dao.SubcategoryDAO"%>
<%@page import="org.entity.Category"%>
<%@page import="org.dao.CategoryDAO"%>
<%@page import="org.dao.ProductDAO"%>
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
        String id=(new ProductDAO()).getFuncCall();
        %>
        
        <%
        Category arrCat[]=(new CategoryDAO()).getAll();
        Subcategory arrSub[]=(new SubcategoryDAO()).getAll();
        Brand arrBrd[]=(new BrandDAO()).getAll();
        Unitofmeasurement arrUOM[]=(new UnitofmeasurementDAO()).getAll();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Product</h1>
                        <p><form method="post" action="AdderProduct" enctype="multipart/form-data">
            <table>
                <tr><td>Productid:</td>
                    <td><input type="text" name="txtProductid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtProductid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Productname:</td>
                    <td><input type="text" name="txtProductname"/>
                    </td>
                </tr>
                
                
                <tr><td>Categoryid:</td>
                    <td><%--<input type="text" name="txtCategoryid"/>--%>
                    <select name="txtCategoryid">
                            <%
            for(int i=0; i<arrCat.length;i++)
                    {
                %>
                <option value="<%=arrCat[i].getCategoryid()%>">
                    <%= arrCat[i].getCategoryname()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>
                
                <tr><td>Subcategoryid:</td>
                    <td><%--<input type="text" name="txtSubcategoryid"/>--%>
                    <select name="txtSubcategoryid">
                            <%
            for(int i=0; i<arrSub.length;i++)
                    {
                %>
                <option value="<%=arrSub[i].getSubcategoryid()%>">
                    <%= arrSub[i].getSubcategoryname()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>
                
                <tr><td>Brandid:</td>
                    <td><%--<input type="text" name="txtBrandid"/>--%>
                    <select name="txtBrandid">
                            <%
            for(int i=0; i<arrBrd.length;i++)
                    {
                %>
                <option value="<%=arrBrd[i].getBrandid()%>">
                    <%= arrBrd[i].getBrandname()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>

                <tr><td>Unitofmeasurementid:</td>
                    <td><%--<input type="text" name="txtUnitofmeasurementid"/>--%>
                    <select name="txtUnitofmeasurementid">
                            <%
            for(int i=0; i<arrUOM.length;i++)
                    {
                %>
                <option value="<%=arrUOM[i].getUnitofmeasurementid()%>">
                    <%= arrUOM[i].getUnitofmeasurement()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>

                <tr><td>Quantityonhand:</td>
                    <td><input type="text" name="txtQuantityonhand"/>
                    </td>
                </tr>
                
                <tr><td>Photo:</td>
                    <td><input type="file" name="txtPhoto"/>
                    </td>
                </tr>
                
                <tr><td>Price:</td>
                    <td><input type="text" name="txtPrice"/>
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
