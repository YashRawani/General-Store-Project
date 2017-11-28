package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.dao.BilldetailsDAO;
import org.entity.Orders;
import org.dao.OrdersDAO;

public final class AddBilldetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>General Store</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            Orders arrOrders[]=(new OrdersDAO()).getAll();
            
      out.write("\n");
      out.write("        ");

        String id=(new BilldetailsDAO()).getFuncCall();
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"wrapper\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <div id=\"content_inside\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                <div id=\"main_block\">\n");
      out.write("                    <div class=\"about\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <h1>Add Billdetails</h1>\n");
      out.write("                        <p><form action=\"AdderBilldetails\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Billid:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtBillid\" value=\"");
      out.print(id);
      out.write("\" readonly />\n");
      out.write("                        <input type=\"hidden\" name=\"txtBillid\" value=\"");
      out.print(id);
      out.write("\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Orderid:</td>\n");
      out.write("                    <td>");
      out.write("\n");
      out.write("                        <select name=\"txtOrderid\">\n");
      out.write("                            ");

            for(int i=0; i<arrOrders.length;i++)
                    {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(arrOrders[i].getOrderid());
      out.write("\">\n");
      out.write("                    ");
      out.print( arrOrders[i].getOrderid());
      out.write("\n");
      out.write("                </option>\n");
      out.write("                ");

            }
                  
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Amount:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtAmount\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Bankname:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtBankname\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Cardnumber:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtCardnumber\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Date:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtBilldate\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>Time:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtBilltime\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"centre\">\n");
      out.write("                        <input type=\"submit\" name=\"btnAdd\" value=\"Add\"/>\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <input type=\"reset\" name=\"btnClear\" value=\"Clear\"/>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </form></p>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
