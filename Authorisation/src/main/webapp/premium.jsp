<%@page import="domain.UserType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        //HttpSession session = httpRequest.getSession();
        UserType rights = (UserType) session.getAttribute("loggedin");
        if (rights==null || (rights != null && rights != UserType.ADMIN)) {

            httpResponse.sendRedirect("error.jsp");
        }  
        %>
        <form action="premium" method="get">
            <label> Username: <input type="text" id="Username" name="Username"/></label></br>
            <input type="submit" value="Nadaj Premium"/>
        </form>
         <h3><a href="clear.jsp">Wyloguj</a></h3>
    </body>
</html>
