package org.apache.jsp.code;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MyPackage.DatabaseManager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class registrationcode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    //process the request
    String name=request.getParameter("name");
    String gender=request.getParameter("gender");
    String address=request.getParameter("address");
    String collegeaddress=request.getParameter("collegeaddress");
    String qualification=request.getParameter("qualification");
    String training=request.getParameter("training");
    long contactno=Long.parseLong(request.getParameter("contactno"));
    String emailaddress=request.getParameter("emailaddress");
    long Guardiancontactno=Long.parseLong(request.getParameter("Guardiancontactno"));
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    String registrationdt=df.format(new Date());
    String usertype="student";
    String status="no";
    DatabaseManager dm=new DatabaseManager();
    String query1="insert into student_registration values('"+name+"','"+gender+"','"+address+"','"+collegeaddress+"','"+qualification+"','"+training+"','"+contactno+"','"+emailaddress+"','"+Guardiancontactno+"')";
    String query2="insert into login values('"+username+"','"+password+"','"+usertype+"','"+status+"')";
    if(dm.excuteNonQuery(query1)==true)
    {
      if(dm.excuteNonQuery(query2)==true) 
      {
          out.println("registration successfull");
      }
      else
      {
          out.println("registration is done but login detail are not saved");
      }
    }
    else
    {
        out.println("database error");
    }
    
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
