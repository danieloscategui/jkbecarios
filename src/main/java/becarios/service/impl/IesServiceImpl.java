
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
	
	@Override
	@Transactional(readOnly=true)
	public List<Ies> showAll() {
		return iesDAO.findAll();
		
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Ies> showAllPaginated(Integer offset, Integer maxResults) {
		return iesDAO.findAllPaginated(offset, maxResults);
		
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

	@Override
	@Transactional(readOnly=true)
	public Long count() {
		return iesDAO.count();
	}
	
	
}
