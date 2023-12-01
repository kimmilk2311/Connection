<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.java.be.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<title>Insert title here</title>
</head>
<body >

<form class="container">
<h2>Order Confirmation</h2>
<%
		User user = (User) session.getAttribute("user"); 
		%>
<p>
  ${user.firstName}<br>		
  ${user.lastName}<br>
  ${user.sex}<br>
  ${user.poB}<br>
  ${user.doB}<br>
</p>
<div>
   <input type="button" class="btn btn-primary" value="Edit" onclick="location.href='edit.jsp'">
 </div>
</form>
</body>
</html>