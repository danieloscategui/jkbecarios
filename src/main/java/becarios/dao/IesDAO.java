package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Ies;

@Repository
public class IesDAO extends AbstractHibernateDAO<Ies> {
	
	public IesDAO() {
		setClazz(Ies.class);
	}
}
