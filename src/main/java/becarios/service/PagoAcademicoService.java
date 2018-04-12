package becarios.service;

import java.util.List;

import becarios.controller.dto.PagoAcademicoDTO;

public interface PagoAcademicoService {
	public List<PagoAcademicoDTO> showAll();
	public PagoAcademicoDTO getById(Long id);
	public void saveOrUpdate(PagoAcademicoDTO pagoAcademicoDTO);
}
