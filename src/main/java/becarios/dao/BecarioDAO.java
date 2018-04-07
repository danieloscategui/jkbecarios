
package becarios.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Becario;

@Repository
public class BecarioDAO extends AbstractHibernateDAO<Becario>{
	
	public BecarioDAO() {
		setClazz(Becario.class);
		
	}
	
	public List<Becario> getBecariosPorBeca(Long idBeca){
		Session session = getCurrentSession();
		//WORK OUT THIS
		@SuppressWarnings("unchecked")
		List<Becario> becarios = (List<Becario>)session.createQuery("from Becario").list();
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
