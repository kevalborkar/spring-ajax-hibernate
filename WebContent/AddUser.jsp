<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="jquery.js" type="text/javascript"></script>
<title>Add User </title>
</head>
<body>
	<script type="text/javascript">

	function doAjaxPost(){
	var name = $('#name').val();
	var age = $('#age').val();
	var city = $('#city').val();

	$.ajax({
	type:"POST",
	url:"AddUser.jsp",
	data: "name = "+" age= "+" city= ",
	success: function(response){
		$('result').html(response);
		$('#name').val(),
		$('#age').val(),
		$('#city').val(),
		alert("Record Added");
		},
		
	error: function (e) {
		alert("Error:"+ e)
	}
		
	});
	}
	</script>

	<fieldset>
	<legend>Add a user</legend>
	<table>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" id="name" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age" id="age"/></td>
		</tr>
		<tr>
			<td>City</td>
			<td><input type="text" name="city" id="city"/></td>
		</tr>
		<tr>
			<td></td>
			<td>${msg}</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="Add User" onclick="doAjaxPost()" /></td>
		</tr>
		<tr>
		<td colspan="2">
			<div id="result"></div>
		</td>
		</tr>
	</table>
		<a href="index.jsp">Show All Users</a>
	</fieldset>
</body>
</html>