package becarios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="becarios")
public class Becario implements Serializable {

	private static final long serialVersionUID = -8966358367570468021L;
	
	@Id
	@Column(name="dni", unique=true, nullable=false)
	private String dni;
	@Column(name="apellido_paterno")
	private String apellidoPaterno;
	@Column(name="apellido_materno")
	private String apellidoMaterno;
	@Column(name="nombres")
	private String nombres;
	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	@Column(name="edad")
	private Integer edad;
	@Column(name="numero_expediente")
	private String numeroExpediente;
	@Column(name="resolucion_adjudicacion")
	private String resolucionAdjudicacion;

	@Column(name="resolucion_adjudicacion_fecha")
	@Temporal(TemporalType.DATE)
	private Date resolucionAdjudicacionFecha;

	@Column(name="representante_legal")
	private String representanteLegal;
	@Column(name="telefonos")
	private String telefonos;
	@Column(name="correo_pronabec")
	private String correoPronabec;
	@Column(name="correo_personal")
	private String correoPersonal;
	@Column(name="direccion")
	private String direccion;
	@Column(name="region_procedencia")
	private String regionProcedencia;
	@Column(name="provincia_procedencia")
	private String provinciaProcedencia;
	@Column(name="distrito_procedencia")
	private String distritoProcedencia;
	@Column(name="region_postulacion")
	private String regionPostulacion;
	@Column(name="provincia_postulacion")
	private String provinciaPostulacion;
	@Column(name="distrito_postulacion")
	private String distritoPostulacion;
	@Column(name="estado_actual")
	private String estadoActual;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "becario")
	private List<Tramite> tramites;
	@JoinColumn(name="id_beca", referencedColumnName="id_beca")
	@ManyToOne(optional=false)
	private Beca beca;
	
	
	public Beca getBeca() {
		return beca;
	}
	public void setBeca(Beca beca) {
		this.beca = beca;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public String getResolucionAdjudicacion() {
		return resolucionAdjudicacion;
	}
	public void setResolucionAdjudicacion(String resolucionAdjudicacion) {
		this.resolucionAdjudicacion = resolucionAdjudicacion;
	}
	public Date getResolucionAdjudicacionFecha() {
		return resolucionAdjudicacionFecha;
	}
	public void setResolucionAdjudicaionFecha(Date resolucionAdjudicacionFecha) {
		this.resolucionAdjudicacionFecha = resolucionAdjudicacionFecha;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
	public String getCorreoPronabec() {
		return correoPronabec;
	}
	public void setCorreoPronabec(String correoPronabec) {
		this.correoPronabec = correoPronabec;
	}
	public String getCorreoPersonal() {
		return correoPersonal;
	}
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRegionProcedencia() {
		return regionProcedencia;
	}
	public void setRegionProcedencia(String regionProcedencia) {
		this.regionProcedencia = regionProcedencia;
	}
	public String getProvinciaProcedencia() {
		return provinciaProcedencia;
	}
	public void setProvinciaProcedencia(String provinciaProcedencia) {
		this.provinciaProcedencia = provinciaProcedencia;
	}
	public String getDistritoProcedencia() {
		return distritoProcedencia;
	}
	public void setDistritoProcedencia(String distritoProcedencia) {
		this.distritoProcedencia = distritoProcedencia;
	}
	public String getRegionPostulacion() {
		return regionPostulacion;
	}
	public void setRegionPostulacion(String regionPostulacion) {
		this.regionPostulacion = regionPostulacion;
	}
	public String getProvinciaPostulacion() {
		return provinciaPostulacion;
	}
	public void setProvinciaPostulacion(String provinciaPostulacion) {
		this.provinciaPostulacion = provinciaPostulacion;
	}
	public String getDistritoPostulacion() {
		return distritoPostulacion;
	}
	public void setDistritoPostulacion(String distritoPostulacion) {
		this.distritoPostulacion = distritoPostulacion;
	}
	public List<Tramite> getTramites() {
		return tramites;
	}
	public void setTramites(List<Tramite> tramites) {
		this.tramites = tramites;
	}
	public String getEstadoActual() {
		return estadoActual;
	}
	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	public boolean isNew(){
		return (this.dni == null);
	}
	
	public String getFullName(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombres).append(" ");
		sb.append(apellidoMaterno).append(" ");
		sb.append(apellidoPaterno);
		return sb.toString();
	}
}
