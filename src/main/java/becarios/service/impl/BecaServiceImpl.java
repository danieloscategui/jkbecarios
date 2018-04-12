package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.BecaDTO;
import becarios.dao.BecaDAO;
import becarios.model.Beca;
import becarios.service.BecaService;

@Service
@Transactional
public class BecaServiceImpl implements BecaService {

	@Autowired
	private BecaDAO becaDAO;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<BecaDTO> showAll() {
		List<Beca> becaList = becaDAO.findAll();
		List<BecaDTO> becaDtoList = new ArrayList<BecaDTO>();
		for (Beca beca : becaList) {
			becaDtoList.add(convertToDto(beca));
		}
		return becaDtoList;
	}

	@Override
	public BecaDTO getById(Long id) {
		return convertToDto(becaDAO.findOne(id));
	}

	@Override
	public void saveOrUpdate(BecaDTO becaDTO) {
		Beca beca = convertToEntity(becaDTO);
		if (beca.getIdBeca() != null) {
			becaDAO.update(beca);
		} else {
			becaDAO.save(beca);
		}
	}
	
	private Beca convertToEntity(BecaDTO becaDTO){
		return modelMapper.map(becaDTO, Beca.class);
	}
	
	private BecaDTO convertToDto(Beca beca){
		return modelMapper.map(beca, BecaDTO.class);
	}
}
