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
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Orders</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");

            Orders  arr[]=(Orders[])obj;
            %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Customer") || strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddOrders">Add</a>
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

                <th>Orderid</th>
                <th>Orderdate</th>
                <th>Ordertime</th>
                <th>Customerid</th>
                <th>Totalamount</th>
                <th>Discountamount</th>
                <th>Giftvoucherid</th>
                <th>Billamount</th>
                <th>Taxamount</th>
                <th>Paymenttype</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateOrders?id=<%=arr[i].getOrderid()%>">Update</a></td>
                        <td><a href="DeleterOrders?id=<%=arr[i].getOrderid()%>">Delete</a></td>

                        <td>  <%= arr[i].getOrderid()%> </td>
                        <td> <%= arr[i].getOrderdate()%> </td>                 
                        <td> <%= arr[i].getOrdertime()%> </td>
                        <td> <%= arr[i].getCustomerid()%> </td>
                        <td> <%= arr[i].getTotalamount()%> </td>
                        <td> <%= arr[i].getDiscountamount()%> </td>
                        <td> <%= arr[i].getGiftvoucherid()%> </td>
                        <td> <%= arr[i].getBillamount()%> </td>
                        <td> <%= arr[i].getTaxamount()%> </td>
                        <td> <%= arr[i].getPaymenttype()%> </td>
                    </tr>
                        <%
                    }
                %>
              
                            </table></div>
            </p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
