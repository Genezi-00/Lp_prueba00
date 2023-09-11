<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous" />
</head>
<body class="d-flex justify-content-center align-items-center vh-100" 
	style="background: linear-gradient(to right, #F97794, #623AA2);"> <!-- VER VH-100 -->
	<div class="bg-white p-5 rounded-5 text-secondary shadow"
		style="width: 25rem">
		<h3>Desea Ingresar Obras al Sistema</h3>
		<div class="d-grid gap-2">		
			<a href="RegistroObras.jsp" class="btn btn-success" id="boton">Si</a>
		</div>
		<br>
		<div class="d-grid gap-2">		
			<a href="#" class="btn btn-success" id="boton">No</a>
		</div>
		
		<br>
		<p>Recuerde que solo tiene un limite de 5 Obras<p>
	</div>
	
</body>
</html>