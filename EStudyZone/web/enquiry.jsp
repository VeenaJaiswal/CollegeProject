<%-- 
    Document   : index
    Created on : 19 Jul, 2017, 5:24:01 PM
    Author     : veena jaiswal
--%>

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
        <form action="SaveEnquiry" method="post">
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
<li><a href="index.jsp">Home</a></li>
<li><a href="registration.jsp">Registration</a></li>
<li><a href="login.jsp">Login</a></li>
<li><a href="enquiry.jsp">Enquiry</a></li>

</ul>

                </div>
                <div id="slider">
                    <img id="slide" width="1000" height="250"/>
                </div>
                <div id="container">
                    <div id="left"></div>
                    
                    <div id="main">
                                        
                        <h1 style="text-align: center; color:blue"><marquee bgcolor=green behavior="alternate">Enquiry Form</marquee></h1>
                        <fieldset style="background-image:url(images/book5.jpg)">  <table  align="center">
                                <tr><td>Enter your name</td>
                                <td><input type="text" name="name"></td></tr><td>&nbsp;</td>
                            <tr><td>Select the gender</td>
                                <td><input type="radio" name="gender" value="male">male</td>
                            <td><input type="radio" name="gender" value="female">female</td></tr><td>&nbsp;</td>
                            <tr><td>Enter your address</td>
                                <td><textarea name="address"></textarea></td></tr><td>&nbsp;</td>
                            <tr><td>Enter contact no</td>
                                <td><input type="text" name="contactno"></td></tr><td>&nbsp;</td>
                            <tr><td>Enter your email</td>
                                <td><input type="text" name="emailaddress"></td></tr><td>&nbsp;</td>
                            <tr><td>Enter text message</td>
                                <td><textarea name="message"></textarea></td></tr><td>&nbsp;</td>
                            <tr><td>&nbsp</td>
                                <td><input type="submit" value="submit"></tr>
                        </table></fieldset>
                        
                    </div>
                </div>
                <div id="footer">
                    <div id="lfooter">
                         <h3>Copyright &copy;</h3>
                    </div>
                    <div id="rfooter"></div>
                </div>
            </div>
        </form>
    </body>
</html>
