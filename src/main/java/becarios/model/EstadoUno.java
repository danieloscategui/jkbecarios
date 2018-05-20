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
@Table(name="ESTADO_UNO")
public class EstadoUno implements Serializable {
	
	private static final long serialVersionUID = -5713118761705056913L;

	@Id
	@SequenceGenerator(name="estadoUnoSequence", sequenceName="estado_uno_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadoUnoSequence")
	@Column(name="id_estado_uno")
	private Integer idEstadoUno;
	
	@Column
	private String descripcion;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="estadoUno")
	private List<Becario> becarios;	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="idEstadoDos")
	private List<EstadoDos> listEstadoDos;
	
	public Integer getIdEstadoUno() {
		return idEstadoUno;
	}
	public void setIdEstadoUno(Integer idEstadoUno) {
		this.idEstadoUno = idEstadoUno;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Becario> getBecarios() {
		return becarios;
	}
	public void setBecarios(List<Becario> becarios) {
		this.becarios = becarios;
	}
	public List<EstadoDos> getListEstadoDos() {
		return listEstadoDos;
	}
	public void setListEstadoDos(List<EstadoDos> listEstadoDos) {
		this.listEstadoDos = listEstadoDos;
	}
	
	
}
