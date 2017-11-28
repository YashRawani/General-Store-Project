<%-- 
    Document   : UpdateConsignee
    Created on : 12 Feb, 2015, 2:24:46 AM
    Author     : YASH
--%>

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
        <%
            Object obj=request.getAttribute("data");
            Consignee c=(Consignee)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Consignee</h1>
                        <p><form action="UpdaterConsignee">
            <table>
                <tr><td>Consigneeid:</td>
                    <td><input type="text" name="txtConsigneeid" value="<%=c.getConsigneeid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Consigneename:</td>
                    <td><input type="text" name="txtConsigneename" value="<%=c.getConsigneename()%>"/>
                    </td>
                </tr>
                
                <tr><td>Address:</td>
                    <td><input type="text" name="txtUpdateress" value="<%=c.getAddress()%>"/>
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><input type="text" name="txtCustomerid" value="<%=c.getCustomerid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Contatctnumber:</td>
                    <td><input type="text" name="txtConatactnumber" value="<%=c.getContactnumber()%>"/>
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
