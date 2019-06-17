<%-- 
    Document   : Newmessage
    Created on : Aug 23, 2018, 10:13:34 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="Newmessage.jsp" >
         Do you want to share your number :
         <input type="text" name="num" placeholder="Enter your number" required > 
         <input type="text" name="messageemail" placeholder="Enter your email" required >
         <input type="submit" name="messagesubmit" value="submit your number">
        </form>
            <%
       String number=request.getParameter("num");
       int snomessage=Integer.parseInt(request.getParameter("snomessage"));
       String messageemail=request.getParameter("messageemail");
       String name=" ";
       String email=" ";
       String messagesubmit=request.getParameter("messagesubmit");
        %>
        
                <%  
            try
            { 
                if(messagesubmit!=null)
                {
   Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                       PreparedStatement stmt4=con.prepareStatement("insert into message values (?,?,?) where sno = "+snomessage+" ");
               PreparedStatement stmt2=con.prepareStatement("select * from profile where sno = "+ snomessage +" ");
                ResultSet rs2=stmt2.executeQuery();
                while(rs2.next())
                {
                    out.println("inside while rs5");
                    email=rs2.getString(9);
                    out.println("inside while rs5 a");
                }
            
                 PreparedStatement stmt3=con.prepareStatement("select * from profile where email = '"+ session.getAttribute("Name") +"' ");
                       ResultSet rs3=stmt3.executeQuery();
                       while(rs3.next())
                       {
                       out.println("inside while");
                       name=rs3.getString(1);
                                  out.println("inside whilea");
                                             }
                       out.println(name);
                       String message=" name :"+ name +" , number :"+ number ;
                  
                             ResultSet rs4=stmt4.executeQuery();
                             rs4.updateString(2, message);
                RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                rd.forward(request,response);
                }
                }
            
            
            catch(Exception e)
            {
        out.println("hello" + e);
            }
        
        %>
    </body>
</html>
