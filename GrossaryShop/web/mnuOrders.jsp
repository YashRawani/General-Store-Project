<%-- 
    Document   : mnuOrders
    Created on : 24 May, 2015, 7:59:34 PM
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
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>


     <h1>Menu</h1>
     <p>
         
        Orderdetails
        &nbsp;&nbsp;
        <a href="DisplayOrderdetails">Show</a>
        <br/><br/>
        Orders
        &nbsp;&nbsp;
        <a href="DisplayOrders">Show</a>
        <br/><br/>
        
        Billdetails
        
        &nbsp;&nbsp;
        <a href="DisplayBilldetails">Show</a>
        <br/><br/>
        
        Shoppingcart
        &nbsp;&nbsp;
        <a href="DisplayShoppingcart">Show</a>
        <br/><br/>
        Carddetails
        &nbsp;&nbsp;
        <a href="DisplayCarddetails">Show</a>
        <br/><br/>       
    </p>
             </div>
           </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>    

