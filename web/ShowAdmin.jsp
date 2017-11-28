<%@page import="org.entity.Admin"%>
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
                        <h1>Admin</h1>
                        <p>
                        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Object obj =request.getAttribute("Data");

            Admin  arr[]=(Admin[])obj;
            %>
            
            <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                                    
                            %>   
                             <a href="ShowAddAdmin">Add</a>
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

                <th>Admin id</th>
                <th>Admin firstname</th>
                <th>Admin middlename</th>
                <th>Admin lastname</th>
                <th>Username</th>
                <th>Admin password</th>
                <th>Email</th>
                <th>Contact number</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Date of birth</th>
            </tr>
            <% 
                for( int i=0;i < arr.length; i++)
                    {
                    %>
                    <tr>
                        <td> <%= (i+1)%></td>

                        <td><a href="ShowUpdateAdmin?id=<%=arr[i].getAdminid()%>">Update</a></td>
                        <td><a  href="DeleterAdmin?id=<%=arr[i].getAdminid()%>">Delete</a></td>

                        <td>  <%= arr[i].getAdminid()%> </td>
                        <td> <%= arr[i].getAdminfirstname()%> </td>                 
                        <td> <%= arr[i].getAdminmiddlename()%> </td>
                        <td> <%= arr[i].getAdminlastname()%> </td>
                        <td> <%= arr[i].getUsername()%> </td>
                        <td> <%= arr[i].getAdminpassword()%> </td>
                        <td> <%= arr[i].getEmail()%> </td>
                        <td> <%= arr[i].getContactnumber()%> </td>
                        <td> <%= arr[i].getAddress()%> </td>
                        <td> <%= arr[i].getGender()%> </td>
                        <td> <%= arr[i].getDateofbirth()%> </td> 
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
