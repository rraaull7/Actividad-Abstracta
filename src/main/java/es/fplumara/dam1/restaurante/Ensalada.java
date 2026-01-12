package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara {

	private String tamano;
	private List<Extra> extras;
	
	public Ensalada(String id, String nombre, double precioBase, String tamano) {
		super(id, nombre, precioBase);
		this.tamano = tamano;
		this.extras = new ArrayList<>();
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Ensalada(String id, String nombre, double precioBase) {
		super(id, nombre, precioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esApto(String restriccion) {
		if (restriccion.equalsIgnoreCase("Vegetariano")) {
			return true;
		}
			if (restriccion.equalsIgnoreCase("Vegano") && this.extras.isEmpty()) {
				return true;
			
		}
		
		return false;
	}

	@Override
	public void añadirExtra(String texto, double numero) {
		this.extras.add(new Extra(texto, numero));	

		// TODO Auto-generated method stub
		
	}

	@Override
	double precioFinal() {
		double precioFinal =this.getPrecioBase();
		if (tamano.equalsIgnoreCase("Grande")) {
			precioFinal =+ 2;
		}
		
		for (Extra extra : extras) {
	        precioFinal += extra.getPrecio();
	    }
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String ticketLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
