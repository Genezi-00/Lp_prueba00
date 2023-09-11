<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="form1" method="get" action="ControladorContratoArtistaObra">
		<input type="hidden" name="instruccion" value="actualizarObraBBDD">
		<input type="hidden" name="codObra" value="${ObraActualizar.codObra}">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="card">
						<div class="modal-body">
							<div class="form-group">
								<label>Nombre Obra</label>
								<input type="text" name="nomObra" id="nomObra" value="${ ObraActualizar.nombreObra}">
							</div>
							<div class="form-group">
								<label>Categoria</label>
								<input type="text" name="" id="" value="${ ObraActualizar.categoria}" readonly>
							</div>
							<div class="form-group">
								<select class="form-select" aria-label="Default select example"
								name="cate" required >
								<option value="Arte Contemporaneo">Arte Contemporaneo</option>
								<option value="Fotografia">Fotografía</option>
								<option value="Pintura antigua">Pintura antigua</option>
								<option value="Precolombino">Precolombino</option>
								</select>
							</div>
							<div class="form-group">
								<input type="submit" name="envio" id="envio" value="Enviar">
							</div>
							<div class="form-group">
								<input type="reset" name="borrar" id="borrar" value="Restablecer">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	
	
	
	</form>
</body>
</html>