package becarios.service;

import java.util.List;

import becarios.controller.dto.BeneficiosDTO;

public interface BeneficiosService {
	public List<BeneficiosDTO> showAll();
	public BeneficiosDTO getById(Long id);
	public void saveOrUpdate(BeneficiosDTO beneficiosDTO);
}
