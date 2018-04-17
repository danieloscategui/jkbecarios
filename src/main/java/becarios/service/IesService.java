package becarios.service;

import java.util.List;

import becarios.model.Ies;

public interface IesService {
	public List<Ies> showAll();
	public Ies getById(Long id);
	public void saveOrUpdate(Ies ies);
}
