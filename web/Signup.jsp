<%-- 
    Document   : Signup
    Created on : Jul 9, 2018, 3:27:03 PM
    Author     : admin
--%>                                                                                                                                                                                                                                                                                                                                                                                                                                                    


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
    <body>
        <form action="Signup.jsp">
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    <br>
    <label for="pass"><b>Password</b></label>
    <input type="text" placeholder="enter the password" name="pass" required>
    <br>
    <label for="repass"><b>ConfirmPassword</b></label>
    <input type="text" placeholder="enter password again" name="repass"required>
    <br>
    <input type="submit" name="signup" value="signup">
        </form>
        <%
           String email=request.getParameter("email");
            String password=request.getParameter("pass");
            String repeatpassword=request.getParameter("repass");
               String signup=request.getParameter("signup");
               int count=0;
               int sno=0;
               int value=0;
               
        %>
        
        

        <%    
            
        try
        {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                    PreparedStatement stmt1=con.prepareStatement("select max(sno) from matuser1");
                       ResultSet rs1=stmt1.executeQuery();
                       while(rs1.next())
                       {
                    //    out.println("inside if");
                        sno=rs1.getInt(1);
                      //  out.println("after sno");
                       }
                sno=sno+1;
                out.println(sno);
                PreparedStatement stmt2=con.prepareStatement("select * from matuser1");
                ResultSet rs=stmt2.executeQuery();
                while(rs.next())
                {
                    String id;
                    id=rs.getString(1);
                   if(id.equals(email))
                    {
                        count=1;
                        //out.println("inside the while found email");
                    }
                }
                if(count==0)
                    {
                        out.println("not found ");
                            if(password.equals(repeatpassword))
                                {
                        out.println("password correct");
                        PreparedStatement stmt=con.prepareStatement("insert into matuser1 values(?,?,?)");
                        stmt.setString(1, email);
                        stmt.setString(2, password);    
                        stmt.setInt(3,sno);
                        stmt.executeQuery();
                        out.println("signup successful");
                        RequestDispatcher rd=request.getRequestDispatcher("Profile.jsp");
                        rd.forward(request,response);
                                }
                            else
                                {
                        out.println("fill password correctly");
                                }
                    }
                else
                    {
                        out.println("user already exist");
                    }
        }
        catch(Exception e)
        {
    out.println(e);
        }
        %>
        

    </body>
  
</html>
