package becarios.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import becarios.model.Asesor;
import becarios.model.Becario;

@Repository
public class AsesorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Asesor> getAsesores(){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Asesor> asesores = (List<Asesor>)session.createQuery("from Asesor").list();
		return asesores;
	}
	
	private Asesor getAsesorPorId(Long idAsesor){
		Session session = this.sessionFactory.getCurrentSession();
		Asesor asesor = (Asesor) session.get(Asesor.class, idAsesor);
		return asesor;
	}
	
	public void addAsesor(Asesor asesor){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(asesor);
	}
	
	public void updateAsesor(Asesor asesor){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(asesor);
	}
	
	public void deleteAsesor(Long idAsesor){
		Session session = this.sessionFactory.getCurrentSession();
		Asesor asesor = getAsesorPorId(idAsesor);
		
		//Check if asesor doesn't have beca
//		boolean AsesorTieneBecas = session.createQuery("from Becas where"); 
		if (asesor!= null){
			session.delete(asesor);
		}
	}
	
}
