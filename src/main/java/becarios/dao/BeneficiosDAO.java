package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Beneficios;

@Repository
public class BeneficiosDAO extends AbstractHibernateDAO<Beneficios> {
	public BeneficiosDAO() {
		setClazz(Beneficios.class);
	}
}
