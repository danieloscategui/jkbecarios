package becarios.model;

import java.io.Serializable;
import java.util.Date;

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
@Table
public class Tramite implements Serializable{

	private static final long serialVersionUID = -4027802465944120664L;
	
	@Id
	@SequenceGenerator(name="tramiteSequence", sequenceName="tramite_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tramiteSequence")
	@Column(name="id_tramite")
	private Long idTramite;
	
	@JoinColumn(name="dni_becario", referencedColumnName = "dni")
	@ManyToOne(optional=false)
	private Becario becario;
	
	
	@Column(name="numero_sigedo")
	private String numeroSigedo;
	
	@Column(name="motivo")
	private String motivo;

	@Column(name="oficina_destino")
	private String oficinaDestino;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="tipo_doc_respuesta")
	private String tipoDocumentoRespuesta;
	
	@Column(name="numero_documento")
	private String numeroDocumento;
	
	@Column(name="fecha_nacimiento")
	private Date fechaDocumento;

	public Long getIdTramite() {
		return idTramite;
	}

	public void setIdTramite(Long idTramite) {
		this.idTramite = idTramite;
	}

	public Becario getBecario() {
		return becario;
	}

	public void setBecario(Becario becario) {
		this.becario = becario;
	}

	public String getNumeroSigedo() {
		return numeroSigedo;
	}

	public void setNumeroSigedo(String numeroSigedo) {
		this.numeroSigedo = numeroSigedo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getOficinaDestino() {
		return oficinaDestino;
	}

	public void setOficinaDestino(String oficinaDestino) {
		this.oficinaDestino = oficinaDestino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoDocumentoRespuesta() {
		return tipoDocumentoRespuesta;
	}

	public void setTipoDocumentoRespuesta(String tipoDocumentoRespuesta) {
		this.tipoDocumentoRespuesta = tipoDocumentoRespuesta;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}
	
}
