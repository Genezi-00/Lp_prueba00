package servlets;

import java.io.IOException;
import java.util.List;

import entidades.Artista;
import entidades.ArtistaObra;
import entidades.Obra;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ModeloArtista;
import modelo.ModeloArtistaObra;
import modelo.ModeloObra;

/**
 * Servlet implementation class ControladorContratoArtistaObra
 */
public class ControladorContratoArtistaObra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ModeloArtista modeloArtista;
    private ModeloArtistaObra modeloArtistaObra;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorContratoArtistaObra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String elComando= request.getParameter("instruccion");
		if(elComando==null) elComando="listar";
		switch(elComando) {
		case "listar":
			ListarArtistaObras(request,response);
			break;
		case "insertarArtistaBBDD":
			agregarArtista(request,response);
			break;
		case "insertarObraBBDD":
			agregarObra(request,response);
			break;
		case "cargar":
			try {
				cargaObra(request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}					
			break;
		case "actualizarObraBBDD":
			try {
				actualizarObra(request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			default:
				ListarArtistaObras(request,response);
		}
		System.out.println("El comando 2 es "+elComando);
			
	}
	/*FALTA ELIMINAR (LO MAS FACIL)/ PODER DARLE VALIDACIONES, SENTIDO E INTERACION A LA INTERFAZ, FUNCIONALIDAD AL 90%*/
	
	
	private void actualizarObra(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nomObra=request.getParameter("nomObra");
		String cate=request.getParameter("cate");
		int codObra=Integer.parseInt(request.getParameter("codObra"));
		
		Obra ObraActualizada=new Obra(codObra,nomObra,cate);
		
		ModeloObra modeloObra=new ModeloObra();
		modeloObra.actualizarObra(ObraActualizada);
		
		ListarArtistaObras(request, response);
	}

	private void cargaObra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codObra=Integer.parseInt(request.getParameter("codObra"));
		
		ModeloObra  modeloObra=new ModeloObra();
		
		Obra laObra=modeloObra.obtenerObra(codObra);
		
		request.setAttribute("ObraActualizar", laObra);
		request.getRequestDispatcher("ActualizarObras.jsp").forward(request, response);
		System.out.println("El codigo de obra es "+codObra);
	}

	private void agregarObra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String dniArtista=request.getParameter("txtDni");
		String nombreObra=request.getParameter("txtObra");
		String categoria=request.getParameter("txtCategoria");*/
			
		for (int i = 1; i <= 5; i++) {
			String dniArtista=request.getParameter("txtDni");
			String nombreObra=request.getParameter("txtObra"+i);
			String categoria=request.getParameter("txtCategoria"+i);
			
			Obra obra=new Obra();
			obra.setDniArtista(dniArtista);
			obra.setNombreObra(nombreObra);
			obra.setCategoria(categoria);
			if(dniArtista!=null && nombreObra!=null && categoria!=null && !dniArtista.isEmpty() && !nombreObra.isEmpty() && !categoria.isEmpty()){
				ModeloObra modeloOb=new ModeloObra();
				modeloOb.insertarObra(obra);
				/*if(value==1) {
					obtenerProductos(request, response);
				}else {
					request.setAttribute("mensaje", "Ocurrio un problema");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}*/
			}
			
		}
				  
		
	}

	//cambiar nombre metodos
	private void agregarArtista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dniArtista=request.getParameter("txtDni");
		String nombreArtista=request.getParameter("txtNombre");
		String apeArtista=request.getParameter("txtApe");
		String sexo=request.getParameter("txtSexo");
		String nombreArtistico=request.getParameter("txtNomArtistico");
		String correo=request.getParameter("txtCorreo");
		String fechaNacimiento=request.getParameter("txtFecNac");
		
		Artista artista=new Artista();
		artista.setDniArtista(dniArtista);
		artista.setNombreArtista(nombreArtista);
		artista.setApeArtista(apeArtista);
		artista.setSexo(sexo);
		artista.setNombreArtistico(nombreArtistico);
		artista.setCorreo(correo);
		artista.setFechaNacimiento(fechaNacimiento);
		
		ModeloArtista modelo=new ModeloArtista();
		int value=modelo.InsertarArtista(artista);
		if(value==1) {
			request.getRequestDispatcher("MensajeConfirmacion.jsp").forward(request, response);
		}else {
			request.setAttribute("mensaje", "Ocurrio un problema");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

	private void ListarArtistaObras(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ArtistaObra> artistaObras=new ModeloArtistaObra().listar();
		//System.out.println("artistas"+artistas);
		request.setAttribute("artistaObras", artistaObras);
		request.getRequestDispatcher("ListarArtistaObras.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
