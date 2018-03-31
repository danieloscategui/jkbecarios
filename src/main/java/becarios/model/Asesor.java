package becarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asesores")
public class Asesor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4605880793439907675L;
	
	@Id
	@Column(name="id_asesor")
	private Long idAsesor;
	
	@Column(name="asesor")
	private String nombre;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="idAsesor")
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
	
	
}
