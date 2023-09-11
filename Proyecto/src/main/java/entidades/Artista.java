package entidades;

public class Artista {
	private int idArtista;
	private String dniArtista;
	private String nombreArtista;
	private String apeArtista;
	private String sexo;
	private String nombreArtistico;
	private String correo;
	private String fechaNacimiento;
	
	public Artista(int idArtista) {
		this.idArtista=idArtista;
	}
	
	public Artista() {
		
	}
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Artista(int idArtista, String dniArtista, String nombreArtista, String apeArtista, String sexo,
			String nombreArtistico, String correo, String fechaNacimiento) {
		super();
		this.idArtista = idArtista;
		this.dniArtista = dniArtista;
		this.nombreArtista = nombreArtista;
		this.apeArtista = apeArtista;
		this.sexo = sexo;
		this.nombreArtistico = nombreArtistico;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
	}

	//CONSTRUCTOR SIN IDARTISTA, USADO PARA INSERTAR ARTISTA
	public Artista(String dniArtista, String nombreArtista, String apeArtista, String sexo,
			String nombreArtistico,String correo, String fechaNacimiento) {
		this.dniArtista = dniArtista;
		this.nombreArtista = nombreArtista;
		this.apeArtista = apeArtista;
		this.sexo = sexo;
		this.nombreArtistico = nombreArtistico;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}

	public String getDniArtista() {
		return dniArtista;
	}

	public void setDniArtista(String dniArtista) {
		this.dniArtista = dniArtista;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getApeArtista() {
		return apeArtista;
	}

	public void setApeArtista(String apeArtista) {
		this.apeArtista = apeArtista;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	

}
