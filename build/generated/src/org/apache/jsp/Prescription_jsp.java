package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Prescription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <title>Prescription</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form class=\"form-horizontal\" action=\"Prescription.jsp\" method=\"POST\">\n");
      out.write("            <h2>Prescription</h2>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Symptoms</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"symptoms\" placeholder=\"Symptoms\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Prescription</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"prescription\" placeholder=\"Prescription\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Diagnosis</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"diagnosis\" placeholder=\"Diagnosis\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Comments</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"comments\" placeholder=\"Comments\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Submit Prescription</button>\n");
      out.write("                </div>\n");
      out.write("            </div\n");
      out.write("       </form>\n");
      out.write("       \n");
      out.write("       ");
 
            Connection connection = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/mdt","root", "root");

            Statement statement1 = connection.createStatement();
            
            String doctorEmail = session.getAttribute("doctorEmail").toString();
            String patientEmail = session.getAttribute("patientEmail").toString();
            
            //String doctorEmail = "pugangal@gmail.com";
            //String patientEmail = "kaushalmk90@gmail.com";
            
            String diagnosis = request.getParameter("diagnosis");
            String symptoms = request.getParameter("symptoms");
            String prescription = request.getParameter("prescription");
            String comments = request.getParameter("comments");
            
            //String abc = session.getAttribute("pemail").toString();
            //System.out.println("Username "+abc);
            if(prescription != null){
            int insertResult = 
                    statement1.executeUpdate("insert into Interaction_Rec (Patient_Email,Doctor_Email,Time,Symptoms,Prescription,Diagnosis,Comments) values ('"+patientEmail+"','"+doctorEmail+"',NOW(),'"+symptoms+"','"+prescription+"','"+diagnosis+"','"+comments+"')"); 

            if(insertResult == 0) {
                out.println("Cannot Insert");
            } else {
                out.println("Prescription Updated");
            }
            
            String redirectURL = "doctorlanding.jsp";
            response.sendRedirect(redirectURL);

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
