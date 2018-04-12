package becarios.service;

import java.util.List;

import becarios.controller.dto.TramiteDTO;

public interface TramiteService {
	public List<TramiteDTO> showAll();
	public TramiteDTO getById(Long id);
	public void saveOrUpdate(TramiteDTO tramiteDTO);
}
