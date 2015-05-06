/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputeHashFunction;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
@WebServlet(name = "DoctorAvailable", urlPatterns = {"/DoctorAvailable"})
public class DoctorAvailable extends HttpServlet {

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
        int ifPresent = 0;
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
                
                /*
                Statement sta = connection.createStatement();
		String Sql = "select * from persons";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("City"));
                }
                */
                String abc = "abc";
                /*
                Statement stmt = connection.createStatement();
                stmt = connection.createStatement();
                String sql = "UPDATE Persons " +
                   "SET firstname = "+abc+" WHERE firstname="+name;*/
      
      String query = "update doctorprofile set isavailable = 1 where email_id = ?";
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      //preparedStmt.setString(1, abc);
      preparedStmt.setString(1, email);
      
      request.getSession().setAttribute("doctorEmail", email);
      ifPresent = preparedStmt.executeUpdate();
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}
 
	if (ifPresent!=0) {
		System.out.println("You made it, take control your database now!");
                String nextView="doctorlanding.jsp";
                RequestDispatcher view = request.getRequestDispatcher(nextView);
                view.forward(request, response);
	} else {
		System.out.println("Failed to make connection!");
                String nextView="doctor.jsp";
                RequestDispatcher view = request.getRequestDispatcher(nextView);
                view.forward(request, response);
	}
        
        //String nextView="doctorlanding.jsp";
        //RequestDispatcher view = request.getRequestDispatcher(nextView);
        //view.forward(request, response);
    }

    
    

}
