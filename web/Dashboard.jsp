<%-- 
    Document   : Dashboard
    Created on : Jul 10, 2018, 10:14:18 PM
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
    <h1 style="font-family:Fiolex Girls; font-size:400%;text-align:center; color:red ">Find Your Love</h1>
            
    <%
           String emaildb=request.getParameter("email1");
      Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                  PreparedStatement stmt1=con.prepareStatement("select * from profile where email='"+emaildb+"'");
                               PreparedStatement stmt4=con.prepareStatement("select sno from matuser1 where email='"+emaildb+"'");
                                 int sno=0;
                                     ResultSet rs4=stmt4.executeQuery();
                                     while(rs4.next())
                                     {
                                         sno=rs4.getInt(1);
                                     }
                                     final int sno1=sno;
                  ResultSet rs1=stmt1.executeQuery();
                  while(rs1.next())
                  {
                  out.print("  <h1 style='font-family:Fiolex Girls; font-size:200 %; color:black'>Hello</h1> "+rs1.getString(1));
                  out.print(" <h1 style='font-family:Fiolex Girls; font-size:200 %; color:black'>Let's Find Your Love , Choose your Mate's Quality  </h1>");
                  }
    %>
    <br>
    <br>
    <form action="Dashboard.jsp">
 
     <label for="gender">Gender:</label>           <select name="gender">
               <option value="male">male</option>
               <option value="female">female</option>
           </select>

           </select>   
                  Religion: <select name="religion">
               <option value="hindu">Hindu</option>
               <option value="muslim">Muslim</option>
               <option value="sikh">Sikh</option>
               <option value="christen">Christen</option>
          </select>
            Complextion:     <select name="complextion">
               <option value="fair">Fair</option>
               <option value="medium">Medium</option>
               <option value="olive">Olive</option>
               <option value="brown">Brown</option>
           </select>
            AgeMin:
            <input type="text" name="agemin11" required>
            AgeMax:
             <input type="text" name="agemin12" required>
             <input type="submit" name="s1" value="Search"  >
               </form>

        <style>
#customers {
    font-family: Arial ;
    font-size: 100%;
    border-collapse: collapse;
    width: 100%;
}
#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>

            
       <%
       String agemin=request.getParameter("agemin11");
        String agemax=request.getParameter("agemax12");
         String gender=request.getParameter("gender");
         String religion=request.getParameter("religion");
          String complextion=request.getParameter("complextion");
           String height=request.getParameter("height");
           String b1=request.getParameter("s1");
         
       %>
       
       
       <%
         try
         {
             
             String str="select * from profile where gender='"+gender+"' and age > '"+agemin+"' and age < '"+agemax+"' and religion= '"+religion+"' and complextion='"+complextion+"'";
          Class.forName("oracle.jdbc.driver.OracleDriver");
          out.println(emaildb);
          out.println(sno);
                  while(rs1.next())
                  {
                  out.println("Hello "+rs1.getString(1));
                  }
                       PreparedStatement stmt=con.prepareStatement(str);
                  ResultSet rs=stmt.executeQuery();
                  if(b1!= null)
                  {
                     /*  out.println("<br>");
                       out.println("Enter The SNO Of The Partner : <input type='text' name='search' placeholder='enter the SNO' >");
                       out.println("<br>");
                       out.println("<br>");*/
                    
                       out.println("<table id='customers'>"+
                "<tr>"+
                "<th>Name</th>"+
                "<th>DOB</th>"+
                "<th>Gender</th>"+
                                        "<th>Job</th>"+
                                        "<th>Age</th>"+
                                        "<th>Religion</th>"+
                              "<th>Complextion</th>"+
                              "<th>Height</th>"+
                                "<th>Sno</th>"+
                "</tr>");
             while(rs.next())
                {
                   out.println(""+
                                "<tr>"+
                                  "<td>"+rs.getString(1)+"</td>"+
                                  "<td>"+rs.getString(2)+"</td>"+
                                  "<td>"+rs.getString(3)+"</td>"+
                                  "<td>"+rs.getString(4)+"</td>"+
                                  "<td>"+rs.getString(5)+"</td>"+
                                  "<td>"+rs.getString(6)+"</td>"+
                                               "<td>"+rs.getString(7)+"</td>"+
                                                            "<td>"+rs.getString(8)+"</td>"+
                                                                              "<td>"+rs.getString(10)+"</td>"+
                                "</tr>"+


                              "");
                }
                    out.println("</table>");
                  
                  }
         }
         catch(Exception e)
         {
         
                
         }
   
       %>
     <div>
         <form action="Dashboard.jsp">
              Enter The SNO Of The Partner : 
              <input type="number" name="snomessage" placeholder="enter the SNO" required >
              <input type="submit" name="message" value="go">
        </form>
        
    </div>  
      <%
         String b2=request.getParameter("message");
                 String snomessage=request.getParameter("snomessage");
                session.setAttribute("Sno1",snomessage);
         if(b2!=null)
         {
             RequestDispatcher rd=request.getRequestDispatcher("Message1.jsp");
                rd.forward(request,response);
         
         }
         
         %>
    </body>
</html>
