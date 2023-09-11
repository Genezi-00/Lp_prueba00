<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous" />
<title>Insert title here</title>
</head>
<body style="background: linear-gradient(to right, #F97794, #623AA2);">
	<div class="container my-3">
		<div class="row">
			<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4 py-4">
				<div class=" bg-white p-5 rounded-5 text-secondary shadow"
					style="width: 33rem">
					<form>
						<div class="form-group row">
							<label class="col-sm-4 col-form-label">Cantidad Obras:</label>
							<div class="col-sm-4">
								<select class="form-select" name="opciones">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
							</div>
							<br>
							<div class="col-sm-2">
								<input class="btn btn-secondary" type="submit" value="Enviar">
							</div>
						</div>
					</form>
					<form method="post" action="ControladorContratoArtistaObra">
					<input type="hidden" name="instruccion" value="insertarObraBBDD">
						<br>
						<div class="mb-3">
							<label class="form-label">Colocar su DNI</label> <input required
								class="form-control" type="text" name="txtDni" id="dni"
								placeholder="DNI">
						</div>
						<%
						int campos = 1;
						String opciones = request.getParameter("opciones");
						if (opciones != null && !opciones.isEmpty()) {
							campos = Integer.parseInt(opciones);
						}
						for (int i = 1; i <= campos; i++) {
						%>

						<div class="mb-1">
							<label class="form-label">Obra <%=i%>:
							</label> <input required class="form-control" type="text"
								name="txtObra<%=i%>" placeholder="Nombre Obra <%=i%>">
						</div>
						<div class="mb-4">
							<select class="form-select" aria-label="Default select example"
								name="txtCategoria<%=i%>" required>
								<option value="Arte Contemporaneo">Arte Contemporaneo</option>
								<option value="Fotografia">Fotografía</option>
								<option value="Pintura antigua">Pintura antigua</option>
								<option value="Precolombino">Precolombino</option>
							</select>
						</div>

						<%
						}
						%>
						<div class="d-grid gap-2">
							<input type="submit" value="Guardar" class="btn btn-success">
							<a href="#" class="btn btn-success">Regresar</a>
						</div>
					</form>
				</div>
			</div>
		</div>
</body>
</html>