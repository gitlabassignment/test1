<%@page import="com.org.model.BodyMassIndexVO"%>
 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h1> Patient Details</h1> <br>
<% BodyMassIndexVO BMI= (BodyMassIndexVO)request.getAttribute("BMI"); 
 Double  calculatedBMI=(Double)request.getAttribute("calculateBMI");
  
     out.println(BMI.getPatientName()+":"+BMI.getPatientContact()+":"+BMI.getWeight()+BMI.getHeight()+"<br>");
   out.println("Body Mass Index:"+calculatedBMI);

   
    %>
 
</body>
</html>