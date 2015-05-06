
/**
 * This File: ComputeHashes.java: It is a servlet that calculates the required hash values on the input parameters
 * @author Kaushal Kulkarni
 */
package ComputeHashFunction;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ComputeHashes",
        urlPatterns = {"/getHashValue"})
public class ComputeHashes extends HttpServlet {

    
    Model acm = null;  // The "business model" for this app
    /**
     * This is the servlet's Get method
     * @param request The HttpServletRequest object
     * @param response The HttpServletResponse object
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Store value of Parameters from the JSP Page
        
        String url = "https://kaushal-mdt.herokuapp.com/";
        //String name = request.getParameter("fname");
        String email = request.getParameter("email");
        String doctorEmail = null;
        
        //System.out.println("Fname = "+name);
        //System.out.println("Fname = "+email);
        Random rn = new Random();
        int rand = rn.nextInt(1000000 - 100000 + 1) + 100000;
  
        url = url+rand;
        request.setAttribute("url", url);
        
        // Database Connection
        
        try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
 
	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;
 
	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/mdt","root", "root");
                
                Statement sta = connection.createStatement();
		//String Sql = "select * from persons";
		//ResultSet rs = sta.executeQuery(Sql);
		//while (rs.next()) {
		//	System.out.println(rs.getString("City"));
                //}
                
                String sqlDoctorAvail = "select Email_ID from DoctorProfile where IsAvailable = 1 LIMIT 1 ";
                ResultSet rs = sta.executeQuery(sqlDoctorAvail);
                if(rs.next())
                    doctorEmail = rs.getString(1);
                else{
                    String nextView="index.jsp";
                    RequestDispatcher view = request.getRequestDispatcher(nextView);
                    view.forward(request, response);
                }
                
                
                //Insert patient info about the latest medical condition
                
                String insertPresciption = "insert into PatientMedicalProfile (Patient_Email,PA_Name,PA_Value,PA_Units,PA_Duration,PA_Intensity,Blood_Group,Body_Weight,Body_Height,BMI,Heart_Rate,Avg_Sleep_Duration,IsSmoker,IsAlcoholic,OtherDrugAddiction, Time ) values ('"+request.getParameter("inputEmail")+"','"+request.getParameter("paname")+"','"+request.getParameter("PA_Value")+"','"+request.getParameter("PA_Units")+"','"+request.getParameter("PA_Duration")+"','"+request.getParameter("PA_Intensity")+"','"+request.getParameter("Blood_Group")+"', '"+request.getParameter("Body_Weight")+"','"+request.getParameter("Body_Height")+"', '"+(Double.parseDouble(request.getParameter("Body_Weight"))/Math.pow(Double.parseDouble(request.getParameter("Body_Height"))*0.394,2))*70.3+"','"+request.getParameter("Heart_Rate")+"', '"+request.getParameter("Avg_Sleep_Duration")+"','"+request.getParameter("IsSmoker")+"','"+request.getParameter("IsAlcoholic")+"','"+request.getParameter("OtherDrugAddiction")+"',NOW() )";
                int rs1 = sta.executeUpdate(insertPresciption);
                
                
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}
 
	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
        
        
        try {
            //SendEmail.Send("donotreplymdt", "mdtspring", request.getParameter("inputEmail"),doctorEmail, "Web Conferencing Link", url);
            //SendEmail.Send("donotreplymdt", "mdtspring", doctorEmail, "Patient Info", email);
            SendEmail.Send("donotreplymdt", "mdtspring", request.getParameter("inputEmail"), "Web Conferencing Link", "<br>"+url+"</br>");
            SendEmail.Send("donotreplymdt", "mdtspring", doctorEmail, "Patient Call Request", "Web Conferencing Link "+url+"<br><br>"+"PatientEmail "+request.getParameter("inputEmail"));
        } catch (MessagingException ex) {
            Logger.getLogger(ComputeHashes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String nextView="result.jsp";
        RequestDispatcher view = request.getRequestDispatcher(nextView);
        view.forward(request, response);
    }
    
    
}
