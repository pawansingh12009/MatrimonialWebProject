<%-- 
    Document   : Message1
    Created on : Aug 22, 2018, 1:31:27 PM
    Author     : admin
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
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
      <form action="Message1.jsp" method="post">
         Do you want to share your number :
         <input type="text" name="num" placeholder="Enter your number" required > 
         <input type="text" name="messageemail" placeholder="Enter your email" required >
         <input type="submit" name="messagesubmit" value="submit your number">
        </form>
        
        <%
        String number=request.getParameter("num");
        String messageemail=request.getParameter("messageemail");
        String messagesubmit=request.getParameter("messageemail");
     //int snomessage=0;
       int count=0;
       String name=" ";
       String email=" ";
       int sum=0;
       
        %>
        
        
        <%       
            try
            {
              if(messagesubmit!=null)
            {
               session.getAttribute("Sno1");
                out.println( session.getAttribute("Sno1"));
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
             
               /* PreparedStatement stmt=con.prepareStatement("select sno from message where sno = "+session.getAttribute("snomessage")+" ");
                ResultSet rs=stmt.executeQuery();
                out.println("inside whileaa");
                while(rs.next())
                {
                out.println("inside while rs.nexxt");
                count = rs.getInt(1);
                }*/
               PreparedStatement stmt2=con.prepareStatement("select * from profile where sno = "+session.getAttribute("Sno1") +" ");
                ResultSet rs2=stmt2.executeQuery();
                while(rs2.next())
                {
                    out.println("inside while rs5");
                    email=rs2.getString(9);
                    out.println("inside while rs5 a");
                }
                out.println(email);
                PreparedStatement stmt3=con.prepareStatement("select * from profile where email = '"+ session.getAttribute("Name") +"' ");
                       ResultSet rs3=stmt3.executeQuery();
                      while(rs3.next())
                       {
                       out.println("inside while");
                       name=rs3.getString(1);
                                  out.println("inside whilea");
                                             }
                       out.println(name);
                       String message=" name :"+ name +" , number :"+ number +", email "+session.getAttribute("Name") ;
                   //    String str1=session.getAttribute("Name");
                        PreparedStatement stmt4=con.prepareStatement("select * from message where email = '"+ session.getAttribute("Name") +"' ");
                       ResultSet rs4=stmt4.executeQuery();
                       String emailm="";
                      while(rs4.next())
                       {
                       out.println("inside while");
                       emailm=rs4.getString(1);
                                  out.println("inside whilea");
                                             }
                   
          PreparedStatement stmt5 = con.prepareStatement("update message set message=message||CHR(13)|| '"+message+"' where sno = "+session.getAttribute("Sno1")+"");
                       
                             stmt5.executeQuery();
                                 RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                                 rd.forward(request,response);
                }
             /*   if(sum==1)
                {
                        session.getAttribute("Sno1")
                RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                rd.forward(request,response);
                }*/
               
            }
            
            catch(NumberFormatException e)
            {
        out.println("hello" + e);
            }
        
        %>
        
        

    </body>
</html>
