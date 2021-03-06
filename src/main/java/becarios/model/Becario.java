package becarios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="becarios")
public class Becario implements Serializable {

	private static final long serialVersionUID = -8966358367570468021L;
	
	@Id
	@SequenceGenerator(name="becarioSequence", sequenceName="becario_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="becarioSequence")
	@Column(name="id_becario")
	private Long idBecario;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="nombres")
	private String nombres;

	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name="edad")
	private Integer edad;

	@Enumerated(EnumType.STRING)
	@Column(name="sexo")
	private Sexo sexo;
	
	@Column(name="numero_expediente")
	private String numeroExpediente;
	
	@Column(name="resolucion_adjudicacion")
	private String resolucionAdjudicacion;

	@Column(name="resolucion_adjudicacion_fecha")
	@Temporal(TemporalType.DATE)
	private Date resolucionAdjudicacionFecha;

	@Column(name="representante")
	private String representante;
	
	@Column(name="representante_dni")
	private String representanteDni;
	
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
	
	@Column(name="observaciones")
	private String observaciones;
	
	@JoinColumn(name="id_estado_uno", referencedColumnName="id_estado_uno")
	@ManyToOne(optional=false)
	private EstadoUno estadoUno;
	
	@Column(name="id_estado_dos")
	private Integer estadoDos;
	
	@Column(name="id_estado_tres")
	private Integer estadoTres;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "becario")
	private List<Tramite> tramites;
	
	@JoinColumn(name="id_beca", referencedColumnName="id_beca")
	@ManyToOne(optional=false)
	private Beca beca;
	
	
	public Long getIdBecario() {
		return idBecario;
	}
	public void setIdBecario(Long idBecario) {
		this.idBecario = idBecario;
	}
	
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
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
	
	public void setResolucionAdjudicacionFecha(Date resolucionAdjudicacionFecha) {
		this.resolucionAdjudicacionFecha = resolucionAdjudicacionFecha;
	}
	
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	
	public String getRepresentanteDni() {
		return representanteDni;
	}
	
	public void setRepresentanteDni(String representanteDni) {
		this.representanteDni = representanteDni;
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
	
	public EstadoUno getEstadoUno() {
		return estadoUno;
	}
	public void setEstadoUno(EstadoUno estadoUno) {
		this.estadoUno = estadoUno;
	}
	
	public Integer getEstadoDos(){
		return estadoDos;
	}
	
	public void setEstadoDos(Integer estadoDos){
		this.estadoDos = estadoDos;
	}
	
	public Integer getEstadoTres(){
		return estadoTres;
	}
	
	public void setEstadoTres(Integer estadoTres){
		this.estadoTres = estadoTres;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isNew(){
		return (this.idBecario == null);
	}
	
	public String getFullName(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombres).append(" ").append(apellidos);
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID[").append(idBecario).append("], ");
		sb.append("Full Name[").append(getFullName()).append("], ");
		sb.append("DNI[").append(dni).append("], ");
		sb.append("Beca[").append(beca.getIdBeca()).append("], ");
		sb.append("Estado[").append(estadoUno.getDescripcion()).append("]");
		return sb.toString();
	}
}
