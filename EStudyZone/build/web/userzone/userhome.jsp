<%-- 
    Document   : userhome
    Created on : 24 Jul, 2017, 6:29:39 PM
    Author     : veena jaiswal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USER ZONE</title>
        <link href="css/userstyle.css" rel="stylesheet"/>
    </head>
    <body>
        <form>
            <%
                if(session.getAttribute("username")==""||session.getAttribute("username")==null)
                    response.sendRedirect("../login.jsp");
                %>
            <div id="wrapper">
                <div id="header">
                    <div id="logo">
                        <img src="images/logo_1.jpg" alt="" height="150" width="150"/>
                    </div>
                    <div id="sitetitle">
                       E-Study Zone 
                    </div>
                </div>
                <div id="contain1">
                    <div id="date"></div>
                    <div id="name"></div></div>
                    <div id="menu"></div>
                    <div id="contain2">
                </div>
                    <div id="footer">
                        <div class="subfooter">
                            copyright &copy; to StudyZone</div>
                        <div class="subfooter">
                            Developed By Veena Jaiswal<br>SRMCEM
                        </div>
                    </div>
        </div>
        </form>
    </body>
</html>
