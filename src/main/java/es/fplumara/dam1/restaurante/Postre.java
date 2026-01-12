package es.fplumara.dam1.restaurante;

public class Postre extends ProductoMenu  {

	private boolean esCasero;
	
	
	public Postre(String id, String nombre, double precioBase, boolean esCasero) {
		super(id, nombre, precioBase);
		this.esCasero = esCasero;
	}

	public boolean isEsCasero() {
		return esCasero;
	}

	public void setEsCasero(boolean esCasero) {
		this.esCasero = esCasero;
	}

	public Postre(String id, String nombre, double precioBase) {
		super(id, nombre, precioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	double precioFinal() {
		double precioFinal;
		if(esCasero==true) {
			return  precioFinal=this.getPrecioBase() +1.50;
		}
		else {
			return  precioFinal=this.getPrecioBase();
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	String ticketLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
