<%-- 
    Document   : AddSubcategory
    Created on : 11 Feb, 2015, 1:36:37 PM
    Author     : YASH
--%>

<%@page import="org.entity.Category"%>
<%@page import="org.dao.CategoryDAO"%>
<%@page import="org.dao.SubcategoryDAO"%>
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
        Category arrCat[]=(new CategoryDAO()).getAll();
        %>
        <%
        String id=(new SubcategoryDAO()).getFuncCall();
        %>

        <jsp:include page="header.jsp"/>
        
        <div id="wrapper">																																																																											
            <div id="content_inside">
                <jsp:include page="sidebar.jsp"/>
                <div id="main_block">
                    <div class="about">
                        <%--img src="images/title2.gif" alt="" width="191" height="30" /><br /--%>
                        <h1>Add Subcategory</h1>
                        <p><form action="AdderSubcategory">
            <table>
                <tr><td>Subcategoryid:</td>
                    <td><input type="text" name="txtSubcategoryid" value="<%=id%>" readonly/>
                    <input type="hidden" name="txtSubcategoryid" value="<%=id%>"/>
                    </td>
                </tr>
                
                <tr><td>Categoryid:</td>
               <td><%--<input type="text" name="txtCategoryid"/>--%>
                    <select name="txtCategoryid">
                            <%
            for(int i=0; i<arrCat.length;i++)
                    {
                %>
                <option value="<%=arrCat[i].getCategoryid()%>">
                    <%= arrCat[i].getCategoryname()%>
                </option>
                <%
            }
                  %>
                        </select>
                    </td>
                </tr>
                
                <tr><td>Subcategoryname:</td>
                    <td><input type="text" name="txtSubcategoryname"/>
                    </td>
                </tr>
                
                
                <tr><td>Description:</td>
                    <td><textarea name="txtDescription" rows="4" cols="20"></textarea>
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
