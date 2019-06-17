<%-- 
    Document   : Loginprofile
    Created on : Jul 22, 2018, 5:57:41 PM
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
                <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
    <body>
        <h1 style="text-align: center; font-size:400% ;color:red ;font-family: Fiolex Girls"> <u>Profile Page </u> </h1>
         <form action="Profile.jsp">
            <input type="hidden" value="<%=request.getParameter("emailll")%>" name="email1"> 
            <label for="name">Name</label>
            <input type="text" palceholder="enter the name" name="name" required>
            <br>
            <br>
              <label for="dob">DOB</label>
              <input type="date" name="dob" required>
             <br>
             <br>
              <label for="gender" >Gender</label>
              <select name="gender">
              <option value="male">male</option>
              <option value="female">female</option>
              </select>
             <br>
             <br>
                <label for="age">age</label>
                <input type="number" name="age" required>
              <br>
              <br>
                  <label for="job">Job</label>
                <input type="text"  name="job" required>
                <br>
                <br>  
                  Religion: <select name="religion">
               <option value="hindu">Hindu</option>
               <option value="muslim">Muslim</option>
               <option value="sikh">Sikh</option>
               <option value="christen">Christen</option>
          </select>
          <br>
             <br>
                  Complextion:     <select name="complextion">
               <option value="fair">Fair</option>
               <option value="medium">Medium</option>
               <option value="olive">Olive</option>
               <option value="brown">Brown</option>
           </select>
    <br>
             <br>
             Height (in cm):<input type="text" name="height" required>
                <input type="submit" name="b1" value="submit" required>
            
        </form>  
        <%
        String name=request.getParameter("name");
        String dob=request.getParameter("dob");
        String gender=request.getParameter("gender");
        String job=request.getParameter("job");
        String age=request.getParameter("age");
        String religion=request.getParameter("religion");
        String complextion=request.getParameter("complextion");
        String height=request.getParameter("height");
        String b1=request.getParameter("b1");
        int count=0;
        String emailpp=request.getParameter("emailll");
        %>
        
        
        <%
        try
        {
            out.println(emailpp);
          Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("insert into profile values(?,?,?,?,?,?,?,?,?)");
                                  PreparedStatement stmt1=con.prepareStatement("  DELETE FROM profile WHERE name IS NULL OR DOB IS NULL OR GENDER IS NULL "
                                    + "OR JOB IS NULL OR AGE IS NULL OR email is null");
                            stmt1.executeQuery();
                stmt.setString(1,name);
                   stmt.setString(2,dob);
                      stmt.setString(3,gender);
                         stmt.setString(4,job);
                           stmt.setString(5,age);
                                 stmt.setString(6,religion);
                                        stmt.setString(7,complextion);
                                               stmt.setString(8,height);
                         stmt.setString(9,emailpp);
                           stmt.executeQuery();
                                              
                 if(b1!=null)
                 {
                RequestDispatcher rd=request.getRequestDispatcher("Dashboardlogin.jsp");
                rd.forward(request,response);
                 }
        }
        catch(Exception e)
        {}
        %>
        

       
    
    </body>
</html>
