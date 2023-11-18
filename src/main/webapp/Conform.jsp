<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body >
<%@ page import="com.java.be.User" %>
<form class="container">
<%
   
%>
<h2>Order Confirmation</h2>
<p>
  ${user.firstName} 
  ${user.lastName}
  ${user.sex}
  ${user.poB}
</p>

</form>
</body>
</html>