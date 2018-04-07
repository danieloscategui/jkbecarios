package becarios.service;

import java.util.List;

import becarios.model.Becario;

public interface BecarioService {
	public List<Becario> listar();
	public Becario obtenerPorDNI(String DNI);
	public void actualizar(Becario becario);
}
