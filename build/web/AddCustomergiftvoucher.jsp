<%-- 
    Document   : AddCustomergiftvoucher
    Created on : 11 Feb, 2015, 3:30:32 PM
    Author     : YASH
--%>

<%@page import="org.entity.Customer"%>
<%@page import="org.dao.CustomerDAO"%>
<%@page import="org.entity.Giftvoucher"%>
<%@page import="org.dao.GiftvoucherDAO"%>
<%@page import="org.dao.CustomergiftvoucherDAO"%>
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
            Giftvoucher arrGvo[]=(new GiftvoucherDAO()).getAll();
            Customer arrCus[]=(new CustomerDAO()).getAll();
            %>
        <%
        String id=(new CustomergiftvoucherDAO()).getFuncCall();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Customergiftvoucher</h1>
                        <p><form action="AdderCustomergiftvoucher">
            <table>
                <tr><td>Customergiftvocherid:</td>
                    <td><input type="text" name="txtCustomergiftvoucherid" value="<%=id%>" readonly/>
                        <input type="hidden" name="txtCustomergiftvoucherid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Giftvoucherid:</td>
                    <td><%--<input type="text" name="txtGiftvoucherid"/>--%>
                <select name="txtGiftvoucherid">
               <%
                    for(int i=0; i<arrGvo.length;i++)
                    {
                %>
                <option value="<%=arrGvo[i].getGiftvoucherid()%>">
                    <%= arrGvo[i].getGiftvouchername()%>
                </option>
                <%
            }
                  %>
                        </select>
                    
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
