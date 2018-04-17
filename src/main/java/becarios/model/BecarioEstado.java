package becarios.model;

public enum BecarioEstado {
	
	ACTIVO("Activo"), ABANDONO("Abandono"), RENUNCIA("Renuncia"), SUSPENSION("Suspension"), 
	DESAPROBADO("Desaprobado"), EGRESADO_BECA("Egresado de Beca"), FALLECIMIENTO("Fallecimiento") ;
	
	private String descripcion;
	
	BecarioEstado(String descripcion){
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}

