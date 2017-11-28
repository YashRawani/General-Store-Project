package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mnuMaster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>General Store</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"wrapper\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <div id=\"content_inside\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                \n");
      out.write("                <div id=\"main_block\">\n");
      out.write("                    <div class=\"about\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("     <h1>Menu</h1>\n");
      out.write("        <p>\n");
      out.write("        Category\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayCategory\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Subcategory\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplaySubcategory\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Brand\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayBrand\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Product\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayProduct\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Unitofmeasurement\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayUnitofmeasurement\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Giftvoucher\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayGiftvoucher\">Show</a>\n");
      out.write("        <br/><br/>\n");
      out.write("        Admin\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <a href=\"DisplayAdmin\">Show</a>\n");
      out.write("        </p>\n");
      out.write("         </div>\n");
      out.write("           </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>    \n");
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
