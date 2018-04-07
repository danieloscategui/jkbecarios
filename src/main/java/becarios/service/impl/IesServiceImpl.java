package becarios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.IesDAO;
import becarios.model.IES;
import becarios.service.IesService;

@Service
@Transactional
public class IesServiceImpl implements IesService{
	
	@Autowired
	private IesDAO iesDAO;
	
	@Override
	public List<IES> listar() {
		return iesDAO.findAll();
	}

	@Override
	public IES obtenerPorId(Long id) {
		return iesDAO.findOne(id);
	}

	@Override
	public void actualizar(IES ies) {
		if(ies.getIdIES() == 0L || ies.getIdIES() == null){
			iesDAO.save(ies);
		} else {
			iesDAO.update(ies);
		}
	}


}
