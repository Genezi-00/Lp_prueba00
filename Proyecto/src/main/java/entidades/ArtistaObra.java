package entidades;

public class ArtistaObra {
	private String dniArtista;
	private String nombreArtistico;
	private String nombreObra;
	private String codObra;
	private String categoria;
	private String estado;
	
	
	public ArtistaObra() {
		
	}
	
	public ArtistaObra(String dniArtista, String nombreArtistico,String codObra, String nombreObra, String categoria,
			String estado) {
		super();
		this.dniArtista = dniArtista;
		this.nombreArtistico = nombreArtistico;
		this.codObra=codObra;
		this.nombreObra = nombreObra;
		this.categoria = categoria;
		this.estado = estado;
	}

	public String getCodObra() {
		return codObra;
	}

	public void setCodObra(String codObra) {
		this.codObra = codObra;
	}

	public String getDniArtista() {
		return dniArtista;
	}

	public void setDniArtista(String dniArtista) {
		this.dniArtista = dniArtista;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public String getNombreObra() {
		return nombreObra;
	}

	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
