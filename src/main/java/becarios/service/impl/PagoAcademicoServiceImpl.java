package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.PagoAcademicoDAO;
import becarios.model.PagoAcademico;
import becarios.service.PagoAcademicoService;

@Service
public class PagoAcademicoServiceImpl implements PagoAcademicoService {

	@Autowired
	private PagoAcademicoDAO pagoAcademicoDAO;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<PagoAcademico> showAll() {
		return pagoAcademicoDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public PagoAcademico getById(Long id) {
		return pagoAcademicoDAO.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrUpdate(PagoAcademico pagoAcademico) {
		if(pagoAcademico.isNew()){
			pagoAcademicoDAO.save(pagoAcademico);
		} else {
			pagoAcademicoDAO.update(pagoAcademico);
		}
	}
	
	/*
	private PagoAcademico convertToEntity(PagoAcademicoDTO pagoAcademicoDTO){
		return modelMapper.map(pagoAcademicoDTO, PagoAcademico.class);
	}
	
	private PagoAcademicoDTO convertToDto(PagoAcademico pagoAcademico){
		return modelMapper.map(pagoAcademico, PagoAcademicoDTO.class);
	}
	*/
}
