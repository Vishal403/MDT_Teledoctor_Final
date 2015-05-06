package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class doctorlanding_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <title>Tele Medicine</title>\n");
      out.write("    </head>\n");
      out.write("<body style=\"background:URL(img/banner_img01.jpg); background-repeat: no-repeat; background-size: 100% 100%;\">\n");
      out.write("            <h2>You are now active. Keep monitoring your inbox for patient requests</h2>\n");
      out.write("        <H2>EMR</H2>\n");
      out.write("        <form class=\"form-horizontal\" action=\"doctorlanding.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Email ID of Patient</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"pemail\" placeholder=\"Patient Email\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <button type=\"submit\" class=\"btn\">View EMR</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <a href=\"Prescription.jsp\">Write Prescription</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("        <H2>Patients EMR</H2>\n");
      out.write("\n");
      out.write("        ");
 
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mdt","root", "root");

            Statement statement = connection.createStatement();
            int part2 = 0;
            String id = request.getParameter("pemail");    //patient email id
            //session.setAttribute("pemail", id);
            String doctorEmail = session.getAttribute("doctorEmail").toString();    // doctor email id
            //String doctorEmail ="pugangal@gmail.com";
            ResultSet resultset = 
                statement.executeQuery("select PA_Name,PA_Value,PA_Units,PA_Duration,PA_Intensity,Blood_Group,Body_Weight,Body_Height,BMI,Heart_Rate,Avg_Sleep_Duration,IsSmoker,IsAlcoholic,OtherDrugAddiction,date(pmp.Time), Prescription from patientmedicalprofile pmp left outer join interaction_rec ir on pmp.patient_email = ir.patient_email and date(pmp.time) = date(ir.time) where pmp.patient_email = '"+id+"'") ; 
            
            // set patient email to seesion
            request.getSession().setAttribute("patientEmail", id);
            
            boolean flag = true;
           /* if(!resultset.next()) {
                out.println("Enter the ID of the Patient to view the EMR");
            } else {*/
                
        
      out.write("\n");
      out.write("        ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("           ");
if(flag){
      out.write("\n");
      out.write(" <h3>General Patient Info</h3>\n");
      out.write("    <TABLE BORDER=\"1\" class=\"table\">\n");
      out.write("            <TR>\n");
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
      out.write("           \n");
      out.write("           ");
}
      out.write("\n");
      out.write("           <TR>\n");
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
      out.write("           </TR>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("     </TABLE>\n");
      out.write("     \n");
      out.write("   ");
if(flag){
      out.write("\n");
      out.write("        <h3>Physical Activity Details</h3>\n");
      out.write("        <TABLE BORDER=\"1\" class=\"table\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>Physical Activity Name</TH>\n");
      out.write("               <TH>Physical Activity Value</TH>\n");
      out.write("               <TH>Physical Activity Units</TH>\n");
      out.write("               <TH>Physical Activity Duration</TH>\n");
      out.write("               <TH>Physical Activity Intensity</TH>\n");
      out.write("               \n");
      out.write("           </TR>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("           <TR>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(1) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(2) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(3) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(4) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(5) );
      out.write(" </TD>\n");
      out.write("             </TR>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("     </TABLE>\n");
      out.write("         ");
if(flag){
      out.write("\n");
      out.write("       <h3>Prescription Details</h3>\n");
      out.write("        <TABLE BORDER=\"1\" class=\"table\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>Time</TH>\n");
      out.write("               <TH>Prescription</TH>\n");
      out.write("           </TR>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("           \n");
      out.write("           <TR>\n");
      out.write("               <TD font-face:bold> ");
      out.print( resultset.getString(15) );
      out.write(" </TD>\n");
      out.write("               <TD font-face:bold> ");
      out.print( resultset.getString(16) );
      out.write(" </TD>\n");
      out.write("           </TR>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("     </TABLE>\n");
      out.write("       ");
 
       
        flag = false;
           }
          // } 
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <BR>\n");
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
