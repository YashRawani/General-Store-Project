<%-- 
    Document   : UpdateBilldetails
    Created on : 12 Feb, 2015, 2:23:09 AM
    Author     : YASH
--%>

<%@page import="org.entity.Billdetails"%>
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
            Billdetails b=(Billdetails)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Billdetails</h1>
                        <p><form action="UpdaterBilldetails">
            <table>
                <tr><td>Billid:</td>
                    <td><input type="text" name="txtBillid" value="<%=b.getBillid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Orderid:</td>
                    <td><input type="text" name="txtOrderid" value="<%=b.getOrderid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Amount:</td>
                    <td><input type="text" name="txtAmount" value="<%=b.getAmount()%>"/>
                    </td>
                </tr>
                
                <tr><td>Bankname:</td>
                    <td><input type="text" name="txtBankname" value="<%=b.getBankname()%>"/>
                    </td>
                </tr>
                
                <tr><td>Cardnumber:</td>
                    <td><input type="text" name="txtCardnumber" value="<%=b.getCardnumber()%>"/>
                    </td>
                </tr>
                
                <tr><td>Date:</td>
                    <td><input type="text" name="txtBilldate" value="<%=b.getBilldate()%>"/>
                    </td>
                </tr>
                
                <tr><td>Time:</td>
                    <td><input type="text" name="txtBilltime" value="<%=b.getBilltime()%>"/>
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
