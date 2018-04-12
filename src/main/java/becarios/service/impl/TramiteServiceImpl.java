package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.TramiteDTO;
import becarios.dao.TramiteDAO;
import becarios.model.Tramite;
import becarios.service.TramiteService;

@Service
@Transactional
public class TramiteServiceImpl implements TramiteService{

	@Autowired
	private TramiteDAO tramiteDAO;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<TramiteDTO> showAll() {
		List<Tramite> tramiteList = tramiteDAO.findAll();
		List<TramiteDTO> tramiteDtoList = new ArrayList<TramiteDTO>();
		for (Tramite tramite : tramiteList) {
			tramiteDtoList.add(convertToDto(tramite));
		}
		return tramiteDtoList;
	}

	@Override
	public TramiteDTO getById(Long id) {
		return convertToDto(tramiteDAO.findOne(id));
	}

	@Override
	public void saveOrUpdate(TramiteDTO tramiteDTO) {
		Tramite tramite = convertToEntity(tramiteDTO);
		if(tramite.getIdTramite() != null){
			tramiteDAO.update(tramite);
		} else {
			tramiteDAO.save(tramite);
		}
	}
	
	private Tramite convertToEntity(TramiteDTO tramiteDTO){
		return modelMapper.map(tramiteDTO, Tramite.class);
	}
	
	private TramiteDTO convertToDto(Tramite tramite){
		return modelMapper.map(tramite, TramiteDTO.class);
	}
}
