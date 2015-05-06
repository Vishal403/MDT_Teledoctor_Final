<%-- 
    Document   : index.jsp
    Author     : Kaushal Kulkarni
    Function   : This file accepts the user's input ie the input string and method for hashing 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Tele Medicine</title>
    </head>
<body style="background:URL(img/banner_img01.jpg); background-repeat: no-repeat; background-size: 100% 100%;">
            <h1 align="center">Welcome to Tele Medicine</h1>
        <h3>Please enter the mandatory information:</h3>
        <form class="form-horizontal" action="getHashValue " method="GET">
            
            <div class="control-group">
                <label class="control-label" for="paname">Physical Activity Name</label>
                <div class="controls">
                    <input type="text" name="paname" placeholder="First Name" value="<%= request.getAttribute("PA_Name")%>">
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="PA_Value">PA_Value</label>
                <div class="controls">
                    <input type="text" name="PA_Value" placeholder="PA_Value" value="<%= request.getAttribute("PA_Value")%>">
                </div>
            </div>
                
             <div class="control-group">
                <label class="control-label" for="PA_Units">PA_Units</label>
                <div class="controls">
                    <input type="text" name="PA_Units" placeholder="First Name" value="<%= request.getAttribute("PA_Units")%>">
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="PA_Duration">PA_Duration</label>
                <div class="controls">
                    <input type="text" name="PA_Duration" placeholder="PA_Duration"  value="<%= request.getAttribute("PA_Duration")%>">
                </div>
            </div>    
                
             <div class="control-group">
                <label class="control-label" for="PA_Intensity">PA_Intensity</label>
                <div class="controls">
                    <input type="text" name="PA_Intensity" placeholder="First Name" value="<%= request.getAttribute("PA_Intensity")%>">
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="Blood_Group">Blood_Group</label>
                <div class="controls">
                    <input type="text" name="Blood_Group" placeholder="Blood_Group" value="<%= request.getAttribute("Blood_Group")%>">
                </div>
            </div>    
                
             <div class="control-group">
                <label class="control-label" for="Body_Weight">Body_Weight</label>
                <div class="controls">
                    <input type="text" name="Body_Weight" placeholder="Body_Weight" value="<%= request.getAttribute("Body_Weight")%>">
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="Body_Height">Body_Height</label>
                <div class="controls">
                    <input type="text" name="Body_Height" placeholder="Body_Height" value="<%= request.getAttribute("Body_Weight")%>">
                </div>
            </div>    
                
            <div class="control-group">
                <label class="control-label" for="Heart_Rate">Heart_Rate</label>
                <div class="controls">
                    <input type="text" name="Heart_Rate" placeholder="Heart_Rate" value="<%= request.getAttribute("Heart_Rate")%>">
                </div>
            </div>    
                
            <div class="control-group">
                <label class="control-label" for="Avg_Sleep_Duration">Avg_Sleep_Duration</label>
                <div class="controls">
                    <input type="text" name="Avg_Sleep_Duration" placeholder="Avg_Sleep_Duration" value="<%= request.getAttribute("Avg_Sleep_Duration")%>">
                </div>
            </div>    
                
            <div class="control-group">
                <label class="control-label" for="IsSmoker">IsSmoker</label>
                <div class="controls">
                    <input type="text" name="IsSmoker" placeholder="IsSmoker" value="<%= request.getAttribute("IsSmoker")%>">
                </div>
            </div>    
                
              <div class="control-group">
                <label class="control-label" for="IsAlcoholic">IsAlcoholic</label>
                <div class="controls">
                    <input type="text" name="IsAlcoholic" placeholder="IsAlcoholic" value="<%= request.getAttribute("IsAlcoholic")%>">
                </div>
            </div>       
                
              <div class="control-group">
                <label class="control-label" for="OtherDrugAddiction">OtherDrugAddiction</label>
                <div class="controls">
                    <input type="text" name="OtherDrugAddiction" placeholder="OtherDrugAddiction" value="<%= request.getAttribute("OtherDrugAddiction")%>">
                </div>
            </div>       
               
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>
                <div class="controls">
                    <input type="text" name="inputEmail" placeholder="Email" value="<%= request.getAttribute("pemail")%>">
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="symptoms">Symptoms</label>
                <div class="controls">
                    <input type="checkbox" value="a" name="fever"> Fever		  
                    <input type="checkbox" value="b" name="cold"> Cold		
                    <input type="checkbox" value="c" name="cough" id=i> Cough
                    <br>
                    <input type="checkbox" value="a" name="stomach upset"> Stomach Upset		  
                    <input type="checkbox" value="b" name="stress"> Stress		
                    <input type="checkbox" value="c" name="high_sugar" id=i> High Sugar
                </div>
            </div>
            
            <div class="control-group">
                <label class="control-label" for="bt">Body Temperature</label>
                <div class="controls">
                    <input type="text" name="bt" placeholder="Body Temperature">
                </div>
            </div>
            
              <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">Call</button>
                </div>
            </div
        </form>
        
    </body>
</html>
