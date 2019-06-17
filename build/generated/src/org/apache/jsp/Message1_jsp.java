package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class Message1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <form action=\"Message.jsp\" method=\"post\">\n");
      out.write("         Do you want to share your number :\n");
      out.write("         <input type=\"text\" name=\"num\" placeholder=\"Enter your number\" required > \n");
      out.write("         <input type=\"text\" name=\"messageemail\" placeholder=\"Enter your email\" required >\n");
      out.write("         <input type=\"submit\" name=\"messagesubmit\" value=\"submit your number\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

 
       String number=request.getParameter("num");
            int snomessage=Integer.parseInt(request.getParameter("snomessage"));
       //int snomessage=0;
       String messageemail=request.getParameter("messageemail");
       int count=0;
       String name=" ";
       String email=" ";
       int sum=0;
       String messagesubmit=request.getParameter("messagesubmit");
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

      
            
            try
            { 
                if(messagesubmit!=null)
                {
     
               
        //        out.println(session.getAttribute("Name"));
   Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                       PreparedStatement stmt4=con.prepareStatement("insert into message values (?,?,?) where sno = "+snomessage+" ");
           /*     PreparedStatement stmt=con.prepareStatement("select sno from message where sno = "+snomessage+" ");
                ResultSet rs=stmt.executeQuery();
                out.println("inside whileaa");
                while (rs.next())
                {
                out.println("inside while rs.nexxt");
                count = rs.getInt(1);
                }*/
               PreparedStatement stmt2=con.prepareStatement("select * from profile where sno = "+ snomessage +" ");
                ResultSet rs2=stmt2.executeQuery();
                while(rs2.next())
                {
                    out.println("inside while rs5");
                    email=rs2.getString(9);
                    out.println("inside while rs5 a");
                }
            
                 PreparedStatement stmt3=con.prepareStatement("select * from profile where email = '"+ session.getAttribute("Name") +"' ");
                       ResultSet rs3=stmt3.executeQuery();
                       while(rs3.next())
                       {
                       out.println("inside while");
                       name=rs3.getString(1);
                                  out.println("inside whilea");
                                             }
                       out.println(name);
                       String message=" name :"+ name +" , number :"+ number ;
                  //      stmt4.setInt(1,snomessage );
                        stmt4.setString(2,message);
                        stmt4.setString(3,email);
                                 stmt4.executeQuery();
                                 sum=1;
                
                }
             /*   if(sum==1)
                {
                        
                RequestDispatcher rd=request.getRequestDispatcher("Send.jsp");
                rd.forward(request,response);
                }*/
                }
            
            
            catch(NumberFormatException e)
            {
        out.println("hello" + e);
            }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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
