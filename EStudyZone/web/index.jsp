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
        <form>
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
<li><a href="StudentRegistration.jsp">REGISTRATION</a></li>
<li><a href="login.jsp">LOGIN</a></li>
<li><a href="enquiry.jsp">ENQUIRY</a></li>
</ul>

                </div>
                <div id="slider">
                    <img id="slide" width="1000" height="250"/>
                </div>
                <div id="container">
                    <div id="left"></div>
                    <div id="main"></div>
                </div>
                <div id="footer">
                    <div id="lfooter"><center>
                            <h3>Copyright &copy;</h3></center>
                        
                    </div>
                    <div id="rfooter">
                        <center>
                            <h3 style="font-family: algerian">Developed By Veena Jaiswal</h3><h3> SRMCEM</h3></center>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
