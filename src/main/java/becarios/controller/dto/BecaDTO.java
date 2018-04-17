package becarios.controller.dto;

import java.io.Serializable;
import java.util.Date;

import becarios.model.Asesor;
import becarios.model.Ies;

public class BecaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idBeca;
	private String convocatoria;
	private String modalidad;
	private Ies ies;
	private String regionEstudio;
	private String sedeEstudio;
	private String carrera;
	private Date inicioBeca;
	private Date terminoBeca;
	private String semestreEgreso;
	private Asesor asesorResponsable;
	
	//private List<Becarios> becarios;
	//private Set<Beneficios> beneficios;
	
	public Long getIdBeca() {
		return idBeca;
	}
	public void setIdBeca(Long idBeca) {
		this.idBeca = idBeca;
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
	public Ies getIes() {
		return ies;
	}
	public void setIes(Ies ies) {
		this.ies = ies;
	}
	public String getRegionEstudio() {
		return regionEstudio;
	}
	public void setRegionEstudio(String regionEstudio) {
		this.regionEstudio = regionEstudio;
	}
	public String getSedeEstudio() {
		return sedeEstudio;
	}
	public void setSedeEstudio(String sedeEstudio) {
		this.sedeEstudio = sedeEstudio;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Date getInicioBeca() {
		return inicioBeca;
	}
	public void setInicioBeca(Date inicioBeca) {
		this.inicioBeca = inicioBeca;
	}
	public Date getTerminoBeca() {
		return terminoBeca;
	}
	public void setTerminoBeca(Date terminoBeca) {
		this.terminoBeca = terminoBeca;
	}
	public String getSemestreEgreso() {
		return semestreEgreso;
	}
	public void setSemestreEgreso(String semestreEgreso) {
		this.semestreEgreso = semestreEgreso;
	}
	public Asesor getAsesorResponsable() {
		return asesorResponsable;
	}
	public void setAsesorResponsable(Asesor asesorResponsable) {
		this.asesorResponsable = asesorResponsable;
	}
	
	public boolean isNew(){
		return (this.idBeca == null);
	}
}
