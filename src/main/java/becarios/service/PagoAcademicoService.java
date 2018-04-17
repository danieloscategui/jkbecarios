package becarios.service;

import java.util.List;

import becarios.model.PagoAcademico;

public interface PagoAcademicoService {
	public List<PagoAcademico> showAll();
	public PagoAcademico getById(Long id);
	public void saveOrUpdate(PagoAcademico pagoAcademico);
}
