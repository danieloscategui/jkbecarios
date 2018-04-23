package becarios.model;

import java.io.Serializable;

public class VistaBecasEstado implements Serializable {
	
	private static final long serialVersionUID = 6641723154824636837L;

	private String asesor;
	private String convocatoria;
	private String modalidad;
	private String ies;
	private String carrera;
	private String estado;
	private int totalBecarios;
	
	public String getAsesor() {
		return asesor;
	}
	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}
	public String getConvocatoria() {
		return convocatoria;
	}
	public void setConvocatoria(String convocatoria) {
		this.convocatoria = convocatoria;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public String getIes() {
		return ies;
	}
	public void setIes(String ies) {
		this.ies = ies;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getTotalBecarios() {
		return totalBecarios;
	}
	public void setTotalBecarios(int totalBecarios) {
		this.totalBecarios = totalBecarios;
	}
	
}
