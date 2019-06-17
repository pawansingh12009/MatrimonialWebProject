<%-- 
    Document   : profile1
    Created on : Jul 12, 2018, 9:51:36 AM
    Author     : admin
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="profile1.jsp">
         <input type="text" name="number" placeholder="Enter your number" required > 
         <input type="text" name="messageemail" placeholder="Enter your email" required >
         <input type="submit" name="messagesubmit" value="submit your number">
        </form>
    
             <%
       int snomessage=1;
       String number=request.getParameter("number");
       String messageemail=request.getParameter("messageemail");
       String messagesubmit=request.getParameter("messagesubmit");   
       %>
       
       
       <%
       try
       {
            if( messagesubmit!=null)
                      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                       out.println("inside else");
                      PreparedStatement stmt4=con.prepareStatement("insert into message values (?,?,?) ");
                                        String message=" name :"+ messageemail +" , number :"+ number ;
                  /*      stmt4.setInt(1,snomessage );
                        stmt4.setString(2,message);
                            stmt4.setString(3,"sumit@gmail.com");
                                 stmt4.executeQuery();
                      RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                rd.forward(request,response);
                      }
*/
                      }   
       }
       catch(Exception e)
       {
       out.println(e);
       }
       
       
       %>
    </body>
</html>
