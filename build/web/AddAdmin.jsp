<%-- 
    Document   : AddAdmin
    Created on : 11 Feb, 2015, 2:54:45 PM
    Author     : YASH
--%>

<%@page import="org.dao.AdminDAO"%>
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
        String id=(new AdminDAO()).getFuncCall();
        %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Admin</h1>
                        <p><form action="AdderAdmin">
            <table>
                <tr><td>Adminid:</td>
                    <td><input type="text" name="txtAdminid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtAdminid" value="<%=id%>" />
                    </td>
                </tr>
                
                <tr><td>Adminfirstname:</td>
                    <td><input type="text" name="txtAdminfirstname"/>
                    </td>
                </tr>
                
                
                <tr><td>Adminmiddlename:</td>
                    <td><input type="text" name="txtAdminmiddlename"/>
                    </td>
                </tr>
                
                <tr><td>Adminlastname:</td>
                    <td><input type="text" name="txtAdminlastname"/>
                    </td>
                </tr>
                
                <tr><td>Username:</td>
                    <td><input type="text" name="txtUsername"/>
                    </td>
                </tr>
                
                <tr><td>Adminpassword:</td>
                    <td><input type="text" name="txtAdminpassword"/>
                    </td>
                </tr>
                
                <tr><td>Email:</td>
                    <td><input type="text" name="txtEmail"/>
                    </td>
                </tr>
                
                <tr><td>Contactnumber:</td>
                    <td><input type="text" name="txtContactnumber"/>
                    </td>
                </tr>
                
                <tr><td>Address:</td>
                    <td><input type="text" name="txtAddress"/>
                    </td>
                </tr>
                
                <tr><td>Gender:</td>
                    <td><input type="text" name="txtGender"/>
                    </td>
                </tr>
                
                <tr><td>Dateofbirth:</td>
                    <td><input type="text" name="txtDateofbirth"/>
                    </td>
                </tr>
                
               
                
                <tr>
                    <td colspan="2" align="centre">
                        <input type="submit" name="btnAdd" value="Add"/>
                        &nbsp;&nbsp;
                        <input type="reset" name="btnClear" value="Clear"/>
                        
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
