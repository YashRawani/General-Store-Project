<%-- 
    Document   : UpdateCustomer
    Created on : 12 Feb, 2015, 2:12:38 AM
    Author     : YASH
--%>

<%@page import="org.entity.Customer"%>
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
        <%
            Object obj=request.getAttribute("data");
            Customer c=(Customer)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Customer</h1>
                        <p>
                        <form action="UpdaterCustomer">
            <table>
                <tr><td>Customerid:</td>
                    <td><input type="text" name="txtCustomerid" value="<%=c.getCustomerid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerfirstname:</td>
                    <td><input type="text" name="txtCustomerfirstname" value="<%=c.getCustomerfirstname()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Customermiddlename:</td>
                    <td><input type="text" name="txtCustomermiddlename" value="<%=c.getCustomermiddlename()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerlastname:</td>
                    <td><input type="text" name="txtCustomerlastname" value="<%=c.getCustomerlastname()%>" />
                    </td>
                </tr>
                
                <tr><td>Username:</td>
                    <td><input type="text" name="txtUsername" value="<%=c.getUsername()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerpassword:</td>
                    <td><input type="password" name="passwordCustomerpassword" value="<%=c.getCustomerpassword()%>"/>
                    </td>
                </tr>
                
                <tr><td>Email:</td>
                    <td><input type="text" name="txtEmail" value="<%=c.getEmail()%>"/>
                    </td>
                </tr>
                
                <tr><td>Conatactnumber:</td>
                    <td><input type="text" name="txtContactnumber" value="<%=c.getContactnumber()%>"/>
                    </td>
                </tr>
                
                <tr><td>Address:</td>
                    <td><input type="text" name="txtAddress" value="<%=c.getAddress()%>"/>
                    </td>
                </tr>
                
                <tr><td>Gender:</td>
                    <td><input type="text" name="txtGender" value="<%=c.getGender()%>"/>
                    </td>
                </tr>
                
                <tr><td>Dateofbirth:</td>
                    <td><input type="text" name="txtDateofbirth" value="<%=c.getDateofbirth()%>"/>
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
            
        </form>
                    </p>                        
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
