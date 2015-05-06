package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <title>Tele Medicine</title>\n");
      out.write("    </head>\n");
      out.write("<body style=\"background:URL(img/banner_img01.jpg); background-repeat: no-repeat; background-size: 100% 100%;\">\n");
      out.write("            <h1 align=\"center\">Welcome to Tele Medicine</h1>\n");
      out.write("        <h3>Please enter the mandatory information:</h3>\n");
      out.write("        <form class=\"form-horizontal\" action=\"getHashValue \" method=\"GET\">\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"paname\">Physical Activity Name</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"paname\" placeholder=\"First Name\" value=\"");
      out.print( request.getAttribute("PA_Name"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"PA_Value\">PA_Value</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"PA_Value\" placeholder=\"PA_Value\" value=\"");
      out.print( request.getAttribute("PA_Value"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("             <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"PA_Units\">PA_Units</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"PA_Units\" placeholder=\"First Name\" value=\"");
      out.print( request.getAttribute("PA_Units"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"PA_Duration\">PA_Duration</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"PA_Duration\" placeholder=\"PA_Duration\"  value=\"");
      out.print( request.getAttribute("PA_Duration"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("             <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"PA_Intensity\">PA_Intensity</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"PA_Intensity\" placeholder=\"First Name\" value=\"");
      out.print( request.getAttribute("PA_Intensity"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"Blood_Group\">Blood_Group</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"Blood_Group\" placeholder=\"Blood_Group\" value=\"");
      out.print( request.getAttribute("Blood_Group"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("             <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"Body_Weight\">Body_Weight</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"Body_Weight\" placeholder=\"Body_Weight\" value=\"");
      out.print( request.getAttribute("Body_Weight"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"Body_Height\">Body_Height</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"Body_Height\" placeholder=\"Body_Height\" value=\"");
      out.print( request.getAttribute("Body_Weight"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"Heart_Rate\">Heart_Rate</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"Heart_Rate\" placeholder=\"Heart_Rate\" value=\"");
      out.print( request.getAttribute("Heart_Rate"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"Avg_Sleep_Duration\">Avg_Sleep_Duration</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"Avg_Sleep_Duration\" placeholder=\"Avg_Sleep_Duration\" value=\"");
      out.print( request.getAttribute("Avg_Sleep_Duration"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"IsSmoker\">IsSmoker</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"IsSmoker\" placeholder=\"IsSmoker\" value=\"");
      out.print( request.getAttribute("IsSmoker"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"IsAlcoholic\">IsAlcoholic</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"IsAlcoholic\" placeholder=\"IsAlcoholic\" value=\"");
      out.print( request.getAttribute("IsAlcoholic"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("                \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"OtherDrugAddiction\">OtherDrugAddiction</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"OtherDrugAddiction\" placeholder=\"OtherDrugAddiction\" value=\"");
      out.print( request.getAttribute("OtherDrugAddiction"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("               \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">Email</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"inputEmail\" placeholder=\"Email\" value=\"");
      out.print( request.getAttribute("pemail"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"symptoms\">Symptoms</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"checkbox\" value=\"a\" name=\"fever\"> Fever\t\t  \n");
      out.write("                    <input type=\"checkbox\" value=\"b\" name=\"cold\"> Cold\t\t\n");
      out.write("                    <input type=\"checkbox\" value=\"c\" name=\"cough\" id=i> Cough\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"checkbox\" value=\"a\" name=\"stomach upset\"> Stomach Upset\t\t  \n");
      out.write("                    <input type=\"checkbox\" value=\"b\" name=\"stress\"> Stress\t\t\n");
      out.write("                    <input type=\"checkbox\" value=\"c\" name=\"high_sugar\" id=i> High Sugar\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\" for=\"bt\">Body Temperature</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <input type=\"text\" name=\"bt\" placeholder=\"Body Temperature\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Call</button>\n");
      out.write("                </div>\n");
      out.write("            </div\n");
      out.write("        </form>\n");
      out.write("        \n");
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
