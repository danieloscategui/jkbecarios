package becarios.model;

public enum TipoGestion {
	
	PUBLICO("Publico"), PRIVADO("Privado"), PUBLICO_PRIVADO("Publico Privado");
	
	private String value;
	
	TipoGestion(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
}
