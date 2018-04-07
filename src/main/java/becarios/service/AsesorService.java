package becarios.service;

import java.util.List;

import becarios.model.Asesor;

public interface AsesorService {
	public List<Asesor> listar();
	public Asesor obtenerPorId(Long id);
	public void actualizar(Asesor asesor);
}
