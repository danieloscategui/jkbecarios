package becarios.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecaDAO;
import becarios.model.Beca;
import becarios.model.VistaBecasEstado;
import becarios.service.BecaService;

@Service
public class BecaServiceImpl implements BecaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BecaServiceImpl.class);
	
	@Autowired
	private BecaDAO becaDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<Beca> showAll() {
		return becaDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Beca getById(Long id) {
		return becaDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Beca beca) {
		if (beca.isNew()) {
			becaDAO.save(beca);
		} else {
			becaDAO.update(beca);
		}
	}

	@Override
	@Transactional(readOnly=true)
	public List<VistaBecasEstado> getVistaBecas() {
		return becaDAO.getVistaBecas();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Beca> showAllPaginated(Integer offset, Integer maxResults) {
		LOGGER.debug("showAllPaginated( offset["+ offset + "], maxResults["+ maxResults + "]");
		return becaDAO.findAllPaginated(offset, maxResults);
	}

	@Override
	@Transactional(readOnly=true)
	public Long count() {
		return becaDAO.count();
	}

	@Override
	@Transactional(readOnly=true)
	public List<String> getConvocatorias() {
		return becaDAO.getConvocatorias();
	}

	@Override
	@Transactional(readOnly=true)
	public List<String> getModalidades(String convocatoria) {
		return becaDAO.getModalidades(convocatoria);
	}

	@Override
	@Transactional(readOnly=true)
	public List<String> getIes(String convocatoria, String modalidad) {
		return becaDAO.getIes(convocatoria, modalidad);
	}

	@Override
	@Transactional(readOnly=true)
	public List<String> getCarreras(String convocatoria, String modalidad, String ies) {
		return becaDAO.getCarreras(convocatoria, modalidad, ies);
	}
	
}
