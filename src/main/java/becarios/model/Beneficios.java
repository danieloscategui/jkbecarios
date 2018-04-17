package becarios.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="beneficios")
public class Beneficios implements Serializable {

	private static final long serialVersionUID = 1880056732721306L;

	@Id
	@SequenceGenerator(name="beneficiosSequence", sequenceName="beneficios_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="beneficiosSequence")
	@Column(name="id_beneficio")
	private Long idBeneficio;
	
	@Column(name="descripcion")
	private String descripcion;

	@ManyToMany(mappedBy="beneficios")
	private Set<Beca> becas = new HashSet<>();
	
	public Set<Beca> getBecas() {
		return becas;
	}

	public void setBecas(Set<Beca> becas) {
		this.becas = becas;
	}

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
	
	public boolean isNew(){
		return (this.idBeneficio == null);
	}
}