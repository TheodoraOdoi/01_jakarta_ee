<%-- 
    Document   : index
    Created on : Sep 27, 2026, 1:31:22 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADSE2501 - Home Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!-- Redirect the user to the addition form page -->
        <%
//            response.sendRedirect("frmaddnums.jsp");
        %>
        <<a href="frmaddnums.jsp">Add Numbers</a> |
        <a href="${pageContext.request.contextPath}/UpperCaseDemo">Upper Case Demo</a>
    </body>
</html>
