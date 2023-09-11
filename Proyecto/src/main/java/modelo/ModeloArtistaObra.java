package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.ArtistaObra;
import util.MySQLConexion;

public class ModeloArtistaObra {
	private static final String SQL_SELECT="SELECT a.dniArtista,a.nombreArtistico,o.codObra,o.nombreObra, o.categoria,o.estado FROM ARTISTA A LEFT JOIN OBRA O ON A.DNIARTISTA=O.DNIARTISTA";
	
	
	
	public List<ArtistaObra> listar(){
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		List<ArtistaObra> artistaObras=new ArrayList<ArtistaObra>();
		
		try {
			conn=MySQLConexion.getConexion();
			stmt=conn.prepareStatement(SQL_SELECT);
			rs=stmt.executeQuery();
			while(rs.next()) {
				String dniArtista=rs.getString("dniArtista");
				String nombreArtistico=rs.getString("nombreArtistico");	
				String codObra=rs.getString("codObra");
				String obra=rs.getString("nombreObra");
				String categoria=rs.getString("categoria");
				String estado=rs.getString("estado");
				
				artistaObras.add(new ArtistaObra(dniArtista,
						nombreArtistico,codObra,obra, categoria,estado));
				
							
			}
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		return artistaObras;
	}
	
	public String prueba1(String string) {
		return string+" 25";
		
	}
	
	
	
	
	
}
