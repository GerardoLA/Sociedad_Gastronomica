package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GrupoModelo extends Conector{
	
	public boolean crearGrupo(Grupo grupo) {
		PreparedStatement pst;
		
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

}
