package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.AsesorDAO;
import becarios.model.Asesor;
import becarios.service.AsesorService;

@Service
public class AsesorServiceImpl implements AsesorService {

	@Autowired
	private AsesorDAO asesorDAO;

//	@Autowired
//	private ModelMapper modelMapper;

	@Override
	@Transactional(readOnly = true)
	public List<Asesor> showAll() {
		return asesorDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Asesor getById(Long id) {
		return asesorDAO.findOne(id);
	}


	@Override
	@Transactional
	public void saveOrUpdate(Asesor asesor) {
		if (asesor.isNew()) {
			asesorDAO.save(asesor);
		} else {
			asesorDAO.update(asesor);
		}
	}
	
	/*
	private Asesor convertToEntity(AsesorDTO asesorDTO) {
		return modelMapper.map(asesorDTO, Asesor.class);
	}

	private AsesorDTO convertToDto(Asesor asesor) {
		return modelMapper.map(asesor, AsesorDTO.class);
	}
	*/
}
