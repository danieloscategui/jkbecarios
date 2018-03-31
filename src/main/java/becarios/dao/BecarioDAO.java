package becarios.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import becarios.model.Becario;

@Repository
public class BecarioDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Becario> getBecariosPorBeca(Long idBeca){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Becario> becarios = (List<Becario>)session.createQuery("from Becario").list();
		return becarios;
	}
	
	public Becario getBecarioPorDNI(String dni){
		Session session = this.sessionFactory.getCurrentSession();
		Becario becario = (Becario) session.get(Becario.class, dni);
		return becario;
	}
	
	public void addBecario(Becario becario){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(becario);
	}
	
	public void updateBecario(Becario becario){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(becario);
	}
	
	public void deleteBecario(String dni){
		Session session = this.sessionFactory.getCurrentSession();
		Becario becario = getBecarioPorDNI(dni);
		if (becario != null){
			session.delete(becario);
		}
	}
	
}
