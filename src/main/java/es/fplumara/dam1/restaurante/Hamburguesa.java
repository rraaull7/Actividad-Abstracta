package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable {

	
	private String tipoCarne;
	private List<Extra> extras;
	
	
	public Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) {
		super(id, nombre, precioBase);
		this.tipoCarne = tipoCarne;
		this.extras = new ArrayList<Extra>();
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public Hamburguesa(String id, String nombre, double precioBase) {
		super(id, nombre, precioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	double precioFinal() {
		double precioExtras = 0;
		for (Extra extra : extras) {
			precioExtras += extra.getPrecio();
		}
		
		// TODO Auto-generated method stub
		double precioFinal =this.getPrecioBase() + precioExtras;
	
		return precioFinal;
	}

	@Override
	String ticketLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void añadirExtra(String texto, double numero) {
		this.extras.add(new Extra(texto, numero));	
	}

	
	
	
	
	
}
