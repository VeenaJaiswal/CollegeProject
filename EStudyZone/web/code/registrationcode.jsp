<%@page import="MyPackage.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
    String capcode=request.getParameter("capcode");
    String captchacode=request.getParameter("captchacode");
    if(capcode.equals(captchacode)==true)
    {
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
    String query1="insert into student_registration values('"+name+"','"+gender+"','"+address+"','"+collegeaddress+"','"+qualification+"','"+training+"','"+contactno+"','"+emailaddress+"','"+Guardiancontactno+"','"+username+"','"+password+"','"+registrationdt+"')";
  
    String query2="insert into login values('"+username+"','"+password+"','"+usertype+"','"+status+"')";
   
    if(dm.executeNonQuery(query1)==true)
    {
      if(dm.executeNonQuery(query2)==true) 
      {
           out.print("<script>alert('registration is successfull');window.location.href='../StudentRegistration.jsp';</script>");
      }
      else
      { out.print("<script>alert('registration is done but login detail are not saved');window.location.href='../StudentRegistration.jsp';</script>");
          
      }
    }
    else
    {
        out.print("<script>alert('database error');window.location.href='../StudentRegistration.jsp';</script>");
        
    }}
    else
    {
        out.print("<script>alert('invalid captcha code');window.location.href='../StudentRegistration.jsp';</script>");
    }
    %>