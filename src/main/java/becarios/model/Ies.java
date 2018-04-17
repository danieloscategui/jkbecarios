package becarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ies")
public class Ies implements Serializable{

	private static final long serialVersionUID = 552791662260746034L;
	
	@Id
	@SequenceGenerator(name="iesSequence", sequenceName="ies_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="iesSequence")
	@Column(name="id_ies")
	private Long idIes;
	
	@Column(name="ies_nombre")
	private String nombre;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_ies")
	private TipoIes tipoIes;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_gestion")
	private TipoGestion tipoGestion;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="ies")
	private List<Beca> becas;
	
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
	public TipoGestion getTipoGestion() {
		return tipoGestion;
	}
	public void setTipoGestion(TipoGestion tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
	public List<Beca> getBecas() {
		return becas;
	}
	public void setBecas(List<Beca> becas) {
		this.becas = becas;
	}
	public TipoIes getTipoIes() {
		return tipoIes;
	}
	public void setTipoIes(TipoIes tipoIes) {
		this.tipoIes = tipoIes;
	}
	
	public boolean isNew(){
		return (this.idIes == null);
	}
}
