<%-- 
    Document   : header
    Created on : 17 May, 2015, 8:14:48 PM
    Author     : YASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="header">																																																																								
    <div id="header_inside">
        <img src="images/header.jpg" alt="General Store" width="999" height="155" border="0"/><br />																																										


        <%
            Object objUserName = session.getAttribute("username");
            Object objUserType = session.getAttribute("usertype");
            Object objUserObj = session.getAttribute("userobj");

            if (objUserName != null && objUserType != null && objUserObj != null) {
                String strUserType = objUserType.toString();

                if (strUserType.equals("Admin")) {
        %>   
        <ul id="menu">
            <li><a href="Menuhome.jsp" class="but1_active">Home</a></li>
            <li><a href="mnuMaster.jsp" class="but1_active">Master</a></li>
            <li><a href="mnuCustomer.jsp" class="but1_active">Customer</a></li>
            <li><a href="mnuOrders.jsp" class="but1_active">Orders</a></li>
            <li><a href="ContactUs.jsp" class="but1_active">Contact Us</a></li>            
            <li><a href="Logout" class="but1_active">Logout</a></li>            
        </ul>
        <%
        } else if (strUserType.equals("Customer")) {
        %>
        <ul id="menu">
            <li><a href="Menuhome.jsp" class="but1_active">Home</a></li>
            <li><a href="mnuCustomer.jsp" class="but1_active">Customer</a></li>
            <li><a href="mnuOrders.jsp" class="but1_active">Orders</a></li>
            <li><a href="AboutUs.jsp" class="but1_active">About Us</a></li>
            <li><a href="ContactUs.jsp" class="but1_active">Contact Us</a></li>            
            <li><a href="Logout" class="but1_active">Logout</a></li>            
        </ul>
        <%
        } else {
        %>
        <ul id="menu">
            <li><a href="Menuhome.jsp" class="but1_active">Home</a></li>
            <li><a href="LatestOffers.jsp" class="but1_active">Latest Offers</a></li>
            <li><a href="AboutUs.jsp" class="but1_active">About Us</a></li>
            <li><a href="ContactUs.jsp" class="but1_active">Contact Us</a></li>            
            <li><a href="Login.jsp" class="but1_active">Login/Sign Up</a></li>            
        </ul>
        <%
            }
        } else {
        %>
        <ul id="menu">
            <li><a href="Menuhome.jsp" class="but1_active">Home</a></li>
            <li><a href="LatestOffers.jsp" class="but1_active">Latest Offers</a></li>
            <li><a href="AboutUs.jsp" class="but1_active">About Us</a></li>
            <li><a href="ContactUs.jsp" class="but1_active">Contact Us</a></li>            
            <li><a href="Login.jsp" class="but1_active">Login/Sign Up</a></li>            
        </ul>
        <%
            }
        %>



    </div>
</div>