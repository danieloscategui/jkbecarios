package becarios.controller.dto;

import java.io.Serializable;

public class ParamsQueryBecaDashboard implements Serializable {
	
	private static final long serialVersionUID = -2498703593996453016L;

	private String convocatoria;
	private String modalidad;
	private String ies;
	private String carrera;
	
	public String getConvocatoria() {
		return convocatoria;
	}
	public void setConvocatoria(String convocatoria) {
		this.convocatoria = convocatoria;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public String getIes() {
		return ies;
	}
	public void setIes(String ies) {
		this.ies = ies;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Convocatoria[").append(convocatoria).append("], ");
		sb.append("Modalidad[").append(modalidad).append("], ");
		sb.append("Ies[").append(ies).append("], ");
		sb.append("Carrera[").append(carrera).append("]");
		return sb.toString();
	}
}
