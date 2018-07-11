<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Untitled Event</title>
</head>
<body>
	<h2>Welcome to the event</h2>
	<h4>Following List will be attending the event </h4>
	<ul>
		<c:foreach items="${dtofromUsrList}" var="dtofromUsr">
		<li>Name: <c:out value="${dtofromUsr.name}"/></li>
		<li>Age: <c:out value="${dtofromUsr.age}"/></li>
		<li>City: <c:out value="${dtofromUsr.city}"/></li><br />
		</c:foreach>
	</ul>
	
	<a href="AddUser.jsp" onclick="">Want to come?</a>
</body>
</html>