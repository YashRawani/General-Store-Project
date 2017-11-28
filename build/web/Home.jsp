
<%@page import="org.entity.Customer"%>
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
        <jsp:include page="header.jsp"/>

        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title3.gif" alt="DATA UNAVAILABLE" width="191" height="30" /><br /--%>
                        <%
                            Object objUserName = session.getAttribute("username");
                            Object objUserType = session.getAttribute("usertype");
                            Object objUserObj = session.getAttribute("userobj");
                        %>
                        <h1>Welcome  <%= objUserType.toString()%>.<br/></h1>
                        <br/><br/>
                        <%
                            if (objUserName != null && objUserType != null && objUserObj != null) {
                                String strUserType = objUserType.toString();

                                if (strUserType.equals("Admin")) {
                                    Admin obj = (Admin) objUserObj;
                        %>   


                        <p>  
                        <h2>
                            Hello <%= objUserName.toString()%>.<br/>
                            Your Name is <%=  obj.getAdminfirstname() + " " + obj.getAdminmiddlename() + " " + obj.getAdminlastname()%>.<br/>
                            User type is Admin. <br/>
                        </h2>
                        <%
                        } else if (strUserType.equals("Customer")) {
                            Customer obj = (Customer) objUserObj;
                        %>
                        <h2>
                            Hello <%= objUserName.toString()%>.<br/>
                            Your Name is <%= obj.getCustomerfirstname() + " " + obj.getCustomermiddlename() + " " + obj.getCustomerlastname()%>.<br/>
                            User type is Customer. <br/>
                        </h2>
                        <%
                        } else {
                        %>
                        <h1>Hello guest user.</h1> 
                        <%
                            }
                        } else {
                        %>
                        <h1>Hello guest user.</h1>
                        <%
                            }
                        %>
                        </p>                        
                    </div>

                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
        <a href="index.jsp"></a>
    </body>
</html>
