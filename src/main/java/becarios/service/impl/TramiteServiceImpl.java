package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.TramiteDAO;
import becarios.model.Tramite;
import becarios.service.TramiteService;

@Service
@Transactional
public class TramiteServiceImpl implements TramiteService{

	@Autowired
	private TramiteDAO tramiteDAO;
	
	@Override
	public List<Tramite> listar() {
		return tramiteDAO.findAll();
	}

	@Override
	public Tramite obtenerPorId(Long id) {
		return tramiteDAO.findOne(id);
	}

	@Override
	public void actualizar(Tramite tramite) {
		if(tramite.getIdTramite() == 0L || tramite.getIdTramite() == null){
			tramiteDAO.save(tramite);
		} else {
			tramiteDAO.update(tramite)
		}
	}

}
