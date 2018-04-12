package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.IesDTO;
import becarios.dao.IesDAO;
import becarios.model.IES;
import becarios.service.IesService;

@Service
@Transactional
public class IesServiceImpl implements IesService{
	
	@Autowired
	private IesDAO iesDAO;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public List<IesDTO> showAll() {
		List<IES> iesList = iesDAO.findAll();
		List<IesDTO> iesDtoList = new ArrayList<>();
		for (IES ies : iesList) {
			iesDtoList.add(convertToDto(ies));
		}
		return iesDtoList;
		
	}

	@Override
	public IesDTO getById(Long id) {
		return convertToDto(iesDAO.findOne(id));
	}

	@Override
	public void saveOrUpdate(IesDTO iesDTO) {
		IES ies = convertToEntity(iesDTO);
		if(ies.getIdIES() != null){
			iesDAO.update(ies);
		} else {
			iesDAO.save(ies);
		}
	}
	
	//http://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application

	private IES convertToEntity(IesDTO iesDTO){
		return modelMapper.map(iesDTO, IES.class);
	}
	
	private IesDTO convertToDto(IES ies){
		return modelMapper.map(ies, IesDTO.class);
	}
	
}
