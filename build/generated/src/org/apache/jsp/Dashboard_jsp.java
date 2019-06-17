package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <h1 style=\"font-family:Fiolex Girls; font-size:400%;text-align:center; color:red \">Find Your Love</h1>\n");
      out.write("            \n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <form action=\"Dashboard.jsp\">\n");
      out.write(" \n");
      out.write("     <label for=\"gender\">Gender:</label>           <select name=\"gender\">\n");
      out.write("               <option value=\"male\">male</option>\n");
      out.write("               <option value=\"female\">female</option>\n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("           </select>   \n");
      out.write("                  Religion: <select name=\"religion\">\n");
      out.write("               <option value=\"hindu\">Hindu</option>\n");
      out.write("               <option value=\"muslim\">Muslim</option>\n");
      out.write("               <option value=\"sikh\">Sikh</option>\n");
      out.write("               <option value=\"christen\">Christen</option>\n");
      out.write("          </select>\n");
      out.write("            Complextion:     <select name=\"complextion\">\n");
      out.write("               <option value=\"fair\">Fair</option>\n");
      out.write("               <option value=\"medium\">Medium</option>\n");
      out.write("               <option value=\"olive\">Olive</option>\n");
      out.write("               <option value=\"brown\">Brown</option>\n");
      out.write("           </select>\n");
      out.write("            AgeMin:\n");
      out.write("            <input type=\"text\" name=\"agemin11\" required>\n");
      out.write("            AgeMax:\n");
      out.write("             <input type=\"text\" name=\"agemin12\" required>\n");
      out.write("             <input type=\"submit\" name=\"s1\" value=\"Search\"  >\n");
      out.write("               </form>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("#customers {\n");
      out.write("    font-family: Arial ;\n");
      out.write("    font-size: 100%;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("            \n");
      out.write("       ");

       String agemin=request.getParameter("agemin11");
        String agemax=request.getParameter("agemax12");
         String gender=request.getParameter("gender");
         String religion=request.getParameter("religion");
          String complextion=request.getParameter("complextion");
           String height=request.getParameter("height");
           String b1=request.getParameter("s1");
         
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

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
   
       
      out.write("\n");
      out.write("     <div>\n");
      out.write("         <form action=\"Dashboard.jsp\">\n");
      out.write("              Enter The SNO Of The Partner : \n");
      out.write("              <input type=\"number\" name=\"snomessage\" placeholder=\"enter the SNO\" required >\n");
      out.write("              <input type=\"submit\" name=\"message\" value=\"go\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </div>  \n");
      out.write("      ");

         String b2=request.getParameter("message");
                 String snomessage=request.getParameter("snomessage");
                session.setAttribute("Sno1",snomessage);
         if(b2!=null)
         {
             RequestDispatcher rd=request.getRequestDispatcher("Message1.jsp");
                rd.forward(request,response);
         
         }
         
         
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
