package modelo;

import java.sql.Connection;
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
	public Usuario getUsuarioPorId(int id) {
	    Usuario usuario = null;
	    PreparedStatement pst = null;
	    ResultSet rs = null;
	    Connection con = getConexion(); // Obtener la conexión

	    if (con == null) {
	        System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
	        return null;
	    }

	    try {
	        pst = con.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
	        pst.setInt(1, id);
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            usuario = new Usuario();
	            usuario.setId(rs.getInt("id"));
	            usuario.setNombre(rs.getString("nombre"));
	            usuario.setApellidos(rs.getString("apellidos"));
	            usuario.setDireccion(rs.getString("direccion"));
	            usuario.setTfno(rs.getString("tfno"));
	            usuario.setPassword(rs.getString("password"));
	            usuario.setId_rol(rs.getInt("id_rol"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return usuario;
	}

}
