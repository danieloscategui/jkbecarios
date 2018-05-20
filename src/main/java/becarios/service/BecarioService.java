package becarios.service;

import java.util.List;

import becarios.model.Becario;
import becarios.model.BecarioEstado;
import becarios.model.EstadoDos;
import becarios.model.EstadoTres;
import becarios.model.EstadoUno;

public interface BecarioService {
	public List<Becario> showAll();
	public List<Becario> showBecariosPorBeca(Long idBeca);
	public List<Becario> showBecariosPorBecaPaginated(Long idBeca, Integer offset, Integer maxResults);
	public Becario getById(Long idBecario);
	public List<Becario> getByDNI(String DNI);
	public void saveOrUpdate(Becario becario);
	public void updateBecarioEstado(Long idBecario, BecarioEstado becarioEstado, String observaciones);
	public Long count();
	public Long countByBeca(Long idBeca);
	public List<EstadoUno> getListEstadoUno();
	public List<EstadoUno> getJdbcEstadoUno();
	public List<EstadoDos> getListEstadoDos(Integer idEstadoUno);
	public List<EstadoDos> getJdbcEstadoDos(Integer idEstadoUno);
	public List<EstadoTres> getListEstadoTres(Integer idEstadoDos);
	public List<EstadoTres> getJdbcEstadoTres(Integer idEstadoDos);
	public EstadoUno getEstadoUno(Integer idEstadoUno);
}
