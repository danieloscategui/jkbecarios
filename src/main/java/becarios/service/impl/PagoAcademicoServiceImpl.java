package becarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.controller.dto.PagoAcademicoDTO;
import becarios.dao.PagoAcademicoDAO;
import becarios.model.PagoAcademico;
import becarios.service.PagoAcademicoService;

@Service
@Transactional
public class PagoAcademicoServiceImpl implements PagoAcademicoService {

	@Autowired
	private PagoAcademicoDAO pagoAcademicoDAO;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public List<PagoAcademicoDTO> showAll() {
		List<PagoAcademico> pagoAcademicoList = pagoAcademicoDAO.findAll();
		List<PagoAcademicoDTO> pagoAcademicoDtoList = new ArrayList<PagoAcademicoDTO>();
		for (PagoAcademico pagoAcademico : pagoAcademicoList) {
			pagoAcademicoDtoList.add(convertToDto(pagoAcademico));
		}
		return pagoAcademicoDtoList;
	}

	@Override
	public PagoAcademicoDTO getById(Long id) {
		return convertToDto(pagoAcademicoDAO.findOne(id));
	}

	@Override
	public void saveOrUpdate(PagoAcademicoDTO pagoAcademicoDTO) {
		PagoAcademico pagoAcademico = convertToEntity(pagoAcademicoDTO);
		if(pagoAcademico.getIdPagoAcademico() != null){
			pagoAcademicoDAO.update(pagoAcademico);
		} else {
			pagoAcademicoDAO.save(pagoAcademico);
		}
	}
	
	private PagoAcademico convertToEntity(PagoAcademicoDTO pagoAcademicoDTO){
		return modelMapper.map(pagoAcademicoDTO, PagoAcademico.class);
	}
	
	private PagoAcademicoDTO convertToDto(PagoAcademico pagoAcademico){
		return modelMapper.map(pagoAcademico, PagoAcademicoDTO.class);
	}
}
