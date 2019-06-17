package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class profile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"profile1.jsp\">\n");
      out.write("         <input type=\"text\" name=\"number\" placeholder=\"Enter your number\" required > \n");
      out.write("         <input type=\"text\" name=\"messageemail\" placeholder=\"Enter your email\" required >\n");
      out.write("         <input type=\"submit\" name=\"messagesubmit\" value=\"submit your number\">\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("             ");

       int snomessage=1;
       String number=request.getParameter("number");
       String messageemail=request.getParameter("messageemail");
       String messagesubmit=request.getParameter("messagesubmit");   
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

       try
       {
            if( messagesubmit!=null)
                      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                       out.println("inside else");
                      PreparedStatement stmt4=con.prepareStatement("insert into message values (?,?,?) ");
                                        String message=" name :"+ messageemail +" , number :"+ number ;
                        stmt4.setInt(1,snomessage );
                        stmt4.setString(2,message);
                            stmt4.setString(3,"sumit@gmail.com");
                                 stmt4.executeQuery();
                     
                          
                      RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                rd.forward(request,response);
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
