package becarios.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Beca;
import becarios.model.VistaBecas;

@Repository
public class BecaDAO extends AbstractHibernateDAO<Beca> {
	public BecaDAO() {
		setClazz(Beca.class);
	}
	@SuppressWarnings("unchecked")
	public List<VistaBecas> getVistaBecas(){
		return getCurrentSession().createQuery("from VistaBecas").list();
	};
}
