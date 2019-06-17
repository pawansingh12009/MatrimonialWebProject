package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <h1>welcome to login page</h1>\n");
      out.write("            <form action=\"Login.jsp\">\n");
      out.write("              <label for=\"emaill\">Email</label>\n");
      out.write("              <input type=\"text\" name=\"email1\" placeholder=\"enter the email\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("                <label for=\"password\" >Password</label>\n");
      out.write("           <input type=\"text\" name=\"password\" placeholder=\"enter the password\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" name=\"login\" value=\"Login\">   \n");
      out.write("    </form>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <h1>--------------------------------------------------------------------------------------------------------------</h1>\n");
      out.write("  <!--        <form action=\"Login.jsp\">\n");
      out.write("              <label for=\"emailll\">Email</label>\n");
      out.write("              <input type=\"text\" name=\"emailll\" placeholder=\"enter the email\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("                <label for=\"password\" >Password</label>\n");
      out.write("           <input type=\"text\" name=\"password1\" placeholder=\"enter the password\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" name=\"profile\" value=\"Profile Page\">   \n");
      out.write("    </form>-->\n");
      out.write("           \n");
      out.write("        \n");
      out.write("       ");
 
       String email1=request.getParameter("email1");
       //       String password1=request.getParameter("password1");
     //  String email1=request.getParameter("emailll");
       String password=request.getParameter("password");
       int flag=0;
       int count=0;
int count1=0;
       String profile=request.getParameter("profile");
         String efind;
         String efind1;
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

          //if(password.equals(repassword))
          //{
           try
           {
       Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("select * from matuser1");
               ResultSet rs=stmt.executeQuery();
               
                session.setAttribute("Name",email1);
              //          Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                //        PreparedStatement stmt2=con1.prepareStatement("select * from profile");
                  //      ResultSet rs1=stmt2.executeQuery();
                    //     ResultSet rs2=stmt2.executeQuery();
               while(rs.next())
               {   
               if(email1.equals(rs.getString(1))&&password.equals(rs.getString(2)))
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
                      out.println("login sucessful");
                            RequestDispatcher rd1=request.getRequestDispatcher("Dashboard.jsp");
                            rd1.forward(request, response);
                      /*  while(rs1.next())
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
                        
                        }*/
                     
                        }  
           }
           catch(Exception e)
           {
           }
           
          //}
       
      out.write("\n");
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
