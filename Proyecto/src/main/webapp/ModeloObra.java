package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.MySQLConexion;
import entidades.Obra;

public class ModeloObra {
	private static final String SQL_INSERTAROBRA="INSERT INTO OBRA(dniArtista,nombreObra,categoria) VALUES(?,?,?)";
	private static final String SQL_OBTENER="SELECT * FROM OBRA WHERE codObra=?";
	private static final String SQL_UPDATE="UPDATE OBRA SET nombreObra=?,categoria=? WHERE codObra=?";
	
	public int insertarObra(Obra obra)
	{
		int value=0;
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn=MySQLConexion.getConexion();
			stmt=conn.prepareStatement(SQL_INSERTAROBRA);
			stmt.setString(1, obra.getDniArtista());
			stmt.setString(2, obra.getNombreObra());
			stmt.setString(3, obra.getCategoria());						
			value=stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		return value;
		
	}
	
	public Obra obtenerObra(int cdObra) {
		Obra laObra =null;
		Connection miConexion = null;
		PreparedStatement miStatement=null;
		ResultSet miResultSet =null;
		
		try {
			miConexion =MySQLConexion.getConexion();
			miStatement=miConexion.prepareStatement(SQL_OBTENER);
			miStatement.setInt(1, cdObra);
			miResultSet=miStatement.executeQuery();
			if(miResultSet.next()) {
				int codObra =miResultSet.getInt("codObra");
				String nomObra=miResultSet.getString("nombreObra");
				String cate=miResultSet.getString("categoria");
				
				laObra=new Obra(codObra,nomObra,cate);
			}else {
				throw new Exception("No encontramos el codigo de obra "+cdObra);
			}
			
			
		}catch(Exception e) {
			
		}
		return laObra;
	}
	public void actualizarObra(Obra obraActualizada) throws SQLException {
		Connection miConexion=null;
		PreparedStatement miStatement =null;
		
		miConexion =MySQLConexion.getConexion();
		
		miStatement=miConexion.prepareStatement(SQL_UPDATE);
		
		miStatement.setString(1, obraActualizada.getNombreObra());
		miStatement.setString(2, obraActualizada.getCategoria());
		miStatement.setInt(3, obraActualizada.getCodObra());
		
		miStatement.execute();
		
		
	}
}
