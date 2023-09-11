package entidades;

public class Obra {
	private String dniArtista;
	private int codObra;
	private String nombreObra;
	private String categoria;
	private String estado;
	
	
	public Obra() {
		
	}
	
	public Obra(int codObra, String nombreObra, String categoria) {
		super();
		this.codObra = codObra;
		this.nombreObra = nombreObra;
		this.categoria = categoria;
	}
	
	public Obra(String dniArtista, String nombreObra, String categoria) {
		super();
		this.dniArtista = dniArtista;
		this.nombreObra = nombreObra;
		this.categoria = categoria;
	}
	
	public Obra(String dniArtista, int codObra, String nombreObra, String categoria, String estado) {
		super();
		this.dniArtista = dniArtista;
		this.codObra = codObra;
		this.nombreObra = nombreObra;
		this.categoria = categoria;
		this.estado = estado;
	}

	public String getDniArtista() {
		return dniArtista;
	}

	public void setDniArtista(String dniArtista) {
		this.dniArtista = dniArtista;
	}

	public int getCodObra() {
		return codObra;
	}

	public void setCodObra(int codObra) {
		this.codObra = codObra;
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
