package es.fplumara.dam1.restaurante;

public abstract class ProductoMenu {

	
	
private String id;
private String nombre;
private double precioBase;





public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecioBase() {
	return precioBase;
}
public void setPrecioBase(double precioBase) {
	this.precioBase = precioBase;
}
public ProductoMenu(String id, String nombre, double precioBase) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.precioBase = precioBase;
}

abstract double precioFinal();
abstract String ticketLine();
	
	
}
