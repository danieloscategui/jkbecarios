package becarios.service;

import java.util.List;

import becarios.model.Beca;
import becarios.model.VistaBecasEstado;

public interface BecaService {
	public List<Beca> showAll();
	public Beca getById(Long id);
	public void saveOrUpdate(Beca beca);
	public List<VistaBecasEstado> getVistaBecas();
	public List<Beca> showAllPaginated(Integer offset, Integer maxResults);
	public Long count();
	public List<String> getConvocatorias();
	public List<String> getModalidades(String convocatoria);
	public List<String> getIes(String convocatoria, String modalidad);
	public List<String> getCarreras(String convocatoria, String modalidad, String ies);
}
