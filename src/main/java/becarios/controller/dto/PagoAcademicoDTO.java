package becarios.controller.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PagoAcademicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idPagoAcademico;
	private String numeroConvenio;
	private String mes;
	private String numeroCuota;
	private String numeroSolicitud;
	private Date fechaSolicitud;
	private String numeroConformidad;
	private Integer numeroBecarios;
	private BigDecimal montoTotal;
	private BigDecimal pagoMateriales;

	public Long getIdPagoAcademico() {
		return idPagoAcademico;
	}
	public void setIdPagoAcademico(Long idPagoAcademico) {
		this.idPagoAcademico = idPagoAcademico;
	}
	public String getNumeroConvenio() {
		return numeroConvenio;
	}
	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(String numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public String getNumeroSolicitud() {
		return numeroSolicitud;
	}
	public void setNumeroSolicitud(String numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getNumeroConformidad() {
		return numeroConformidad;
	}
	public void setNumeroConformidad(String numeroConformidad) {
		this.numeroConformidad = numeroConformidad;
	}
	public Integer getNumeroBecarios() {
		return numeroBecarios;
	}
	public void setNumeroBecarios(Integer numeroBecarios) {
		this.numeroBecarios = numeroBecarios;
	}
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	public BigDecimal getPagoMateriales() {
		return pagoMateriales;
	}
	public void setPagoMateriales(BigDecimal pagoMateriales) {
		this.pagoMateriales = pagoMateriales;
	}
	public boolean isNew(){
		return (this.idPagoAcademico == null);
	}
}
