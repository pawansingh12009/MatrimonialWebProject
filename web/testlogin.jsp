<%-- 
    Document   : testlogin
    Created on : Jul 28, 2018, 5:23:33 PM
    Author     : admin
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
    <body>
            <h1>welcome to login page</h1>
            <form action="Login.jsp">
              <label for="emaill">Email</label>
              <input type="text" name="emaill" placeholder="enter the email" required>
           <br>
           <br>
                <label for="password" >Password</label>
           <input type="text" name="password" placeholder="enter the password" required>
           <br>
           <br>
           <input type="submit" name="login" value="Login">   
    </form>
            <br>
            <br>
            <h1>--------------------------------------------------------------------------------------------------------------</h1>
            <form action="testlogin.jsp">
              <label for="emailll1">Email</label>
              <input type="text" name="emailll1" placeholder="enter the email" required>
           <br>
           <br>
                <label for="password11" >Password</label>
           <input type="text" name="password11" placeholder="enter the password" required>
           <br>
           <br>
           <input type="submit" name="profile1" value="Profile Page">   
    </form>
           
        
       <% 
       String email=request.getParameter("emaill");
              String password1=request.getParameter("password11");
       String email1=request.getParameter("emailll1");
       String password=request.getParameter("password");
       int flag=0;
       int count=0;
int count1=0;
       String profile=request.getParameter("profile");
         String efind;
         String efind1;
       %>
       
       
       <%
          //if(password.equals(repassword))
          //{
           try
           {
       Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
              //  PreparedStatement stmt=con.prepareStatement("select * from matuser1");
              // ResultSet rs=stmt.executeQuery();
                        Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                        PreparedStatement stmt2=con1.prepareStatement("select * from profile");
                      //  ResultSet rs1=stmt2.executeQuery();
                         ResultSet rs2=stmt2.executeQuery();
             /*  while(rs.next())
               {   
               if(email.equals(rs.getString(1))&&password.equals(rs.getString(2)))
               {
                flag=1;
               }
               }
                if(flag==0)
               {
                    out.println("not correct");
               }
                else
                {
                        while(rs1.next())
                        {
                        rs1.getString(9);
                        efind=rs1.getString(9);
                        if(efind.equals(email))
                        {
                            count=1;
                           
                        }
                        }
                        if(count==0)
                        {
                            out.println("inside profile");
                            out.println("please fill your profile first click in the Profile Button");
                        }
                        else
                        {
                            out.println("login sucessful");
                            RequestDispatcher rd1=request.getRequestDispatcher("Dashboardlogin.jsp");
                            rd1.forward(request, response);
                        
                        }
                     
                        }  */
                   while(rs2.next())
                        {
                        rs2.getString(9);
                        efind1=rs2.getString(9);
                        if(efind1.equals(email1))
                        {
                            count1=1;
                            out.println("yes found and already filled");
                        }
                        else
                        {
                            out.println("not found");
                              out.println("inside profile");
                            RequestDispatcher rd1=request.getRequestDispatcher("testprofile.jsp");
                            rd1.forward(request, response);
                        }
                        }
           }
           catch(Exception e)
           {
           }
           
          //}
       %>

    </body>
</html>
