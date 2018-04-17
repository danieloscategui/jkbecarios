package becarios.service;

import java.util.List;

import becarios.model.Asesor;

public interface AsesorService {
	public List<Asesor> showAll();
	public Asesor getById(Long id);
	public void saveOrUpdate(Asesor asesor);
}
