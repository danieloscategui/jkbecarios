package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.BeneficiosDTO;
import becarios.dao.BeneficiosDAO;
import becarios.model.Beneficios;
import becarios.service.BeneficiosService;

@Service
@Transactional
public class BeneficiosServiceImpl implements BeneficiosService {

	@Autowired
	private BeneficiosDAO beneficiosDAO;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<BeneficiosDTO> showAll() {
		List<Beneficios> beneficiosList = beneficiosDAO.findAll();
		List<BeneficiosDTO> beneficiosDtoList = new ArrayList<BeneficiosDTO>();
		for (Beneficios beneficios : beneficiosList) {
			beneficiosDtoList.add(convertToDto(beneficios));
		}
		return beneficiosDtoList;
	}

	@Override
	public BeneficiosDTO getById(Long id) {
		return convertToDto(beneficiosDAO.findOne(id));
	}

	@Override
	public void saveOrUpdate(BeneficiosDTO beneficiosDTO) {
		Beneficios beneficios = convertToEntity(beneficiosDTO);
		if (beneficios.getIdBeneficio() != null){
			beneficiosDAO.update(beneficios);
		} else {
			beneficiosDAO.save(beneficios);
		}
	}

	private Beneficios convertToEntity(BeneficiosDTO beneficiosDTO){
		return modelMapper.map(beneficiosDTO, Beneficios.class);
	}
	
	private BeneficiosDTO convertToDto(Beneficios beneficios){
		return modelMapper.map(beneficios, BeneficiosDTO.class);
	}
}
