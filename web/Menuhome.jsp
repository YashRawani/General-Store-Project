<%-- 
    Document   : Menuhome
    Created on : 24 May, 2015, 5:52:51 PM
    Author     : YASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                                        <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");

                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                        %>
                        <h1>Hello Admin</h1>
                        <%
                        } else if (strUserType.equals("Customer")) {
                        %>
                        <h1>Hello Customer</h1>
                        <%
                        } else {
                        %>

                <jsp:include page="Items.jsp"/>
                                                <%
                                    }
                                } else {
                                %>
                                <jsp:include page="Items.jsp"/>
                                                                        <%
                                            }
                                        %>

                                        <%
                                            Object errMsg = request.getAttribute("errMsg");
                                            if (errMsg != null) {
                                        %>
                                        <tr>
                                            <td colspan="2" align="center">
                                                <%= errMsg.toString()%>
                                            </td>                            
                                        </tr>
                                        <% }%>
                                    </table>
                                </form></p>                        
                                </div>

                                </div>
                                </div>
                                </div>
                                <jsp:include page="footer.jsp"/>
                                </body>
                                </html>

         