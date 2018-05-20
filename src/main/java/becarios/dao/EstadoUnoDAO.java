package becarios.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.EstadoUno;
import becarios.model.EstadoUnoMapper;

@Repository
public class EstadoUnoDAO extends AbstractHibernateDAO<EstadoUno>{
	
	private static final Logger logger = LoggerFactory.getLogger(EstadoUnoDAO.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public EstadoUnoDAO() {
		logger.debug("Setting class definition for EstadoUnoDAO.");
		setClazz(EstadoUno.class);
	}
	
	public List<EstadoUno> jdbcFindAll(){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id_estado_uno, descripcion ");
		sql.append("FROM estado_uno ");
		sql.append("ORDER BY 1, 2");
		return jdbcTemplate.query(sql.toString(), new EstadoUnoMapper());
	}
	
}
