<%-- 
    Document   : index
    Created on : 19 Jul, 2017, 5:24:01 PM
    Author     : veena jaiswal
--%>

<%@page import="MyPackage.CaptchaGenerator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/generalstyle.css" rel="stylesheet"/>
        <link href="css/menu.css" rel="stylesheet"/>
        <script>
            var i=0;
            var imglist=["0.jpg","1.jpg","5.jpg","6.jpg","7.jpg","8.jpg"];
          function moveSlider()
          {
            document.getElementById("slide").src="images/"+imglist[i]; 
            i++;
            if(i==imglist.length)
                i=0;
            window.setTimeout("moveSlider()",2000);
          }
        </script>
    </head>
    <body onload="moveSlider()">
        <form action="code/registrationcode.jsp" method="post">
            <div id="wrapper">
                <div id="header">
                    <div id="logo">
                        <img src="images/logo_1.jpg" width="150" height="150"/>
                         
                    </div>
                    <div id="banner">
                        <img src="images/study9.jpg" width="850" height="150"/>
                    </div>
                </div>
                <div id="menu">
                    <ul>
<li><a href="index.jsp">HOME</a></li>
<li><a href="registration.jsp">REGISTRATION</a></li>
<li><a href="login.jsp">LOGIN</a></li>
<li><a href="enquiry.jsp">ENQUIRY</a></li>
</ul>

                </div>
                <div id="slider">
                    <img id="slide" width="1000" height="250"/>
                </div>
                <div id="container">
                    <div id="left"></div>
                    <div id="main">
                        
                        <h1 style="text-align: center; color:blue"><marquee bgcolor=green behavior="alternate">Student Registraion</marquee></h1>
                          <fieldset style="background-image:url(images/book5.jpg)">  <table  align="center">
                                <tr><td>Student name</td>
                                    <td><input type="text" name="name" required="true"></td></tr>
                            <tr><td>Select the gender</td>
                                <td><input type="radio" name="gender" value="male">male</td>
                            <td><input type="radio" name="gender" value="female">female</td></tr>
                            <tr><td>Enter your address</td>
                                <td><textarea name="address"></textarea></td></tr>
                            <tr><td>Enter your college name</td>
                                <td><textarea name="collegeaddress"></textarea></td></tr>
                            <tr><td>enter your qualification</td>
                                <td> <select name="qualification">
                                        <option>--Select--</option>
                                        <option>Btech</option>
                                <option>Mtech</option>
                                <option>Bca</option>
                                <option>Bba</option>
                                <option>Mca</option>
                                
                                    </select></td></tr>
                            <tr><td>Training Type</td><td>
                                    <select name="training">
                                        <option>--select--</option>
                                        <option>Summer Training</option>
                                        <option>Industrial Training</option>
                                        <option>Vocational Training</option>
                                        <option>Winter Training</option>
                                        <option>Apprentiship Training</option>
                                    </select>   
                                </td></tr>
                            
                            <tr><td>Enter contact no</td>
                                <td><input type="number" name="contactno" required="true"></td></tr>
                            <tr><td>Enter your email</td>
                                <td><input type="text" name="emailaddress" required="true"></td></tr>
                            <tr><td>Guardian contact no</td>
                                <td><input type="number" name="Guardiancontactno" required="true"></td></tr>
                            <tr><td>User name</td>
                                <td><input type="text" name="username"></td></tr>
                            <tr><td>Enter password</td>
                                <td><input type="password" name="password"></textarea></td></tr>
                            
                            <tr><td> Captcha Code</td>
                                <td><%
                                    CaptchaGenerator cg= new CaptchaGenerator();
                                    String capcode=cg.createCaptcha();
                                    %>
                                    <h3><strike>
                                            <%=capcode%></strike>
                                    
                                    
                                        
                                    </h3>
                                            <input type="hidden" name="capcode" value="<%=capcode%>"
                                    
                            <tr>  <td>enter captchacode</td>
                                <td><input type="text" name="captchacode" required="true"></td>
                            </tr>
                                 
                                    
                            </tr><td>&nbsp;</td>
                                <td><input type="submit" value="submit"></tr>
                              </table></fieldset>
                      
                            
                                
                            
                        
                    </div>
                </div>
                <div id="footer">
                    <div id="lfooter">
                        <h3>Copyright &copy;</h3></div>
                    <div id="rfooter">
                        <center>
                            <h3 style="font-family: algerian">Developed By Veena Jaiswal</h3><h3> SRMCEM</h3></center>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
