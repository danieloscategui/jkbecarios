package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecaDAO;
import becarios.model.Beca;
import becarios.service.BecaService;

@Service
@Transactional
public class BecaServiceImpl implements BecaService {

	@Autowired
	private BecaDAO becaDAO;

	@Override
	public List<Beca> listar() {
		return becaDAO.findAll();
	}

	@Override
	public Beca obtenerPorId(Long id) {
		return becaDAO.findOne(id);
	}

	@Override
	public void actualizar(Beca beca) {
		if (beca.getIdBeca() == 0L || beca.getIdBeca() == null) {
			becaDAO.save(beca);
		} else {
			becaDAO.update(beca);
		}
	}

}
