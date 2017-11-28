<%-- 
    Document   : Menu
    Created on : 9 Mar, 2015, 12:52:11 PM
    Author     : YASH
--%>

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
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Menu</h1>
                        <p>
        
        Login
        &nbsp;&nbsp;
        <a href="Login.jsp">Login</a>
        <br/><br/>
        Category
        &nbsp;&nbsp;
        <a href="ShowAddCategory">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayCategory">Show</a>
        <br/><br/>
        Subcategory
        &nbsp;&nbsp;
        <a href="ShowAddSubcategory">Add</a>
        &nbsp;&nbsp;
        <a href="DisplaySubcategory">Show</a>
        <br/><br/>
        Brand
        &nbsp;&nbsp;
        <a href="ShowAddBrand">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayBrand">Show</a>
        <br/><br/>
        Product
        &nbsp;&nbsp;
        <a href="ShowAddProduct">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayProduct">Show</a>
        <br/><br/>
        Unitofmeasurement
        &nbsp;&nbsp;
        <a href="ShowAddUnitofmeasurement">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayUnitofmeasurement">Show</a>
        <br/><br/>
        Orderdetails
        &nbsp;&nbsp;
        <a href="ShowAddorderdetails">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayOrderdetails">Show</a>
        <br/><br/>
        Customer
        &nbsp;&nbsp;
        <a href="ShowAddCustomer">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayCustomer">Show</a>
        <br/><br/>
        Admin
        &nbsp;&nbsp;
        <a href="ShowAddAdmin">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayAdmin">Show</a>
        <br/><br/>
        Orders
        &nbsp;&nbsp;
        <a href="ShowAddOrders">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayOrders">Show</a>
        <br/><br/>
        Giftvoucher
        &nbsp;&nbsp;
        <a href="ShowAddGiftvoucher">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayGiftvoucher">Show</a>
        <br/><br/>
        Customergiftvoucher
        &nbsp;&nbsp;
        <a href="ShowAddCustomergiftvoucher">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayCustomergiftvoucher">Show</a>
        <br/><br/>
        Billdetails
        &nbsp;&nbsp;
        <a href="ShowAddBilldetails">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayBilldetails">Show</a>
        <br/><br/>
        Consignee
        &nbsp;&nbsp;
        <a href="ShowAddConsignee">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayConsignee">Show</a>
        <br/><br/>
        Shoppingcart
        &nbsp;&nbsp;
        <a href="ShowAddShoppingcart">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayShoppingcart">Show</a>
        <br/><br/>
        Carddetails
        &nbsp;&nbsp;
        <a href="ShowAddCarddetails">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayCarddetails">Show</a>
        <br/><br/>
        Shippingaddress
        &nbsp;&nbsp;
        <a href="ShowAddShippingaddress">Add</a>
        &nbsp;&nbsp;
        <a href="DisplayShippingaddress">Show</a>
        <br/><br/></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
