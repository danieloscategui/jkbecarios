package becarios.model;

import java.io.Serializable;

public class VistaBecasEstado implements Serializable {
	
	private static final long serialVersionUID = 6641723154824636837L;

	private String asesor;
	private String convocatoria;
	private String modalidad;
	private String ies;
	private String carrera;
	private String estadoUno;
	private String estadoDos;
	private String estadoTres;
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
	public String getEstadoUno() {
		return estadoUno;
	}
	public void setEstadoUno(String estadoUno) {
		this.estadoUno = estadoUno;
	}
	public String getEstadoDos() {
		return estadoDos;
	}
	public void setEstadoDos(String estadoDos) {
		this.estadoDos = estadoDos;
	}
	public String getEstadoTres() {
		return estadoTres;
	}
	public void setEstadoTres(String estadoTres) {
		this.estadoTres = estadoTres;
	}
	public int getTotalBecarios() {
		return totalBecarios;
	}
	public void setTotalBecarios(int totalBecarios) {
		this.totalBecarios = totalBecarios;
	}
	
}
