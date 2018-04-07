package becarios.service;

import java.util.List;

import becarios.model.IES;

public interface IesService {
	public List<IES> listar();
	public IES obtenerPorId(Long id);
	public void actualizar(IES ies);
	
}
