package becarios.service;

import java.util.List;

import becarios.model.Beca;

public interface BecaService {
	public List<Beca> showAll();
	public Beca getById(Long id);
	public void saveOrUpdate(Beca beca);
}
