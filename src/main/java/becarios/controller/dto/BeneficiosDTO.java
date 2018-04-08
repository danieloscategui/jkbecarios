package becarios.controller.dto;

import java.io.Serializable;

public class BeneficiosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idBeneficio;
	private String descripcion;

	public Long getIdBeneficio() {
		return idBeneficio;
	}
	public void setIdBeneficio(Long idBeneficio) {
		this.idBeneficio = idBeneficio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
