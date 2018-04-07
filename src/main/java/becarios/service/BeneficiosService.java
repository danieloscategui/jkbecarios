package becarios.service;

import java.util.List;

import becarios.model.Beneficios;

public interface BeneficiosService {
	public List<Beneficios> listar();
	public Beneficios obtenerPorId(Long id);
	public void actualizar(Beneficios beneficios);
}
