package becarios.service;

import java.util.List;

import becarios.model.Becario;
import becarios.model.BecarioEstado;

public interface BecarioService {
	public List<Becario> showAll();
	public List<Becario> showBecariosPorBeca(Long idBeca);
	public Becario getById(Long idBecario);
	public Becario getByDNI(String DNI);
	public void saveOrUpdate(Becario becario);
	public void updateBecarioEstado(Long idBecario, BecarioEstado becarioEstado);
}
