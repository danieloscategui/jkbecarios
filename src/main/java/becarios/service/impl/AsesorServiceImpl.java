package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.AsesorDTO;
import becarios.dao.AsesorDAO;
import becarios.model.Asesor;
import becarios.service.AsesorService;

@Service
@Transactional
public class AsesorServiceImpl implements AsesorService {

	@Autowired
	private AsesorDAO asesorDAO;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<AsesorDTO> showAll() {
		List<Asesor> asesorList = asesorDAO.findAll();
		List<AsesorDTO> asesorDtoList = new ArrayList<AsesorDTO>();
		for (Asesor asesor : asesorList) {
			asesorDtoList.add(convertToDto(asesor));
		}
		return asesorDtoList;
	}


	@Override
	public AsesorDTO getById(Long id) {
		return convertToDto(asesorDAO.findOne(id));
	}


	@Override
	public void saveOrUpdate(AsesorDTO asesorDTO) {
		Asesor asesor = convertToEntity(asesorDTO);
		if(asesor.getIdAsesor() != null) {
			asesorDAO.update(asesor);
		} else {
			asesorDAO.save(asesor);
		}
		
	}

	private Asesor convertToEntity(AsesorDTO asesorDTO){
		return modelMapper.map(asesorDTO, Asesor.class);
	}
	
	private AsesorDTO convertToDto(Asesor asesor){
		return modelMapper.map(asesor, AsesorDTO.class);
	}
}
