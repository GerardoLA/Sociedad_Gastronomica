package modelo;

public class Factura {
	
	private int id;
	private int id_reserva;
	private int id_producto;
	private int unidades;
	private double total;
	
	public Factura() {
		super();
	}
	
	public Factura(int id, int id_reserva, int id_producto, int unidades, double total) {
		super();
		this.id = id;
		this.id_reserva = id_reserva;
		this.id_producto = id_producto;
		this.unidades = unidades;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Factura [id=" + id + ", id_reserva=" + id_reserva + ", id_producto=" + id_producto + ", unidades="
				+ unidades + ", total=" + total + "]";
	}
	
	
	

}
