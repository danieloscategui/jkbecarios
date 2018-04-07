package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Beca;

@Repository
public class BecaDAO extends AbstractHibernateDAO<Beca> {
	public BecaDAO() {
		setClazz(Beca.class);
	}
}
