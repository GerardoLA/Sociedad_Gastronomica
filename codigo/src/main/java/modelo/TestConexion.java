package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost/sociedadgastronomica";
	        String user = "root";
	        String password = "";

	        try {
	            Connection con = DriverManager.getConnection(url, user, password);
	            if (con != null) {
	                System.out.println("✅ Conexión exitosa a la base de datos.");
	                con.close();
	            }
	        } catch (SQLException e) {
	            System.err.println("❌ No se pudo conectar a la base de datos.");
	            e.printStackTrace();
	        }
	    }
}
