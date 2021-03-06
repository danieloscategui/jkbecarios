package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.AsesorDAO;
import becarios.model.Asesor;
import becarios.service.AsesorService;

@Service
public class AsesorServiceImpl implements AsesorService {

	@Autowired
	private AsesorDAO asesorDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Asesor> showAll() {
		return asesorDAO.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Asesor> showAllPaginated(Integer offset, Integer maxResults) {
		return asesorDAO.findAllPaginated(offset, maxResults);
	}

	@Override
	@Transactional(readOnly = true)
	public Asesor getById(Long id) {
		return asesorDAO.findOne(id);
	}


	@Override
	@Transactional
	public void saveOrUpdate(Asesor asesor) {
		if (asesor.isNew()) {
			asesorDAO.save(asesor);
		} else {
			asesorDAO.update(asesor);
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Long count() {
		return asesorDAO.count();
	}
	
}
