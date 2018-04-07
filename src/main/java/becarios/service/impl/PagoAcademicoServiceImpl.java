package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.PagoAcademicoDAO;
import becarios.model.PagoAcademico;
import becarios.service.PagoAcademicoService;

@Service
@Transactional
public class PagoAcademicoServiceImpl implements PagoAcademicoService {

	@Autowired
	private PagoAcademicoDAO pagoAcademicoDAO;
	
	@Override
	public List<PagoAcademico> listar() {
		return pagoAcademicoDAO.findAll();
	}

	@Override
	public PagoAcademico obtenerPorId(Long id) {
		return pagoAcademicoDAO.findOne(id);
	}

	@Override
	public void actualizar(PagoAcademico pagoAcademico) {
		if(pagoAcademico.getIdPagoAcademico() == 0L || pagoAcademico.getIdPagoAcademico() == null){
			pagoAcademicoDAO.save(pagoAcademico);
		} else {
			pagoAcademicoDAO.update(pagoAcademico);
		}
	}
	
}
