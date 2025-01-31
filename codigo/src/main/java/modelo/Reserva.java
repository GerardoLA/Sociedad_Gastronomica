package modelo;

import java.util.Date;

public class Reserva {
	
	private int id;
	private int id_usuario;
	private Date fecha;
	
	public Reserva() {
		super();
	}
	
	public Reserva(int id, int id_usuario, Date fecha) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", id_usuario=" + id_usuario + ", fecha=" + fecha + "]";
	}

	
}
