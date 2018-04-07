package becarios.service;

import java.util.List;

import becarios.model.PagoAcademico;

public interface PagoAcademicoService {
	public List<PagoAcademico> listar();
	public PagoAcademico obtenerPorId(Long id);
	public void actualizar(PagoAcademico pagoAcademico);
}
