package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecarioDAO;
import becarios.model.Becario;
import becarios.service.BecarioService;

@Service
@Transactional
public class BecarioServiceImpl implements BecarioService{

	@Autowired
	private BecarioDAO becarioDAO;
	
	
	@Override
	public List<Becario> listar() {
		return becarioDAO.findAll();
	}

	@Override
	public Becario obtenerPorDNI(String DNI) {
		return becarioDAO.getBecarioPorDNI(DNI);
	}

	@Override
	public void actualizar(Becario becario) {
		if(becario.getDni().isEmpty() || becario.getDni() == null){
			becarioDAO.save(becario);
		} else {
			becarioDAO.update(becario);
		}
	}

}
