package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoModelo extends Conector{

	PreparedStatement pst;
	public boolean crearProducto(Producto producto) {
		
		try {
			pst = getConexion().prepareStatement("INSERT INTO productos(id,nombre,precio,id_grupo)VALUES(?,?,?,?)");
			pst.setInt(1, producto.getId());
			pst.setString(2, producto.getNombre());
			pst.setDouble(3, producto.getPrecio());
			pst.setInt(4, producto.getId());
			pst.execute();
			getConexion().close();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;

		}
	}
	
	public boolean eliminarProducto(int id) {
		try {
			pst = getConexion().prepareStatement("Delete from productos where id = ?");
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
	
	public boolean modificarProducto(Producto producto) {
		try {
			pst = getConexion().prepareStatement("UPDATE productos SET nombre=?,precio=?,id_grupo=? WHERE id=?");
			pst.setString(1, producto.getNombre());
			pst.setDouble(1, producto.getPrecio());
			pst.setInt(3, producto.getId_grupo());
			pst.execute();
			
			getConexion().close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Producto>getProductos(){
		ArrayList<Producto>productos = new ArrayList<>();
		try {
			pst = getConexion().prepareStatement("SELECT * FROM productos");
			
			ResultSet resultado = pst.executeQuery();
			while (resultado.next()) {
				Producto producto = new Producto();
				producto.setId(resultado.getInt("id"));
				producto.setNombre(resultado.getString("nombre"));
				producto.setPrecio(resultado.getDouble("precio"));
				producto.setId_grupo(resultado.getInt("id_grupo"));
				
				productos.add(producto);
			}
			getConexion().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productos;
	}
	
	public ArrayList<Producto>getProductosPorGrupos(int id_grupo){
		
		ArrayList<Producto>productos = new ArrayList<>();
		
		try {
			pst.getConnection().prepareStatement("SELECT * FROM productos where id_grupo=?");
			pst.setInt(1, id_grupo);
			ResultSet resultado = pst.executeQuery();
			while(resultado.next()) {
				Producto producto = new Producto();
				producto.setId(resultado.getInt("id"));
				producto.setNombre(resultado.getString("nombre"));
				producto.setPrecio(resultado.getDouble("precio"));
				producto.setId_grupo(resultado.getInt("id_grupo"));
				productos.add(producto);
			}
			
			getConexion().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productos;
	}
	
}
