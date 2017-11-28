<%-- 
    Document   : UpdateAdmin
    Created on : 12 Feb, 2015, 2:13:59 AM
    Author     : YASH
--%>

<%@page import="org.entity.Admin"%>
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
        <%
            Object obj=request.getAttribute("data");
            Admin a=(Admin)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Admin</h1>
                        <p><form action="UpdaterAdmin">
            <table>
                <tr><td>Adminid:</td>
                    <td><input type="text" name="txtAdminid" value="<%=a.getAdminid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Adminfirstname:</td>
                    <td><input type="text" name="txtAdminfirstname" value="<%=a.getAdminfirstname()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Adminmiddlename:</td>
                    <td><input type="text" name="txtAdminmiddlename" value="<%=a.getAdminmiddlename()%>"/>
                    </td>
                </tr>
                
                <tr><td>Adminlastname:</td>
                    <td><input type="text" name="txtAdminlastname" value="<%=a.getAdminlastname()%>"/>
                    </td>
                </tr>
                
                <tr><td>Username:</td>
                    <td><input type="text" name="txtUsername" value="<%=a.getUsername()%>"/>
                    </td>
                </tr>
                
                <tr><td>Adminpassword:</td>
                    <td><input type="text" name="txtAdminpassword" value="<%=a.getAdminpassword()%>"/>
                    </td>
                </tr>
                
                <tr><td>Email:</td>
                    <td><input type="text" name="txtEmail" value="<%=a.getEmail()%>"/>
                    </td>
                </tr>
                
                <tr><td>Conatactnumber:</td>
                    <td><input type="text" name="txtContactnumber" value="<%=a.getContactnumber()%>"/>
                    </td>
                </tr>
                
                <tr><td>Address:</td>
                    <td><input type="text" name="txtAddress" value="<%=a.getAddress()%>"/>
                    </td>
                </tr>
                
                <tr><td>Gender:</td>
                    <td><input type="text" name="txtGender" value="<%=a.getGender()%>"/>
                    </td>
                </tr>
                
                <tr><td>Dateofbirth:</td>
                    <td><input type="text" name="txtDateofbirth" value="<%=a.getDateofbirth()%>"/>
                    </td>
                </tr>
                
               
                
                <tr>
                    <td colspan="2" align="centre">
                        <input type="submit" name="btnUpdate" value="Update"/>
                        &nbsp;&nbsp;
                        <input type="reset" name="btnCancel" value="Cancel"/>
                        
                    </td>
                </tr>
            </table>
            
        </form></p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
