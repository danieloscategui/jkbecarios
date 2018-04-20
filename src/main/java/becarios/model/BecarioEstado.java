package becarios.model;

public enum BecarioEstado {
	
	ACTIVO("Activo"), ABANDONO("Abandono"), RENUNCIA("Renuncia"), SUSPENSION("Suspension"), 
	DESAPROBADO("Desaprobado"), EGRESADO_BECA("Egresado de Beca"), FALLECIMIENTO("Fallecimiento"),
	REVOCADO("Revocado"), CULMINO("Culmino");
	
	private String value;
	
	BecarioEstado(String value){
		this.value= value;
	}

	public String getValue() {
		return value;
	}
	
	
}

