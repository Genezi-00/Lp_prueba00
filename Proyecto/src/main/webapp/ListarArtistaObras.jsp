<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="entidades.ArtistaObra"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
List<ArtistaObra> listaArtistaObras=(List<ArtistaObra>) request.getAttribute("artistaObras");

%>
</head>
<body>
	<div class="container my-3">
            <div class="row">
            	<div class="col-sm-12 col-md-8 col-lg-8 col-xl-8 py-8">
            		<table class="table table-dark table-sm">
						<tr>
							<td>Dni Artista</td>
							<td>Nombre Artistico</td>
							<td>Codigo Obra</td>
							<td>Nombre Obra</td>
							<td>Categoria</td>
							<td>Estado</td>
							<td>ACCION</td>
						</tr>
							<% for(ArtistaObra temArtista: listaArtistaObras){ %>
						<tr>
							<td><%=temArtista.getDniArtista() %></td>
							<td><%=temArtista.getNombreArtistico() %></td>
							<td><%=temArtista.getCodObra() %></td>
							<td><%=temArtista.getNombreObra() %></td>
							<td><%=temArtista.getCategoria() %></td>
							<td><%= temArtista.getEstado()%></td>
							<td><a href="ControladorContratoArtistaObra?instruccion=cargar&codObra=<%=temArtista.getCodObra()%>">Actualizar</a></td>
		
						</tr>		
							<%} %>
					</table>	
            	</div>          
          	</div>
    </div>
		
		
		
	
</body>
</html>