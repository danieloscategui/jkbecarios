package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.IesDAO;
import becarios.model.Ies;
import becarios.service.IesService;

@Service
public class IesServiceImpl implements IesService{
	
	@Autowired
	private IesDAO iesDAO;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<Ies> showAll() {
		return iesDAO.findAll();
		
	}

	@Override
	@Transactional(readOnly=true)
	public Ies getById(Long id) {
		Ies ies = iesDAO.findOne(id);
		return ies;
		//		return iesDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Ies ies) {
		if(ies.isNew()){
			iesDAO.save(ies);
		} else {
			iesDAO.update(ies);
		}
	}
	
	//http://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application
	/*
	private Ies convertToEntity(IesDTO iesDTO){
		return modelMapper.map(iesDTO, Ies.class);
	}
	
	private IesDTO convertToDto(Ies ies){
		return modelMapper.map(ies, IesDTO.class);
	}
	*/
}
