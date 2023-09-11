package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Artista;
import modelo.ModeloArtista;
import util.MySQLConexion;

public class ModeloArtista {
	
private static final String SQL_SELECT="SELECT *FROM ARTISTA";
//LUEGO VER SIN CAMBIAR
private static final String SQL_INSERTARTISTA="INSERT INTO ARTISTA(dniArtista,nombreArtista,apeArtista,sexo,nombreArtistico,correo,fechaNacimiento)VALUES(?,?,?,?,?,?,?)";

	
	public List<Artista> listar(){
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		List<Artista> artistas=new ArrayList<Artista>();
		
		try {
			conn=MySQLConexion.getConexion();
			stmt=conn.prepareStatement(SQL_SELECT);
			rs=stmt.executeQuery();
			while(rs.next()) {
				int idArtista=rs.getInt("idArtista");
				String dniArtista=rs.getString("dniArtista");
				String nombreArtista=rs.getString("nombreArtista");
				String apeArtista=rs.getString("apeArtista");
				String sexo=rs.getString("sexo");
				String nombreArtistico=rs.getString("nombreArtistico");												
				String correo=rs.getString("correo");
				String fechaNacimiento=rs.getString("fechaNacimiento");
				
				artistas.add(new Artista(idArtista,dniArtista,nombreArtista,apeArtista,sexo,
						nombreArtistico,correo, fechaNacimiento));
				
				System.out.println(nombreArtista+" "+apeArtista+" "+correo);				
			}
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		return artistas;
	}
	public static void main(String[] args) {
		ModeloArtista artista=new ModeloArtista();
		artista.listar();
	}
	
	public int InsertarArtista(Artista artista ) {
		int value=0;
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {
			conn=MySQLConexion.getConexion();
			stmt=conn.prepareStatement(SQL_INSERTARTISTA);
			stmt.setString(1, artista.getDniArtista());
			stmt.setString(2, artista.getNombreArtista());
			stmt.setString(3, artista.getApeArtista());
			stmt.setString(4, artista.getSexo());			
			stmt.setString(5, artista.getNombreArtistico());	
			stmt.setString(6, artista.getCorreo());
			stmt.setString(7, artista.getFechaNacimiento());
			
			value=stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		return value;
	}
	
	public int InsertarObra() {
		return 0;
		}
	
	}
	

