package becarios.controller.dto;

import java.io.Serializable;

public class AsesorDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long idAsesor;
	private String nombre;

	public Long getIdAsesor() {
		return idAsesor;
	}
	public void setIdAsesor(Long id) {
		this.idAsesor = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isNew(){
		return (this.idAsesor == null);
	}
}
