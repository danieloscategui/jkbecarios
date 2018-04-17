package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BeneficiosDAO;
import becarios.model.Beneficios;
import becarios.service.BeneficiosService;

@Service
public class BeneficiosServiceImpl implements BeneficiosService {

	@Autowired
	private BeneficiosDAO beneficiosDAO;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Beneficios> showAll() {
		return beneficiosDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Beneficios getById(Long id) {
		return beneficiosDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Beneficios beneficios) {
		if (beneficios.isNew()){
			beneficiosDAO.save(beneficios);
		} else {
			beneficiosDAO.update(beneficios);
		}
	}
	
	/*
	private Beneficios convertToEntity(BeneficiosDTO beneficiosDTO){
		return modelMapper.map(beneficiosDTO, Beneficios.class);
	}
	
	private BeneficiosDTO convertToDto(Beneficios beneficios){
		return modelMapper.map(beneficios, BeneficiosDTO.class);
	}
	*/
}
