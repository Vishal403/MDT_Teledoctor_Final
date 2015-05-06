<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Tele Medicine</title>
    </head>
<body style="background:URL(img/pills-trans.jpg); background-repeat: no-repeat; background-size: 100% 100%;">
            <h2>You are now active. Keep monitoring your inbox for patient requests</h2>
        <H2>EMR</H2>
        <form class="form-horizontal" action="doctorlanding.jsp" method="POST">
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email ID of Patient</label>
                <div class="controls">
                    <input type="text" name="pemail" placeholder="Patient Email">
                </div>
            </div>
            
              <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">View EMR</button>
                </div>
              </div>
            
              <div class="control-group">
                <div class="controls">
                    <a href="Prescription.jsp">Write Prescription</a>
                </div>
              </div>
               
        </form>
      
        <H2>Patients EMR</H2>

        <% 
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
                
        %>
        <% while(resultset.next()){ %>
        <TABLE BORDER="1" class="table">
           <%//if(flag){%>
 <h3>General Patient Info</h3>
    
            <TR>
               <TH>Blood Group</TH>
               <TH>Body Weight</TH>
               <TH>Body Height</TH>
               <TH>BMI</TH>
               <TH>Heart Rate</TH>
               <TH>Average Sleep Duration</TH>
               <TH>IsSmoker</TH>
               <TH>IsAlcoholic</TH>
               <TH>Other Drug Addiction</TH>
           </TR>
           
           <%//}%>
           <TR style="font-weight: bolder">
               <TD> <%= resultset.getString(6) %> </TD>
               <TD> <%= resultset.getString(7) %> </TD>
               <TD> <%= resultset.getString(8) %> </TD>
               <TD> <%= resultset.getString(9) %> </TD>
               <TD> <%= resultset.getString(10) %> </TD>
               <TD> <%= resultset.getString(11) %> </TD>
               <TD> <%= resultset.getString(12) %> </TD>
               <TD> <%= resultset.getString(13) %> </TD>
               <TD> <%= resultset.getString(14) %> </TD>
           </TR>
       
        
       
       
     </TABLE>
     
     <TABLE BORDER="1" class="table">
   <%//if(flag){%>
        <h3>Physical Activity Details</h3>
        
            <TR>
               <TH>Physical Activity Name</TH>
               <TH>Physical Activity Value</TH>
               <TH>Physical Activity Units</TH>
               <TH>Physical Activity Duration</TH>
               <TH>Physical Activity Intensity</TH>
               
           </TR>
           <%//}%>
           <TR style="font-weight: bolder">
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%= resultset.getString(4) %> </TD>
               <TD> <%= resultset.getString(5) %> </TD>
             </TR>
       
        
       
       
     </TABLE>
     <TABLE BORDER="1" class="table">
         <%//if(flag){%>
       <h3>Prescription Details</h3>
        
            <TR>
               <TH>Time</TH>
               <TH>Prescription</TH>
           </TR>
           <%//}%>
           
           <TR style="font-weight: bolder">
               <TD> <%= resultset.getString(15) %> </TD>
               <TD> <%= resultset.getString(16) %> </TD>
           </TR>
       
        
     </TABLE>
       <% 
       
        flag = false;
           }
          // } 
       %>
       
       
       <BR>
    </body>
</html>
