<%@page import="org.entity.Shippingaddress"%>
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
                        <h1>Shippingaddress</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");

            Shippingaddress  arr[]=(Shippingaddress[])obj;
            %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Customer") || strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddShippingaddress">Add</a>
                            <%
                            } 
                            }
                            
                            %>
            <table border="1">
            <tr>
                <th>Sr.No</th>
                <th>Update</th>
                <th>Delete</th>

                <th>Shippingaddressid</th>
                <th>Orderid</th>
                <th>Customerid</th>
                <th>Productid</th>
                <th>Quantity</th>
                <th>Consigneeid</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateShippingaddress?id=<%=arr[i].getShippingaddressid()%>">Update</a></td>
                        <td><a href="DeleterShippingaddress?id=<%=arr[i].getShippingaddressid()%>">Delete</a></td>

                        <td>  <%= arr[i].getShippingaddressid()%> </td>
                        <td> <%= arr[i].getOrderid()%> </td>                 
                        <td> <%= arr[i].getCustomerid()%> </td>
                        <td> <%= arr[i].getProductid()%> </td>
                        <td> <%= arr[i].getQuantity()%> </td>
                        <td> <%= arr[i].getConsigneeid()%> </td>
                    </tr>
                        <%
                    }
                %>
              
        </table>
            </p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
