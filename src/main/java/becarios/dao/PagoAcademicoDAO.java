package becarios.dao;

import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.PagoAcademico;

@Repository
public class PagoAcademicoDAO extends AbstractHibernateDAO<PagoAcademico>{
	public PagoAcademicoDAO() {
		setClazz(PagoAcademico.class);
	}
}
