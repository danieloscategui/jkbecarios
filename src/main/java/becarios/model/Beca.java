package becarios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="becas")
public class Beca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7317289352661238762L;
	
	@Id
	@Column(name="id_beca")
	private Long idBeca;
	@Column(name="modalidad")
	private String modalidad;
	@Column(name="convocatoria")
	private String convocatoria;
	@Column(name="region_estudio")
	private String regionEstudio;
	@Column(name="sede_estudio")
	private String sedeEstudio;
	@Column(name="carrera")
	private String carrera;
	@Column(name="inicio_beca")
	@Temporal(TemporalType.DATE)
	private Date inicioBeca;
	@Column(name="termino_beca")
	@Temporal(TemporalType.DATE)
	private Date terminoBeca;
	@Column(name="semestre_egreso")
	private String semestreEgreso;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idBeca")
	private List<Becario> becarios;
	
	@JoinColumn(name="asesor_responsable", referencedColumnName = "id_asesor")
	@ManyToOne(optional=false)
	private Asesor idAsesor;
	
	@JoinColumn(name="id_ies", referencedColumnName = "id_ies")
	@ManyToOne(optional=false)
	private IES idIES;
	
	public Asesor getIdAsesor() {
		return idAsesor;
	}
	public void setIdAsesor(Asesor idAsesor) {
		this.idAsesor = idAsesor;
	}
	public Long getIdBeca() {
		return idBeca;
	}
	public void setIdBeca(Long idBeca) {
		this.idBeca = idBeca;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public String getConvocatoria() {
		return convocatoria;
	}
	public void setConvocatoria(String convocatoria) {
		this.convocatoria = convocatoria;
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
	public List<Becario> getBecarios() {
		return becarios;
	}
	public void setBecarios(List<Becario> becarios) {
		this.becarios = becarios;
	}
	
}
