package becarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ies")
public class IES implements Serializable{

	private static final long serialVersionUID = 552791662260746034L;
	
	@Id
	@SequenceGenerator(name="iesSequence", sequenceName="ies_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="iesSequence")
	@Column(name="id_ies")
	private Long idIES;
	@Column(name="ies_nombre")
	private String nombre;
	@Column(name="tipo_ies")
	private String tipoIES;
	@Column(name="tipo_gestion")
	private String tipoGestion;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="idIES")
	private List<Beca> becas;
	
	public Long getIdIES() {
		return idIES;
	}
	public void setIdIES(Long idIES) {
		this.idIES = idIES;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoGestion() {
		return tipoGestion;
	}
	public void setTipoGestion(String tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
	public List<Beca> getBecas() {
		return becas;
	}
	public void setBecas(List<Beca> becas) {
		this.becas = becas;
	}
	public String getTipoIES() {
		return tipoIES;
	}
	public void setTipoIES(String tipoIES) {
		this.tipoIES = tipoIES;
	}
	
}
