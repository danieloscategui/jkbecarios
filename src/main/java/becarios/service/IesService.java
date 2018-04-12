package becarios.service;

import java.util.List;

import becarios.controller.dto.IesDTO;

public interface IesService {
	public List<IesDTO> showAll();
	public IesDTO getById(Long id);
	public void saveOrUpdate(IesDTO iesDTO);
}
