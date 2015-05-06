<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>

<HTML>
    <HEAD>
        <TITLE>EMR</TITLE>
    </HEAD>

    <BODY>
        <H1>EMR</H1>
        <FORM ACTION="test_mysql.jsp" METHOD="POST">
            Please enter the ID of the patient you want to find:
            <BR>
            <INPUT TYPE="TEXT" NAME="id">
            <BR>
            <INPUT TYPE="SUBMIT" value="Submit">
        </FORM>
        
        


        <H1>Patients EMR</H1>

        <% 
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
        %>

        <TABLE BORDER="1">
            <TR>
               <TH>Name</TH>
               <TH>Value</TH>
               <TH>Physical Activity Units</TH>
               <TH>Physical Activity Duration</TH>
               <TH>Physical Activity Intensity</TH>
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
           <TR>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%= resultset.getString(4) %> </TD>
               <TD> <%= resultset.getString(5) %> </TD>
               <TD> <%= resultset.getString(6) %> </TD>
               <TD> <%= resultset.getString(7) %> </TD>
               <TD> <%= resultset.getString(8) %> </TD>
               <TD> <%= resultset.getString(9) %> </TD>
               <TD> <%= resultset.getString(10) %> </TD>
               <TD> <%= resultset.getString(11) %> </TD>
               <TD> <%= resultset.getString(12) %> </TD>
               <TD> <%= resultset.getString(13) %> </TD>
               <TD> <%= resultset.getString(14) %> </TD>
               <TD> <%= resultset.getString(15) %> </TD>
               <TD> <%= resultset.getString(16) %> </TD>
           </TR>
       </TABLE>
       <BR>
       
       <FORM ACTION="test_mysql.jsp" METHOD="POST">
            Please enter the ID of the patient you want to find:
            <BR>
            <INPUT TYPE="TEXT" NAME="prescription">
            <BR>
            <INPUT TYPE="SUBMIT" value="Submit">
        </FORM>
       
       <% 
           } 
       %>
    </BODY>
</HTML>