package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class test_005fmysql_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>EMR</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("        <H1>EMR</H1>\n");
      out.write("        <FORM ACTION=\"test_mysql.jsp\" METHOD=\"POST\">\n");
      out.write("            Please enter the ID of the patient you want to find:\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"TEXT\" NAME=\"id\">\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\n");
      out.write("        </FORM>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <H1>Patients EMR</H1>\n");
      out.write("\n");
      out.write("        ");
 
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mdt","root", "root");

            Statement statement = connection.createStatement();

            String id = request.getParameter("id");  

            ResultSet resultset = 
                statement.executeQuery("select * from patientmedicalprofile where patient_email = '" + id + "'") ; 

            if(!resultset.next()) {
                out.println("Sorry, could not find that publisher. " +
                "Please <A HREF='tryAgain.html'>try again</A>.");
            } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>Name</TH>\n");
      out.write("               <TH>Value</TH>\n");
      out.write("               <TH>Physical Activity Units</TH>\n");
      out.write("               <TH>Physical Activity Duration</TH>\n");
      out.write("               <TH>Physical Activity Intensity</TH>\n");
      out.write("               <TH>Blood Group</TH>\n");
      out.write("               <TH>Body Weight</TH>\n");
      out.write("               <TH>Body Height</TH>\n");
      out.write("               <TH>BMI</TH>\n");
      out.write("               <TH>Heart Rate</TH>\n");
      out.write("               <TH>Average Sleep Duration</TH>\n");
      out.write("               <TH>IsSmoker</TH>\n");
      out.write("               <TH>IsAlcoholic</TH>\n");
      out.write("               <TH>Other Drug Addiction</TH>\n");
      out.write("           </TR>\n");
      out.write("           <TR>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(3) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(4) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(5) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(6) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(7) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(8) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(9) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(10) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(11) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(12) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(13) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(14) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(15) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(16) );
      out.write(" </TD>\n");
      out.write("           </TR>\n");
      out.write("       </TABLE>\n");
      out.write("       <BR>\n");
      out.write("       \n");
      out.write("       <FORM ACTION=\"test_mysql.jsp\" METHOD=\"POST\">\n");
      out.write("            Please enter the ID of the patient you want to find:\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"TEXT\" NAME=\"prescription\">\n");
      out.write("            <BR>\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\n");
      out.write("        </FORM>\n");
      out.write("       \n");
      out.write("       ");
 
           } 
       
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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
