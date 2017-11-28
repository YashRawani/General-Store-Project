package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>General Store</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <h1>About Us</h1><br/>\n");
      out.write("        <div id=\"wrapper\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <div id=\"content_inside\">\n");
      out.write("                <div id=\"main_block\">\n");
      out.write("                    <div class=\"about\">\n");
      out.write("                        <h2>What is FairFoodStore.com??</h2><br/>\n");
      out.write("                        <h3><p>FairFoodStore.com is India&#8217;s largest online food and grocery store. With over 10,000 products and over a 1000 brands in our catalogue you will find everything you are looking for.<br/>Right from Fresh Vegetables, Rice and Dals, Spices and Seasonings to Packaged products, Beverages products? we have it all.</p>\n");
      out.write("                            <p>Choose from a wide range of options in every category, exclusively handpicked to help you find the best quality available at the lowest prices. Select a time slot for delivery and your order will be delivered right to your doorstep, anywhere in Mumbai. You can pay online using your debit / credit card or by cash on delivery.</p>\n");
      out.write("                            <p>We guarantee on time delivery, and the best quality!</p> \n");
      out.write("                            <h2>Happy Shopping</h2></h3> \n");
      out.write("                            <br/><br/>\n");
      out.write("                            <br/><h2>Why should I use FairFoodStore.com?</h2>\n");
      out.write("                            <h3><p>FairFoodStore.com allows you to walk away from the drudgery of grocery shopping and welcome an easy relaxed way of browsing and shopping for groceries.<br/> Discover new products and shop for all your food and grocery needs from the comfort of your home or office.<br/> No more getting stuck in traffic jams, paying for parking, standing in long queues and carrying heavy bags ? get everything you need right at your doorstep. Food shopping online is now easy as every product on your monthly shopping list, is now available online at FairFoodStore.com, <br/>India&#8217;s best online grocery store.</p></h3>\n");
      out.write("                            <h2>So why wait? Start shopping now.</h2>    \n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <a href=\"index.jsp\"></a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                 ");
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
