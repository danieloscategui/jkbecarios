package becarios.controller.dto;

import java.io.Serializable;
import java.util.Date;

public class TramiteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idTramite;
	private String dniBecario;
	private String numeroSigedo;
	private String motivo;
	private String oficinaDestino;
	private String estado;
	private String tipoDocumentoRespuesta;
	private String numeroDocumento;
	private Date fechaDocumento;

	public Long getIdTramite() {
		return idTramite;
	}
	public void setIdTramite(Long idTramite) {
		this.idTramite = idTramite;
	}
	public String getDniBecario() {
		return dniBecario;
	}
	public void setDniBecario(String dniBecario) {
		this.dniBecario = dniBecario;
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
	public boolean isNew(){
		return (this.idTramite == null);
	}
}
