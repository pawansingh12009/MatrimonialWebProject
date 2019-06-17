package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class Message_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("         Do you want to share your number :\n");
      out.write("         <input type=\"text\" name=\"number\" placeholder=\"Enter your number\" > \n");
      out.write("         <input type=\"text\" name=\"nessageemail\" placeholder=\"Enter your email\" required >\n");
      out.write("         <input type=\"submit\" name=\"messagesubmit\" value=\"submit your number\">\n");
      out.write("        </form>\n");
      out.write("       ");

       int snomessage=Integer.parseInt(request.getParameter("snomessage"));
       String number=request.getParameter("number");
       String messageemail=request.getParameter("messageemail");
       String messageemail1=request.getParameter("email1");
       int count=0;
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

           try{
               out.println(messageemail1);
   Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("select sno from message where sno ="+snomessage+"");
                    PreparedStatement stmt1=con.prepareStatement("select * from profile where email ="+ messageemail1+"");
                       ResultSet rs1=stmt1.executeQuery();
                       while(rs1.next())
                       {
                           out.println("inside while");
                       out.println(rs1.getString(1));
                       }
                     //PreparedStatement stmt2=con.prepareStatement("update message set message|| "+ number + "");
                ResultSet rs=stmt.executeQuery();
                while(rs.next())
                {
                count = rs.getInt(1);
                }
                if(count>0)
                {
                
                }
                else
                {
                }
                
           }
           catch(Exception e)
                   {
                   out.println(e);
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
