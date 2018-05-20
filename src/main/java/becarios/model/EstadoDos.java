package becarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_DOS")
public class EstadoDos implements Serializable {

	private static final long serialVersionUID = 6077547451510649695L;

	@Id
	@SequenceGenerator(name="estadoDosSequence", sequenceName="estado_dos_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadoDosSequence")
	@Column(name="id_estado_dos")
	private Integer idEstadoDos;
	
	@Column
	private String descripcion;
	
	@JoinColumn(name="id_estado_uno", referencedColumnName="id_estado_uno")
	@ManyToOne(optional=false)
	private EstadoUno estadoUno;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="idEstadoTres")
	private List<EstadoTres> listEstadoTres;

	public Integer getIdEstadoDos() {
		return idEstadoDos;
	}

	public void setIdEstadoDos(Integer idEstadoDos) {
		this.idEstadoDos = idEstadoDos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EstadoUno getEstadoUno() {
		return estadoUno;
	}

	public void setEstadoUno(EstadoUno estadoUno) {
		this.estadoUno = estadoUno;
	}

	public List<EstadoTres> getListEstadoTres() {
		return listEstadoTres;
	}

	public void setListEstadoTres(List<EstadoTres> listEstadoTres) {
		this.listEstadoTres = listEstadoTres;
	}
	
	
	
}
