<%@page import="org.entity.Giftvoucher"%>
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
                        <h1>Giftvoucher</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");

            Giftvoucher  arr[]=(Giftvoucher[])obj;
            %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddGiftvoucher">Add</a>
                            <%
                            } 
                            }
                            
                            %>
                        <table border="1">
            <tr>
                <th>Sr.No</th>
                <th>Update</th>
                <th>Delete</th>

                <th>Giftvoucherid</th>
            <a href="ShowGiftvoucher.jsp"></a>
                <th>Giftvouchername</th>
                <th>Giftvouchernumber</th>
                <th>Amount</th>
                <th>Validfromdate</th>
                <th>Validtodate</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateGiftvoucher?id=<%=arr[i].getGiftvoucherid()%>">Update</a></td>
                        <td><a href="DeleterGiftvoucher?id=<%=arr[i].getGiftvoucherid()%>">Delete</a></td>

                        <td>  <%= arr[i].getGiftvoucherid()%> </td>
                        <td> <%= arr[i].getGiftvouchername()%> </td>                 
                        <td> <%= arr[i].getGiftvouchernumber()%> </td>
                        <td> <%= arr[i].getAmount()%> </td> 
                        <td> <%= arr[i].getValidfromdate()%> </td>
                        <td> <%= arr[i].getValidtodate()%> </td> 
                    </tr>
                        <%
                    }
                %>
              
        </table></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
