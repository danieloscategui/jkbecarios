
package becarios.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Becario;

@Repository
public class BecarioDAO extends AbstractHibernateDAO<Becario>{
	
	public BecarioDAO() {
		setClazz(Becario.class);
		
	}
	
	public List<Becario> getBecariosPorBeca(Long idBeca){
		Query query = getCurrentSession().createQuery("from Becario where beca.idBeca = :idBeca");
		query.setParameter("idBeca", idBeca);
		@SuppressWarnings("unchecked")
		List<Becario> becarios = (List<Becario>)query.list();
		return becarios;
	}
	
	
	
	public Becario getBecarioPorDNI(String dni){
		return (Becario) getCurrentSession().get(Becario.class, dni);
	}
	
	public void deleteBecario(String dni){
		/*
		Session session = this.sessionFactory.getCurrentSession();
		Becario becario = getBecarioPorDNI(dni);
		if (becario != null){
			session.delete(becario);
		}
		*/
		final Becario becario = getBecarioPorDNI(dni);
		delete(becario);
	}
	
}
