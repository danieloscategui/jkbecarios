package becarios.service;

import java.util.List;

import becarios.controller.dto.AsesorDTO;

public interface AsesorService {
	public List<AsesorDTO> showAll();
	public AsesorDTO getById(Long id);
	public void saveOrUpdate(AsesorDTO asesorDTO);
}
