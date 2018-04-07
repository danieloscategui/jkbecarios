package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.AsesorDAO;
import becarios.model.Asesor;
import becarios.service.AsesorService;

@Service
@Transactional
public class AsesorServiceImpl implements AsesorService {

	@Autowired
	private AsesorDAO asesorDAO;
	
	public void setAsesorDAO(AsesorDAO asesorDAO){
		this.asesorDAO = asesorDAO;
	}
	
	
	@Override
	public List<Asesor> listar() {
		return asesorDAO.findAll();
	}


	@Override
	public Asesor obtenerPorId(Long id) {
		return asesorDAO.findOne(id);
	}


	@Override
	public void actualizar(Asesor asesor) {
		
		if(asesor.getIdAsesor() == 0L || asesor.getIdAsesor() == null) {
			asesorDAO.save(asesor);
		} else {
			asesorDAO.update(asesor);
		}
		
	}

}
