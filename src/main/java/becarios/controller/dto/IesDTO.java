package becarios.controller.dto;

import java.io.Serializable;

public class IesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idIes;
	private String nombre;
	private String tipoIes;
	private String tipoGestion;

	public Long getIdIes() {
		return idIes;
	}
	public void setIdIes(Long idIes) {
		this.idIes = idIes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoIes() {
		return tipoIes;
	}
	public void setTipoIes(String tipoIes) {
		this.tipoIes = tipoIes;
	}
	public String getTipoGestion() {
		return tipoGestion;
	}
	public void setTipoGestion(String tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
	public boolean isNew(){
		return (this.idIes == null);
	}
	
}
