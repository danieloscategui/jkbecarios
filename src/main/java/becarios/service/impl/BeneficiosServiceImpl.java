package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BeneficiosDAO;
import becarios.model.Beneficios;
import becarios.service.BeneficiosService;

@Service
@Transactional
public class BeneficiosServiceImpl implements BeneficiosService {

	@Autowired
	private BeneficiosDAO beneficiosDAO;
	
	@Override
	public List<Beneficios> listar() {
		return beneficiosDAO.findAll();
	}

	@Override
	public Beneficios obtenerPorId(Long id) {
		return beneficiosDAO.findOne(id);
	}

	@Override
	public void actualizar(Beneficios beneficios) {
		if (beneficios.getIdBeneficio() == 0L || beneficios.getIdBeneficio() == null){
			beneficiosDAO.save(beneficios);
		} else {
			beneficiosDAO.update(beneficios);
		}
	}

}
