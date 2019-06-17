<%-- 
    Document   : Help
    Created on : Jul 9, 2018, 3:30:33 PM
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
        <h1>Hello World!</h1>

        <form method=post action="Error.jsp" name=form1> 
       <select name="page1"> 
           <option>first</option> 
           <option>second</option> 
           <option>third</option> 
       </select><br><br> 
Enter your user id &nbsp&nbsp&nbsp&nbsp : 
<input type=text name="testuid"><p> 
Enter your password : 
<input type=password name="testupwd"><p> 
<input type=submit value="submit"> 
   </form> 
    </body>
</html>
