package becarios.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pago_academico")
public class PagoAcademico implements Serializable {

	private static final long serialVersionUID = -7137965088086356765L;
	
	@Id
	@SequenceGenerator(name="pagoAcademicoSequence", sequenceName="pago_academico_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pagoAcademicoSequence")
	@Column(name="id_pago_academico")
	private Long idPagoAcademico;

	@Column(name="numero_convenio")
	private String numeroConvenio;
	@Column(name="mes")
	private String mes;
	@Column(name="numero_cuota")
	private String numeroCuota;
	@Column(name="numero_solicitud")
	private String numeroSolicitud;
	@Column(name="fecha_solicitud")
	@Temporal(TemporalType.DATE)
	private Date fechaSolicitud;
	@Column(name="numero_conformidad")
	private String numeroConformidad;
	@Column(name="cantidad_becarios")
	private Integer cantidadBecarios;
	@Column(name="monto_total")
	private BigDecimal montoTotal;
	@Column(name="pago_materiales")
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

	public Integer getCantidadBecarios() {
		return cantidadBecarios;
	}

	public void setCantidadBecarios(Integer cantidadBecarios) {
		this.cantidadBecarios = cantidadBecarios;
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
