package becarios.controller.dto;

import java.io.Serializable;
import java.util.Date;

public class BecarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dni;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String nombres;
	private Date fechaNacimiento;
	private int	edad;
	private String numeroExpediente;
	private Long idBeca;
	private String representanteLegal;
	private String telefonos;
	private String correoPronabec;
	private String correoPersonal;
	private String direccion;
	private String regionProcedencia;
	private String provinciaProcedencia;
	private String distritoProcendencia;
	private String regionPostulacion;
	private String provinciaPostulacion;
	private String distritoPostulacion;
	private String resolucionAdjudicacion;
	private Date resolucionAdjudicacionFecha;
	private String estadoAcutal;

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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public Long getIdBeca() {
		return idBeca;
	}
	public void setIdBeca(Long idBeca) {
		this.idBeca = idBeca;
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
	public String getDistritoProcendencia() {
		return distritoProcendencia;
	}
	public void setDistritoProcendencia(String distritoProcendencia) {
		this.distritoProcendencia = distritoProcendencia;
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
	public String getEstadoAcutal() {
		return estadoAcutal;
	}
	public void setEstadoAcutal(String estadoAcutal) {
		this.estadoAcutal = estadoAcutal;
	}
	
}
