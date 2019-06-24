<%@page import="com.org.model.MemberVO"%>
 
 
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
 
<h1> List Of Member booking  Details</h1> <br>
<% List<MemberVO> memberLsit= (List<MemberVO>)request.getAttribute("memberList"); %>
 
<% for (MemberVO  member : memberLsit)
{
   
     out.println(member.getBookingId()+":"+member.getMembeName()+":"+member.getBookingId()+"<br>");
   
}
   
    %>
 
</body>
</html>