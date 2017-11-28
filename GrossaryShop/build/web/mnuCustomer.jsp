<%-- 
    Document   : Adminlogin
    Created on : 24 May, 2015, 6:45:15 PM
    Author     : YASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <h1>Menu</h1>
        <p>
        Customer
        &nbsp;&nbsp;
        <a href="DisplayCustomer">Show</a>
        <br/><br/>
        Customergiftvoucher
        &nbsp;&nbsp;
        <a href="DisplayCustomergiftvoucher">Show</a>
        <br/><br/>
        Consignee
        &nbsp;&nbsp;
        <a href="DisplayConsignee">Show</a>
        <br/><br/>
        Shippingaddress
        &nbsp;&nbsp;
        <a href="DisplayShippingaddress">Show</a>
        <br/><br/>
        </p>
                 </div>
           </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>    
