<%-- 
    Document   : AddConsignee
    Created on : 12 Feb, 2015, 1:45:39 AM
    Author     : YASH
--%>

<%@page import="org.dao.ConsigneeDAO"%>
<%@page import="org.entity.Customer"%>
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
        String id=(new ConsigneeDAO()).getFuncCall();
        %>

        <%
           
            Customer arrCus[]=(new CustomerDAO()).getAll();
            %>
            
        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Consignee</h1>
                        <p><form action="AdderConsignee">
            <table>
                <tr><td>Consigneeid:</td>
                    <td><input type="text" name="txtConsigneeid" value="<%=id%>" readonly/>
                    <input type="hidden" name="txtConsigneeid" value="<%=id%>"/>
                    
                    </td>
                </tr>
                
                <tr><td>Consigneename:</td>
                    <td><input type="text" name="txtConsigneename"/>
                    </td>
                </tr>
                
                <tr><td>Address:</td>
                    <td><input type="text" name="txtAddress"/>
                    </td>
                </tr>
                
                <tr><td>Customerid:</td>
                    <td><%--<input type="text" name="txtCustomerid"/>--%>
              <select name="txtCustomerid">
                            <%
            for(int i=0; i<arrCus.length;i++)
                    {
                %>
                <option value="<%=arrCus[i].getCustomerid()%>">
                    <%= arrCus[i].getCustomerfirstname()%>
                </option>
                <%
            }
                  %>
                        </select>

                    </td>
                </tr>
                
                <tr><td>Contactnumber:</td>
                    <td><input type="text" name="txtContactnumber"/>
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
