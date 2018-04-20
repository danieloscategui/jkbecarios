package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecarioDAO;
import becarios.model.Becario;
import becarios.model.BecarioEstado;
import becarios.service.BecarioService;

@Service
public class BecarioServiceImpl implements BecarioService{

	@Autowired
	private BecarioDAO becarioDAO;

//	@Autowired
//	private ModelMapper modelMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Becario> showAll() {
		return becarioDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Becario getByDNI(String DNI) {
		return becarioDAO.getBecarioPorDNI(DNI);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Becario becario) {
		if(becario.isNew()){
			becarioDAO.save(becario);
		} else {
			becarioDAO.update(becario);
		}
	}

	@Override
	@Transactional(readOnly=true)
	public List<Becario> showBecariosPorBeca(Long idBeca) {
		return becarioDAO.getBecariosPorBeca(idBeca);
	}

	@Override
	@Transactional
	public void updateBecarioEstado(String dni, BecarioEstado becarioEstado) {
		Becario becario = becarioDAO.getBecarioPorDNI(dni);
		becario.setEstadoActual(becarioEstado);
		becarioDAO.update(becario);
	}

	
	/*
	private Becario convertToEntity(BecarioDTO becarioDTO){
		return modelMapper.map(becarioDTO, Becario.class);
	}
	
	private BecarioDTO convertToDto(Becario becario){
		return modelMapper.map(becario, BecarioDTO.class);
	}
	*/
}
