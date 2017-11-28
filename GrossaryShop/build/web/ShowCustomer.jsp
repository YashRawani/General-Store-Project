<%@page import="org.entity.Customer"%>
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
                        <h1>Customer</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");
            Customer  arr[]=(Customer[])obj;
            String table ="Customer";
            String column ="Photo";
            String pk="Customerid";
        %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Customer") || strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddCustomer">Add</a>
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

                <th>Customer id</th>
                <th>Customerfirstname</th>
                <th>Customermiddlename</th>
                <th>Customerlastname</th>
                <th>Username</th>
                <th>Customerpassword</th>
                <th>Email</th>
                <th>Contact number</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Date of birth</th>
                <th>Photo</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateCustomer?id=<%=arr[i].getCustomerid()%>">Update</a></td>
                        <td><a href="DeleterCustomer?id=<%=arr[i].getCustomerid()%>">Delete</a></td>

                        <td>  <%= arr[i].getCustomerid()%> </td>
                        <td> <%= arr[i].getCustomerfirstname()%> </td>                 
                        <td> <%= arr[i].getCustomermiddlename()%> </td>
                        <td> <%= arr[i].getCustomerlastname()%> </td>
                        <td> <%= arr[i].getUsername()%> </td>
                        <td> <%= arr[i].getCustomerpassword()%> </td>
                        <td> <%= arr[i].getEmail()%> </td>
                        <td> <%= arr[i].getContactnumber()%> </td>
                        <td> <%= arr[i].getAddress()%> </td>
                        <td> <%= arr[i].getGender()%> </td>
                        <td> <%= arr[i].getDateofbirth()%> </td>
                        
                        <td>                            
                            <img style="border: solid 1px red; width: 200px; height: 120px;" src="DisplayImage.jsp?id=<%= arr[i].getCustomerid() %>&column=<%= column %>&table=<%= table %>&pk=<%= pk %>"/>
                        </td>
                    </tr>
                        <%
                    }
                %>
              
        </table></div></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
