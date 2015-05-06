/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputeHashFunction;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       
       
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
                
                String sqlDoctorAvail = "select password from  patientprofile where Email_ID='"+email+"'";
                ResultSet rs = sta.executeQuery(sqlDoctorAvail);
                String passwordDB="";
                
                if(rs.next())
                    passwordDB = rs.getString(1);
                else{
                    String nextView="index.jsp";
                    RequestDispatcher view = request.getRequestDispatcher(nextView);
                    view.forward(request, response);
                }
                if(!password.equals(passwordDB)){
                    String nextView="index.jsp";
                    RequestDispatcher view = request.getRequestDispatcher(nextView);
                    view.forward(request, response);
                }else{
                    String nextView="patientInfo.jsp";
                    request.setAttribute("pemail", email);
                    
                    
                    String populateQuery = "select PA_Name,PA_Value,PA_Units,PA_Duration,PA_Intensity, Blood_Group,Body_Weight,Body_Height,BMI,Heart_Rate,Avg_Sleep_Duration,IsSmoker,IsAlcoholic,OtherDrugAddiction from patientmedicalprofile where patient_email = '"+email+"' ORDER BY time DESC";
                    ResultSet rs1 = sta.executeQuery(populateQuery);
                    if(rs1.next()){
                        request.setAttribute("PA_Name", rs1.getString(1));
                        request.setAttribute("PA_Value", rs1.getString(2));
                        request.setAttribute("PA_Units", rs1.getString(3));
                        request.setAttribute("PA_Duration", rs1.getString(4));
                        request.setAttribute("PA_Intensity", rs1.getString(5));
                        request.setAttribute("Blood_Group", rs1.getString(6));
                        request.setAttribute("Body_Weight", rs1.getString(7));
                        request.setAttribute("Body_Height", rs1.getString(8));
                        request.setAttribute("BMI", rs1.getString(9));
                        request.setAttribute("Heart_Rate", rs1.getString(10));
                        request.setAttribute("Avg_Sleep_Duration", rs1.getString(11));
                        request.setAttribute("IsSmoker", rs1.getString(12));
                        request.setAttribute("IsAlcoholic", rs1.getString(13));
                        request.setAttribute("OtherDrugAddiction", rs1.getString(14));
                        
                        
                        
                        RequestDispatcher view = request.getRequestDispatcher(nextView);
                        view.forward(request, response);
                    }
                    
                  
                }
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
       
       
       
       
    }

   
}
