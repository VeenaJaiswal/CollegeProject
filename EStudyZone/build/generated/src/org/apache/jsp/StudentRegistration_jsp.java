package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MyPackage.CaptchaGenerator;

public final class StudentRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/generalstyle.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/menu.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script>\n");
      out.write("            var i=0;\n");
      out.write("            var imglist=[\"0.jpg\",\"1.jpg\",\"5.jpg\",\"6.jpg\",\"7.jpg\",\"8.jpg\"];\n");
      out.write("          function moveSlider()\n");
      out.write("          {\n");
      out.write("            document.getElementById(\"slide\").src=\"images/\"+imglist[i]; \n");
      out.write("            i++;\n");
      out.write("            if(i==imglist.length)\n");
      out.write("                i=0;\n");
      out.write("            window.setTimeout(\"moveSlider()\",2000);\n");
      out.write("          }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"moveSlider()\">\n");
      out.write("        <form action=\"code/registrationcode.jsp\" method=\"post\">\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <img src=\"images/logo_1.jpg\" width=\"150\" height=\"150\"/>\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"banner\">\n");
      out.write("                        <img src=\"images/study9.jpg\" width=\"850\" height=\"150\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("<li><a href=\"registration.jsp\">REGISTRATION</a></li>\n");
      out.write("<li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("<li><a href=\"enquiry.jsp\">ENQUIRY</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"slider\">\n");
      out.write("                    <img id=\"slide\" width=\"1000\" height=\"250\"/>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"container\">\n");
      out.write("                    <div id=\"left\"></div>\n");
      out.write("                    <div id=\"main\">\n");
      out.write("                        \n");
      out.write("                        <h1 style=\"text-align: center; color:blue\"><marquee bgcolor=green behavior=\"alternate\">Student Registraion</marquee></h1>\n");
      out.write("                          <fieldset style=\"background-image:url(images/book5.jpg)\">  <table  align=\"center\">\n");
      out.write("                                <tr><td>Student name</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"name\" required=\"true\"></td></tr>\n");
      out.write("                            <tr><td>Select the gender</td>\n");
      out.write("                                <td><input type=\"radio\" name=\"gender\" value=\"male\">male</td>\n");
      out.write("                            <td><input type=\"radio\" name=\"gender\" value=\"female\">female</td></tr>\n");
      out.write("                            <tr><td>Enter your address</td>\n");
      out.write("                                <td><textarea name=\"address\"></textarea></td></tr>\n");
      out.write("                            <tr><td>Enter your college name</td>\n");
      out.write("                                <td><textarea name=\"collegeaddress\"></textarea></td></tr>\n");
      out.write("                            <tr><td>enter your qualification</td>\n");
      out.write("                                <td> <select name=\"qualification\">\n");
      out.write("                                        <option>--Select--</option>\n");
      out.write("                                        <option>Btech</option>\n");
      out.write("                                <option>Mtech</option>\n");
      out.write("                                <option>Bca</option>\n");
      out.write("                                <option>Bba</option>\n");
      out.write("                                <option>Mca</option>\n");
      out.write("                                \n");
      out.write("                                    </select></td></tr>\n");
      out.write("                            <tr><td>Training Type</td><td>\n");
      out.write("                                    <select name=\"training\">\n");
      out.write("                                        <option>--select--</option>\n");
      out.write("                                        <option>Summer Training</option>\n");
      out.write("                                        <option>Industrial Training</option>\n");
      out.write("                                        <option>Vocational Training</option>\n");
      out.write("                                        <option>Winter Training</option>\n");
      out.write("                                        <option>Apprentiship Training</option>\n");
      out.write("                                    </select>   \n");
      out.write("                                </td></tr>\n");
      out.write("                            \n");
      out.write("                            <tr><td>Enter contact no</td>\n");
      out.write("                                <td><input type=\"number\" name=\"contactno\" required=\"true\"></td></tr>\n");
      out.write("                            <tr><td>Enter your email</td>\n");
      out.write("                                <td><input type=\"text\" name=\"emailaddress\" required=\"true\"></td></tr>\n");
      out.write("                            <tr><td>Guardian contact no</td>\n");
      out.write("                                <td><input type=\"number\" name=\"Guardiancontactno\" required=\"true\"></td></tr>\n");
      out.write("                            <tr><td>User name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"username\"></td></tr>\n");
      out.write("                            <tr><td>Enter password</td>\n");
      out.write("                                <td><input type=\"password\" name=\"password\"></textarea></td></tr>\n");
      out.write("                            \n");
      out.write("                            <tr><td> Captcha Code</td>\n");
      out.write("                                <td>");

                                    CaptchaGenerator cg= new CaptchaGenerator();
                                    String capcode=cg.createCaptcha();
                                    
      out.write("\n");
      out.write("                                    <h3><strike>\n");
      out.write("                                            ");
      out.print(capcode);
      out.write("</strike>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                        \n");
      out.write("                                    </h3>\n");
      out.write("                                            <input type=\"hidden\" name=\"capcode\" value=\"");
      out.print(capcode);
      out.write("\"\n");
      out.write("                                    \n");
      out.write("                            <tr>  <td>enter captchacode</td>\n");
      out.write("                                <td><input type=\"text\" name=\"captchacode\" required=\"true\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                                 \n");
      out.write("                                    \n");
      out.write("                            </tr><td>&nbsp;</td>\n");
      out.write("                                <td><input type=\"submit\" value=\"submit\"></tr>\n");
      out.write("                              </table></fieldset>\n");
      out.write("                      \n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"footer\">\n");
      out.write("                    <div id=\"lfooter\">\n");
      out.write("                        <h3>Copyright &copy;</h3></div>\n");
      out.write("                    <div id=\"rfooter\">\n");
      out.write("                        <center>\n");
      out.write("                            <h3 style=\"font-family: algerian\">Developed By Veena Jaiswal</h3><h3> SRMCEM</h3></center>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
