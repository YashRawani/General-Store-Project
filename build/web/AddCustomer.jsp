<%-- 
    Document   : AddCustomer
    Created on : 11 Feb, 2015, 2:44:57 PM
    Author     : YASH
--%>

<%@page import="org.dao.CustomerDAO"%>
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
            String id = (new CustomerDAO()).getFuncCall();
        %>

        <jsp:include page="header.jsp"/>

        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Customer</h1>
                        <p><form method="post" action="AdderCustomer" enctype="multipart/form-data">
                            <table>
                                <tr><td>Customerid:</td>
                                    <td><input type="text" name="txtCustomerid" value="<%=id%>" readonly/>
                                        <input type="hidden" name="txtCustomerid" value="<%=id%>"/>
                                    </td>
                                </tr>

                                <tr><td>Customerfirstname:</td>
                                    <td><input type="text" name="txtCustomerfirstname"/>
                                    </td>
                                </tr>


                                <tr><td>Customermiddlename:</td>
                                    <td><input type="text" name="txtCustomermiddlename"/>
                                    </td>
                                </tr>

                                <tr><td>Customerlastname:</td>
                                    <td><input type="text" name="txtCustomerlastname"/>
                                    </td>
                                </tr>

                                <tr><td>Username:</td>
                                    <td><input type="text" name="txtUsername"/>
                                    </td>
                                </tr>

                                <tr><td>Customerpassword:</td>
                                    <td><input type="text" name="txtCustomerpassword"/>
                                    </td>
                                </tr>

                                <tr><td>Email:</td>
                                    <td><input type="text" name="txtEmail"/>
                                    </td>
                                </tr>

                                <tr><td>Conatactnumber:</td>
                                    <td><input type="text" name="txtContactnumber"/>
                                    </td>
                                </tr>

                                <tr><td>Address:</td>

                                    <td><textarea name="txtAddress" rows="4" cols="20"></textarea>
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

                                <tr><td>Photo:</td>
                                    <td><input type="file" name="txtPhoto"/>
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
