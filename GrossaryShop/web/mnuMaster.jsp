<%-- 
    Document   : Customerlogin
    Created on : 24 May, 2015, 6:05:08 PM
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
        Category
        &nbsp;&nbsp;
        <a href="DisplayCategory">Show</a>
        <br/><br/>
        Subcategory
        &nbsp;&nbsp;
        <a href="DisplaySubcategory">Show</a>
        <br/><br/>
        Brand
        &nbsp;&nbsp;
        <a href="DisplayBrand">Show</a>
        <br/><br/>
        Product
        &nbsp;&nbsp;
        <a href="DisplayProduct">Show</a>
        <br/><br/>
        Unitofmeasurement
        &nbsp;&nbsp;
        <a href="DisplayUnitofmeasurement">Show</a>
        <br/><br/>
        Giftvoucher
        &nbsp;&nbsp;
        <a href="DisplayGiftvoucher">Show</a>
        <br/><br/>
        Admin
        &nbsp;&nbsp;
        <a href="DisplayAdmin">Show</a>
        </p>
         </div>
           </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>    
