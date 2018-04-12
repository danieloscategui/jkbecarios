package becarios.controller.dto;

import java.io.Serializable;
import java.util.Date;

public class BecaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idBeca;
	private String convocatoria;
	private String modalidad;
	private Long idIES;
	private String regionEstudio;
	private String sedeEstudio;
	private String carrera;
	private Date inicioBeca;
	private Date terminoBeca;
	private String semestreEgreso;
	private Long asesorResponsable;
	
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
	public Long getIdIES() {
		return idIES;
	}
	public void setIdIES(Long idIES) {
		this.idIES = idIES;
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
	public Long getAsesorResponsable() {
		return asesorResponsable;
	}
	public void setAsesorResponsable(Long asesorResponsable) {
		this.asesorResponsable = asesorResponsable;
	}
	
	public boolean isNew(){
		return (this.idBeca == null);
	}
}
