package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.IES;

@Repository
public class IesDAO extends AbstractHibernateDAO<IES> {
	
	public IesDAO() {
		setClazz(IES.class);
	}
}
