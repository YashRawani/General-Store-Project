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
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Product</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");
            Product  arr[]=(Product[])obj;
        String table ="Product";
            String column ="Photo";
            String pk="Productid";    
        %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddProduct">Add</a>
                            <%
                            } 
                            }
                            
                            %>
                            <div style="overflow: scroll; height: 250px; width: 680px;">
            <table border="1">
            <tr>
                <th>Sr.No</th>
                <th>Update</th>
                <th>Delete</th>

                <th>Productid</th>
                <th>Productname</th>
                <th>Categoryid</th>
                <th>Subcategoryid</th>
                <th>Brandid</th>
                <th>Unitofmeasurementid</th>
                <th>Quantityonhand</th>
                <th>Photo</th>
                <th>Price</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateProduct?id=<%=arr[i].getProductid()%>">Update</a></td>
                        <td><a href="DeleterProduct?id=<%=arr[i].getProductid()%>">Delete</a></td>

                        <td>  <%= arr[i].getProductid()%> </td>
                        <td> <%= arr[i].getProductname()%> </td>                 
                        <td> <%= arr[i].getCategoryid()%> </td>
                        <td> <%= arr[i].getSubcategoryid()%> </td>
                        <td> <%= arr[i].getBrandid()%> </td>
                        <td> <%= arr[i].getUnitofmeasurementid()%> </td>
                        <td> <%= arr[i].getQuantityonhand()%> </td>
                        <td>                            
                            <img style="border: solid 1px red; width: 200px; height: 120px;" src="DisplayImage.jsp?id=<%= arr[i].getProductid() %>&column=<%= column %>&table=<%= table %>&pk=<%= pk %>"/>
                        </td>
                        <td> <%= arr[i].getPrice()%> </td>
                    </tr>
                        <%
                    }
                %>
              
        </table>
                            </div>
            </p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
