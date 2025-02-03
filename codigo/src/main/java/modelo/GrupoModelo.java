package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GrupoModelo extends Conector{
	PreparedStatement pst;
	public boolean crearGrupo(Grupo grupo) {
		
		
		try {
			pst = getConexion().prepareStatement("INSERT INTO  grupos(id,nombre)VALUES(?,?)");
			pst.setInt(1, grupo.getId());
			pst.setString(1, grupo.getNombre());
			pst.execute();
			getConexion().close();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
		
	}
	
	public boolean eliminarGrupo(int id) {
		try {
			pst = getConexion().prepareStatement("Delete from grupos where id = ?");
			pst.setInt(1, id);
			
			pst.execute();
			getConexion().close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean modificarGrupo(Grupo grupo) {
		
		try {
			pst = getConexion().prepareStatement("UPDATE grupos SET nombre=? WHERE id=?");
			pst.setString(1, grupo.getNombre());
			
			pst.execute();
			getConexion().close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
		
	}

}
