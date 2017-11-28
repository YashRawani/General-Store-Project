<%-- 
    Document   : Login
    Created on : 21 May, 2015, 6:59:26 PM
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
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
        <h1>New Customer</h1>
        &nbsp;&nbsp;
        <a href="ShowAddCustomer">Click Here To Sign Up<br/>(Its Fast
            And Its Free)</a>
        <br/><br/>
        <h1>Login</h1>
        <p><Form action="Validator" method="post">
            <table>
                <tr>
                    <td> Username: </td>
                    <td>
                        <input type="text" name="txtUN" />
                    </td>
                </tr>
                <tr>
                    <td> Password: 
                        
                 </td>
                 <td>
                <input type="password" name="txtPwd" />
                 </td>
                </tr>
                <tr>
                    <td>User Type:</td>
                    <td>
                        <select name="cboUserType">
                            <option>Admin</option>
                            <option>Customer</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="Submit" value="Login"/>
                    </td>
                </tr>
                <%
                    Object errMsg=request.getAttribute("errMsg");
                    if(errMsg!=null)
                    {
                        %>
                        <tr>
                            <td colspan="2" align="center">
                                <%= errMsg.toString() %>
                            </td>                            
                        </tr>
                        <% } %>
            </table>
        </form></p>                        
                    </div>
            
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
