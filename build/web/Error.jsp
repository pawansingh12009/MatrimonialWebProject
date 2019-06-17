<%-- 
    Document   : Error
    Created on : Jul 10, 2018, 10:56:11 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

<%@ page language="Java" %> 
<form> 
<input type="text" value="<%=request.getParameter("testuid")%>"> 
<%
String name=request.getParameter("testuid");
out.println(name);

%>
</form> 
        
    </body>
</html>
