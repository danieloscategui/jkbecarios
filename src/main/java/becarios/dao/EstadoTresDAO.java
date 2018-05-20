package becarios.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.EstadoTres;
import becarios.model.EstadoTresMapper;

@Repository
public class EstadoTresDAO extends AbstractHibernateDAO<EstadoTres>{
	private static final Logger logger = LoggerFactory.getLogger(EstadoTresDAO.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public EstadoTresDAO() {
		logger.debug("Setting class definition for EstadoTresDAO");
		setClazz(EstadoTres.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<EstadoTres> getListEstadoTresByEstadoDos(Integer idEstadoDos){
		return getCurrentSession()
				.createCriteria(EstadoTres.class)
				.add(Restrictions.eq("estadoDos.idEstadoDos", idEstadoDos))
				.addOrder(Order.asc("idEstadoTres"))
				.list();
	}
	
	public List<EstadoTres> getJdbcEstadoTresByEstadoDos(Integer idEstadoDos){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id_estado_tres, descripcion ");
		sql.append("FROM estado_tres ");
		sql.append("WHERE id_estado_dos = ? ");
		sql.append("ORDER BY 1, 2");
		return jdbcTemplate.query(sql.toString(), new EstadoTresMapper(), idEstadoDos);
	}
}
