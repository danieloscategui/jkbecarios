package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.TramiteDAO;
import becarios.model.Tramite;
import becarios.service.TramiteService;

@Service
public class TramiteServiceImpl implements TramiteService{

	@Autowired
	private TramiteDAO tramiteDAO;

//	@Autowired
//	private ModelMapper modelMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Tramite> showAll() {
		return tramiteDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Tramite getById(Long id) {
		return tramiteDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Tramite tramite) {
		if(tramite.isNew()){
			tramiteDAO.save(tramite);
		} else {
			tramiteDAO.update(tramite);
		}
	}

	@Override
	public List<Tramite> showTramitesPorBecario(String dniBecario) {
		return tramiteDAO.getTramitesPorBecario(dniBecario);
	}

	/*
	private TramiteDTO convertToEntity(TramiteDTO tramiteDTO){
		return modelMapper.map(tramiteDTO, TramiteDTO.class);
	}
	
	private TramiteDTO convertToDto(TramiteDTO tramite){
		return modelMapper.map(tramite, TramiteDTO.class);
	}
	*/
}
