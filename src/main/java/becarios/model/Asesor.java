package becarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="asesores")
@NamedQueries({
	@NamedQuery(name="Asesor.findAll", query="SELECT a FROM Asesor a")
})
public class Asesor implements Serializable{

	private static final long serialVersionUID = 4605880793439907675L;
	
	@Id
	@SequenceGenerator(name="asesorSequence", sequenceName="asesores_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="asesorSequence")
	@Column(name="id_asesor")
	private Long idAsesor;
	
	@Column(name="asesor")
	private String nombre;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="asesor")
	private List<Beca> becas;
	
	public Long getIdAsesor() {
		return idAsesor;
	}
	public void setIdAsesor(Long idAsesor) {
		this.idAsesor = idAsesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Beca> getBecas() {
		return becas;
	}
	public void setBecas(List<Beca> becas) {
		this.becas = becas;
	}
	
	public boolean isNew(){
		return (this.idAsesor == null);
	}
	
}
