package becarios.service;

import java.util.List;

import becarios.controller.dto.BecaDTO;

public interface BecaService {
	public List<BecaDTO> showAll();
	public BecaDTO getById(Long id);
	public void saveOrUpdate(BecaDTO becaDTO);
}
