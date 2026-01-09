package es.fplumara.dam1.museo;

import java.time.LocalDate;

class EntradaEstudiante extends Entrada implements Descontable {

	public EntradaEstudiante(String id, double precioBase, LocalDate fecha) {
		super(id, precioBase, fecha);
		// TODO Auto-generated constructor stub
	}

	private String centroEducativo;

	@Override
	public double aplicarDescuento(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	public EntradaEstudiante(String id, double precioBase, LocalDate fecha, String centroEducativo) {
		super(id, precioBase, fecha);
		this.centroEducativo = centroEducativo;
	}

	public String getCentroEducativo() {
		return centroEducativo;
	}

	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
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
	
	
	
}
