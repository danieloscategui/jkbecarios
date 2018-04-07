package becarios.service;

import java.util.List;

import becarios.model.Beca;

public interface BecaService {
	public List<Beca> listar();
	public Beca obtenerPorId(Long id);
	public void actualizar(Beca beca);
}
