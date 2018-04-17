package becarios.service;

import java.util.List;

import becarios.model.Tramite;

public interface TramiteService {
	public List<Tramite> showAll();
	public List<Tramite> showTramitesPorBecario(String dniBecario);
	public Tramite getById(Long id);
	public void saveOrUpdate(Tramite tramite);
}
