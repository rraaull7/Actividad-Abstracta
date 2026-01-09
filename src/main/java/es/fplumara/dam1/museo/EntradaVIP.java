package es.fplumara.dam1.museo;

import java.time.LocalDate;

class EntradaVIP extends Entrada implements Descontable,ConAccesoRapido {
	private String zonavip;
	private int NivelPrioridad;

	public EntradaVIP(String id, double precioBase, LocalDate fecha) {
		super(id, precioBase, fecha);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aplicarDescuento(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	double precioFinal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String descripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntradaVIP(String id, double precioBase, LocalDate fecha, String zonavip, int nivelPrioridad) {
		super(id, precioBase, fecha);
		this.zonavip = zonavip;
		NivelPrioridad = nivelPrioridad;
	}

	@Override
	public void prioridadAcceso(int numero) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
}
