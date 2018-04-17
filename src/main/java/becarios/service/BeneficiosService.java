package becarios.service;

import java.util.List;

import becarios.model.Beneficios;

public interface BeneficiosService {
	public List<Beneficios> showAll();
	public Beneficios getById(Long id);
	public void saveOrUpdate(Beneficios beneficios);
}
