package becarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_TRES")
public class EstadoTres implements Serializable {
	
	private static final long serialVersionUID = 1939585988178577870L;

	@Id
	@SequenceGenerator(name="estadoTresSequence", sequenceName="estado_tres_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadoTresSequence")
	@Column(name="id_estado_tres")
	private Integer idEstadoTres;
	@Column
	private String descripcion;
	
	@JoinColumn(name="id_estado_dos", referencedColumnName="id_estado_dos" )
	@ManyToOne(optional=false)
	private EstadoDos estadoDos;

	public Integer getIdEstadoTres() {
		return idEstadoTres;
	}

	public void setIdEstadoTres(Integer idEstadoTres) {
		this.idEstadoTres = idEstadoTres;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EstadoDos getEstadoDos() {
		return estadoDos;
	}

	public void setEstadoDos(EstadoDos estadoDos) {
		this.estadoDos = estadoDos;
	}
	
}
