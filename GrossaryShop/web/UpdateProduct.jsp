<%-- 
    Document   : UpdateProduct
    Created on : 12 Feb, 2015, 2:08:16 AM
    Author     : YASH
--%>
<%@page import="org.entity.Product"%>
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
            Product p=(Product)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Product</h1>
                        <p><form action="UpdaterProduct" method ="post" enctype="multipart/form-data">
            <table>
                <tr><td>Productid:</td>
                    <td><input type="text" name="txtProductid" value="<%=p.getProductid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Productname:</td>
                    <td><input type="text" name="txtProductname" value="<%=p.getProductname()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Categoryid:</td>
                    <td><input type="text" name="txtCategoryid" value="<%=p.getCategoryid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Subcategoryid:</td>
                    <td><input type="text" name="txtSubcategoryid" value="<%=p.getSubcategoryid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Brandid:</td>
                    <td><input type="text" name="txtBrandid" value="<%=p.getBrandid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Unitofmeasurementid:</td>
                    <td><input type="text" name="txtUnitofmeasurementid" value="<%=p.getUnitofmeasurementid()%>"/>
                    </td>
                </tr>

                <tr><td>Quantityonhand:</td>
                    <td><input type="text" name="txtQuantityonhand" value="<%=p.getQuantityonhand()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Price:</td>
                    <td><input type="text" name="txtPrice" value="<%=p.getPrice()%>"/>
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
