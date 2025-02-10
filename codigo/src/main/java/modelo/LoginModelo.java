package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModelo extends Conector{
	PreparedStatement pst;
	public Usuario getPassword(String password) {
		Usuario usuario = new Usuario();
		try {
			pst = getConexion().prepareStatement("SELECT * from usuarios where password=?");
			pst.setString(1, password);
			ResultSet rs = pst.executeQuery();
			rs.next();
			usuario.setNombre(rs.getString("nombre"));
			usuario.setApellidos(rs.getString("apellidos"));
			usuario.setDireccion(rs.getString("direccion"));
			usuario.setTfno(rs.getString("tfno"));
			usuario.setPassword(rs.getString("password"));
			usuario.setId_rol(rs.getInt("id_rol"));
			getConexion().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuario;
		
	}
	
	
}
