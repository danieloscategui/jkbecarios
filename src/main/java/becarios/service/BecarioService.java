package becarios.service;

import java.util.List;

import becarios.controller.dto.BecarioDTO;

public interface BecarioService {
	public List<BecarioDTO> showAll();
	public BecarioDTO getByDNI(String DNI);
	public void saveOrUpdate(BecarioDTO becarioDTO);
}
