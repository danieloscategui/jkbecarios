package becarios.controller.dto;

import java.io.Serializable;
import java.util.Date;

import becarios.model.Beca;

public class BecarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dni;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String nombres;
	private Date fechaNacimiento;
	private Integer	edad;
	private String numeroExpediente;
	private Beca beca;
	private String representanteLegal;
	private String telefonos;
	private String correoPronabec;
	private String correoPersonal;
	private String direccion;
	private String regionProcedencia;
	private String provinciaProcedencia;
	private String distritoProcedencia;
	private String regionPostulacion;
	private String provinciaPostulacion;
	private String distritoPostulacion;
	private String resolucionAdjudicacion;
	private Date resolucionAdjudicacionFecha;
	private String estadoActual;
	//private List<Tramite> tramites;

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
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
	public Beca getBeca() {
		return beca;
	}
	public void setBeca(Beca beca) {
		this.beca = beca;
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
	public String getResolucionAdjudicacion() {
		return resolucionAdjudicacion;
	}
	public void setResolucionAdjudicacion(String resolucionAdjudicacion) {
		this.resolucionAdjudicacion = resolucionAdjudicacion;
	}
	public Date getResolucionAdjudicacionFecha() {
		return resolucionAdjudicacionFecha;
	}
	public void setResolucionAdjudicacionFecha(Date resolucionAdjudicacionFecha) {
		this.resolucionAdjudicacionFecha = resolucionAdjudicacionFecha;
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
