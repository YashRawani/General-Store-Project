<%-- 
    Document   : UpdateUnitofmeasurement
    Created on : 12 Feb, 2015, 2:09:40 AM
    Author     : YASH
--%>


<%@page import="org.entity.Unitofmeasurement"%>
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
            Unitofmeasurement u=(Unitofmeasurement)obj;
            %>
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Update Unitofmeasurement</h1>
                        <p><form action="UpdaterUnitofmeasurement">
            <table>
                <tr><td>UnitofmeasurementId:</td>
                    <td><input type="text" name="txtUnitofmeasurementid" value="<%=u.getUnitofmeasurementid()%>"/>
                    </td>
                </tr>
                
                <tr><td>Unitofmeasurement:</td>
                    <td><input type="text" name="txtUnitofmeasurement" value="<%=u.getUnitofmeasurementid()%>"/>
                    </td>
                </tr>
                
                
                <tr><td>Description:</td>
                     <td><textarea name="txtDescription" rows="4" cols="20"><%=u.getDescription()%>
                        </textarea>
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
