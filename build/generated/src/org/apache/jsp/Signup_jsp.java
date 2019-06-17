package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                    \n");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Signup.jsp\">\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"pass\"><b>Password</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"enter the password\" name=\"pass\" required>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"repass\"><b>ConfirmPassword</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"enter password again\" name=\"repass\"required>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"submit\" name=\"signup\" value=\"signup\">\n");
      out.write("        </form>\n");
      out.write("        ");

           String email=request.getParameter("email");
            String password=request.getParameter("pass");
            String repeatpassword=request.getParameter("repass");
               String signup=request.getParameter("signup");
               int count=0;
               int sno=0;
               int value=0;
               
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");
    
            
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
        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("  \n");
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
