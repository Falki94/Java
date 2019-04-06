<%-- 
    Document   : clear
    Created on : Apr 1, 2019, 8:48:34 PM
    Author     : Falki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            session.setAttribute("loggedin", null);
        %>
        <jsp:forward page="login.jsp"></jsp:forward>
    </body>
</html>
