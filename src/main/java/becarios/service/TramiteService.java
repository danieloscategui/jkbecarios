package becarios.service;

import java.util.List;

import becarios.model.Tramite;

public interface TramiteService {
	public List<Tramite> listar();
	public Tramite obtenerPorId(Long id);
	public void actualizar(Tramite tramite);
}
