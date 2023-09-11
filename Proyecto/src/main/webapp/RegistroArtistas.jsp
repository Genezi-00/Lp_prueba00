<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<link rel="icon" type="image/x-icon" href="/assets/logo-vt.svg" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Bootstrap Login Page</title>
<link rel="stylesheet" href="./style/AnimacionRegistro.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous" />
<script src="https://kit.fontawesome.com/f14b0643a7.js"
	crossorigin="anonymous"></script>
</head>

<body class="d-flex justify-content-center align-items-center vh-100"
	style="background: linear-gradient(to right, #F97794, #623AA2);">

	<div class="bg-white p-5 rounded-5 text-secondary shadow"
		style="width: 25rem">
		<form id="myForm" method="post" action="ControladorContratoArtistaObra">
			<input type="hidden" name="instruccion" value="insertarArtistaBBDD">
			<div class="d-flex justify-content-center">
				<i class="fa-sharp fa-solid fa-user-tie fa-5x"></i>
			</div>
			<div class="text-center fs-1 fw-bold mb-3">Registrarse</div>
			<div class="input-group mb-3">
				<div class="input-group-text inputGroup-sizing-sm">
					<i class="fa-solid fa-id-card fa-sm"></i>
				</div>
				<input type="text" class="form-control" placeholder="Ingresar Dni"
					minlength="8" maxlength="8" pattern="[0-9]{8}" autofocus
					name="txtDni" required />
			</div>
			<div class="input-group mb-3">
				<div class="input-group-text inputGroup-sizing-sm">
					<i class="fa-solid fa-user fa-sm"></i>
				</div>
				<input type="text" class="form-control"
					placeholder="Ingresar Nombres" pattern="[a-zA-ZáéíóúÁÉÍÓÚ ]{2,48}"
					autofocus name="txtNombre" required />
			</div>
			<div class="input-group mb-3">
				<div class="input-group-text">
					<i class="fa-solid fa-user"></i>
				</div>
				<input type="text" class="form-control"
					placeholder="Ingresar Apellidos"
					pattern="[a-zA-ZáéíóúÁÉÍÓÚ ]{2,48}" autofocus name="txtApe"
					required />
			</div>


			<div class="input-group mb-3">
				<div class="input-group-text">
					<i class="fa-brands fa-phoenix-framework"></i>
				</div>
				<input type="text" class="form-control"
					placeholder="Ingresar Nombre Artistico"
					pattern="[a-zA-ZáéíóúÁÉÍÓÚ ]{2,48}" autofocus
					name="txtNomArtistico" required />
			</div>
			<div class="input-group mb-3">
				<select class="form-select" aria-label="Selecccionar Sexo"
					name="txtSexo" required>
					<option selected value="Masculino">Masculino</option>
					<option value="Femenino">Femenino</option>
				</select>
			</div>
			<div class="input-group mb-3">
				<div class="input-group-text">
					<i class="fa-solid fa-envelope-circle-check"></i>
				</div>
				<input type="email" class="form-control"
					placeholder="Correo electronico" autofocus name="txtCorreo"
					required />
			</div>

			<div class="input-group mb-3">
				<div class="input-group-text ">
					<i class="fa-solid fa-calendar-days"></i>
				</div>
				<input type="date" class="form-control" autofocus name="txtFecNac"
					required />
			</div>
			<div class="d-grid gap-2">
				<input type="submit" value="Guardar" class="btn btn-sucess"id="boton"> 
				<a href="#" class="btn btn-success" id="boton">Regresar</a>
			</div>
		</form>

	</div>


</body>
</html>