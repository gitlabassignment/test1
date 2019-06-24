<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 Member car Information
 
<form action="MemberBookingController">
booking id: <input type=text name=bid><br>
carName : <input type=text name=cname><br>
bookingPrice: <input type=text name=bprice><br>
carSeats <input type=text name=cseat ><br>
pickupDate: <input type=text name=cpdate ><br>
returnDate: <input type=text name=crdate ><br>
<br>
<input type=text name="param" value="car"> 

<br>
<input type=submit name=bmi  value="Add car">


 
</form>
</body>
</html>