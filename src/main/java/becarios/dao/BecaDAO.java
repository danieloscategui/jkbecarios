package becarios.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Beca;
import becarios.model.VistaBecaEstadoMapper;
import becarios.model.VistaBecasEstado;

@Repository
public class BecaDAO extends AbstractHibernateDAO<Beca> {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public BecaDAO() {
		setClazz(Beca.class);
	}

	public List<VistaBecasEstado> getVistaBecas(){
		return jdbcTemplate.query("SELECT * FROM vista_becas_estado",  new VistaBecaEstadoMapper());
	};
}
