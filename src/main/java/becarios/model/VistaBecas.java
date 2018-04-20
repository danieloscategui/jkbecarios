package becarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_becas_estado")
@Immutable
public class VistaBecas implements Serializable {
	
	private static final long serialVersionUID = 6641723154824636837L;
	@Id
	@Column
	private String asesor;
	@Column
	private String convocatoria;
	@Column
	private String modalidad;
	@Column(name="ies_nombre")
	private String ies;
	@Column
	private String carrera;
	@Column(name="estado_actual")
	private String estado;
	@Column(name="t_becarios")
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
