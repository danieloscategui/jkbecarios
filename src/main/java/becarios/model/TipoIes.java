package becarios.model;

public enum TipoIes {

	INSTITUTO("Instituto"), UNIVERSIDAD("Universidad"), CETPRO("Cetpro"), ESCUELA("Escuela");
	
	private String value;

	TipoIes(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
