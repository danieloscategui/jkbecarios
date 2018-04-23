package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecaDAO;
import becarios.model.Beca;
import becarios.model.VistaBecasEstado;
import becarios.service.BecaService;

@Service
public class BecaServiceImpl implements BecaService {

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
}
