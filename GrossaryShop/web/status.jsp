<%-- 
    Document   : status
    Created on : 9 Mar, 2015, 12:49:57 PM
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
                        <%--img src="images/title2.gif" alt="DATA NOT AVAILABLE.. TRY AGAIN LATER...." width="191" height="30" /><br /--%>
                        <h1>status</h1>
                        <p><body>
        <%
            Object obj=request.getAttribute("Strmsg");
            if(obj!=null)
            {
                %>
                <h2><%=obj.toString()%></h2>
                <%
            }
            %>
    </body></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
