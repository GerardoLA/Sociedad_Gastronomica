package modelo;

public class Rol {
	
	private int id;
	private String nombre;
	private int id_usuario;
	
	public Rol() {
		super();
	}

	public Rol(int id, String nombre, int id_usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.id_usuario = id_usuario;
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

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombre=" + nombre + ", id_usuario=" + id_usuario + "]";
	}
	
	
	
	

}
