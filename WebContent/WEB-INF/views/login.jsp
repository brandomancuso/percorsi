<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login here</title>
		<meta charset="ISO-8859-1">
	 <link rel="stylesheet" href="<c:url value="/resources/static/attivita.css" />">
	</head>
	<body>
	<% if(session.getAttribute("user") == null) { %>
	<h1>ACCEDI</h1>
	${loginMsg}
	<div class="main">
		<form action= "./login"  method="post" onSubmit = "return validateFields()">
			<h3>Log in: </h3><br>
			<label>Email: <input id="email_field" name="email" type="email" placeholder="user@domain.it"></label><br><br>
			<label>Password: <input id = "password_field" name="password" type="password"></label><br>
			<br>
			<button type ="submit"><span> Accedi</span></button> <button type ="reset"><span>Cancella</span></button>
		</form>	
	</div>
	<%} else { %>
	${loginMsg}
	<%} %>
	</body>
	
	<script type="text/javascript">
		function validateFields() {
			let ret = false;
			let email = document.getElementById("email_field");
			let password = document.getElementById("password_field");
			if(email.value == ""){
				alert("Email cannot be empty.");
			}
			if(password.value == ""){
				alert("Password cannot be empty.");
			}
			if(email.value && password.value){
				ret = true;
			}
			return ret;
		}
	</script>

</html>