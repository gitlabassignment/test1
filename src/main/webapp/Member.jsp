<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 Member Information
 
<form action="MemberBookingController">
Member Id : <input type=text name=mid><br>
Member Name: <input type=text name=mname><br>
Member contact <input type=text name=mcontact ><br>
Booking id: <input type=text name=bid ><br>
<br>
<input type=text name="param" value="member"> 

<br>
<input type=submit name=bmi  value="member add">


 
</form>
</body>
</html>