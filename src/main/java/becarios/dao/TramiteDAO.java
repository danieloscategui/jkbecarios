package becarios.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Tramite;

@Repository
public class TramiteDAO extends AbstractHibernateDAO<Tramite>{
	
	public TramiteDAO() {
		setClazz(Tramite.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Tramite> getTramitesPorBecario(String dniBecario){
		Query query = getCurrentSession().createQuery("from Tramite where becario.dni = :dniBecario");
		query.setParameter("dniBecario", dniBecario);
		return (List<Tramite>)query.list();
	}
}
