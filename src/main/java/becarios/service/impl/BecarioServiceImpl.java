package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.BecarioDTO;
import becarios.dao.BecarioDAO;
import becarios.model.Becario;
import becarios.service.BecarioService;

@Service
@Transactional
public class BecarioServiceImpl implements BecarioService{

	@Autowired
	private BecarioDAO becarioDAO;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<BecarioDTO> showAll() {
		List<Becario> becarioList = becarioDAO.findAll();
		List<BecarioDTO> becarioDtoList = new ArrayList<BecarioDTO>();
		for (Becario becario : becarioList) {
			becarioDtoList.add(convertToDto(becario));
		}
		return becarioDtoList;
	}

	@Override
	public BecarioDTO getByDNI(String DNI) {
		return convertToDto(becarioDAO.getBecarioPorDNI(DNI));
	}

	@Override
	public void saveOrUpdate(BecarioDTO becarioDTO) {
		Becario becario = convertToEntity(becarioDTO);
		if(!becario.getDni().isEmpty()){
			becarioDAO.update(becario);
		} else {
			becarioDAO.save(becario);
		}
	}

	private Becario convertToEntity(BecarioDTO becarioDTO){
		return modelMapper.map(becarioDTO, Becario.class);
	}
	
	private BecarioDTO convertToDto(Becario becario){
		return modelMapper.map(becario, BecarioDTO.class);
	}
}
