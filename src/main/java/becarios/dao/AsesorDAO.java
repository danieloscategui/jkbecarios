package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Asesor;

@Repository
public class AsesorDAO extends AbstractHibernateDAO<Asesor>{

	public AsesorDAO() {
		setClazz(Asesor.class);
	}
	
}
