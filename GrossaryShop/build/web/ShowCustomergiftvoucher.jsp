<%@page import="org.entity.Customergiftvoucher"%>
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
                        <h1>Customergiftvoucher</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");

            Customergiftvoucher  arr[]=(Customergiftvoucher[])obj;
            %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddCustomergiftvoucher">Add</a>
                            <%
                            } 
                            }
                            
                            %>
                        <table border="1">
            <tr>
                <th>Sr.No</th>
                <th>Update</th>
                <th>Delete</th>

                <th>Customergiftvoucherid</th>
                <th>Giftvoucherid</th>
                <th>Customerid</th>
                <th>Date</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateCustomergiftvoucher?id=<%=arr[i].getCustomergiftvoucherid()%>">Update</a></td>
                        <td><a href="DeleterCustomergiftvoucher?id=<%=arr[i].getCustomergiftvoucherid()%>">Delete</a></td>

                        <td>  <%= arr[i].getCustomergiftvoucherid()%> </td>
                        <td> <%= arr[i].getGiftvoucherid()%> </td>                 
                        <td> <%= arr[i].getCustomerid()%> </td>
                        <td> <%= arr[i].getGiftvoucherdate()%> </td> 
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
