

<%@page import="org.entity.Consignee"%>
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
                        <h1>Consignee</h1>
                        <p>
                        <html>
                            <head>
                                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                                <title>JSP Page</title>
                            </head>
                            <body>
                                <%
                                    Object obj = request.getAttribute("Data");

                                    Consignee arr[] = (Consignee[]) obj;
                                %>

                                <%
                                    Object objUserName = session.getAttribute("username");
                                    Object objUserType = session.getAttribute("usertype");
                                    Object objUserObj = session.getAttribute("userobj");

                                    if (objUserName != null && objUserType != null && objUserObj != null) {
                                        String strUserType = objUserType.toString();

                                        if (strUserType.equals("Admin")) {

                                %>   
                                <a href="ShowAddConsignee">Add</a>
                                <%                                    }
                                    }

                                %>
                                <table border="1">
                                    <tr>
                                        <th>Sr.No</th>
                                        <th>Update</th>
                                        <th>Delete</th>

                                        <th>Consigneeid</th>
                                        <th>Consigneename</th>
                                        <th>Address</th>
                                        <th>Customerid</th>
                                        <th>Contactnumber</th>
                                    </tr>
                                    <%  
                                    for (int i = 0; i < arr.length; i++) {
                                    %>
                                    <tr>
                                        <td> <%= (i + 1)%></td>

                                        <td><a href="ShowUpdateConsignee?id=<%=arr[i].getConsigneeid()%>">Update</a></td>
                                        <td><a href="DeleterConsignee?id=<%=arr[i].getConsigneeid()%>">Delete</a></td>

                                        <td>  <%= arr[i].getConsigneeid()%> </td>
                                        <td> <%= arr[i].getConsigneename()%> </td>                 
                                        <td> <%= arr[i].getAddress()%> </td>
                                        <td> <%= arr[i].getCustomerid()%> </td>
                                        <td> <%= arr[i].getContactnumber()%> </td> 
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
