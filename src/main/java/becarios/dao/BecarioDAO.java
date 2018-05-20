
package becarios.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Becario;

@Repository
public class BecarioDAO extends AbstractHibernateDAO<Becario>{
	
	public BecarioDAO() {
		setClazz(Becario.class);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Becario> getBecariosPorBeca(Long idBeca){
		return getCurrentSession()
				.createCriteria(Becario.class)
				.add(Restrictions.eq("beca.idBeca", idBeca))
				.addOrder(Order.asc("idBecario"))
				.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Becario> getBecariosPorDNI(String dni){
		return getCurrentSession()
				.createCriteria(Becario.class)
				.add(Restrictions.eq("dni", dni))
				.addOrder(Order.asc("idBecario"))
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<Becario> getBecariosPorBecaPaginated(Long idBeca, Integer offset, Integer maxResults){
		return getCurrentSession()
				.createCriteria(Becario.class)
				.add(Restrictions.eq("beca.idBeca", idBeca))
				.setFirstResult(offset!=null?offset:0)
				.setMaxResults(maxResults!=null?maxResults:10)
				.addOrder(Order.asc("idBecario"))
				.list();
	}
	
	public Long countByBeca(Long idBeca){
		return (Long) getCurrentSession()
				.createCriteria(Becario.class)
				.add(Restrictions.eq("beca.idBeca", idBeca))
				.setProjection(Projections.rowCount())
				.uniqueResult();
	}
}
