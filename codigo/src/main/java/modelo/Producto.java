package modelo;

public class Producto {
	
	private int id;
	private String nombre;
	private double precio;
	private int id_grupo;
	
	public Producto() {
		super();
	}
	
	public Producto(int id, String nombre, double precio, int id_grupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.id_grupo = id_grupo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getId_grupo() {
		return id_grupo;
	}
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", id_grupo=" + id_grupo + "]";
	}
	
	
	
	

}
