<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Prescription</title>
    </head>
    <body>
        
        <form class="form-horizontal" action="Prescription.jsp" method="POST">
            <h2>Prescription</h2>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Symptoms</label>
                <div class="controls">
                    <input type="text" name="symptoms" placeholder="Symptoms">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Prescription</label>
                <div class="controls">
                    <input type="text" name="prescription" placeholder="Prescription">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Diagnosis</label>
                <div class="controls">
                    <input type="text" name="diagnosis" placeholder="Diagnosis">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Comments</label>
                <div class="controls">
                    <input type="text" name="comments" placeholder="Comments">
                </div>
            </div>
            
            
            
            
              <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">Submit Prescription</button>
                </div>
            </div
       </form>
       
       <% 
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
        %>
    </body>
</html>
