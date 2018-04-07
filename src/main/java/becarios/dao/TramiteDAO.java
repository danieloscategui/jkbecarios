package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Tramite;

@Repository
public class TramiteDAO extends AbstractHibernateDAO<Tramite>{
	public TramiteDAO() {
		setClazz(Tramite.class);
	}
}
