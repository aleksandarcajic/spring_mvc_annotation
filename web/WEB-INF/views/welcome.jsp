<%-- 
    Document   : welcome
    Created on : Oct 4, 2016, 9:21:36 PM
    Author     : Aleksandar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${greeting.getClass().simpleName == 'String'}">
            <h1> ${greeting}</h1>
        </c:if>
        <c:if test="${greeting.getClass().simpleName == 'Greeting'}">
            <h1> ${greeting.text}</h1>
            <h1> ${greeting.additionalText}</h1>
            <h1> ${greeting.year}</h1>
        </c:if>
    </body>
</html>
