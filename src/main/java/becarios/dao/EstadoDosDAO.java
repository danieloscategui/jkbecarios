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
import becarios.model.EstadoDos;
import becarios.model.EstadoDosMapper;

@Repository
public class EstadoDosDAO extends AbstractHibernateDAO<EstadoDos> {
	private static final Logger logger = LoggerFactory.getLogger(EstadoDosDAO.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public EstadoDosDAO() {
		logger.debug("Setting class definition for EstadoDosDAO");
		setClazz(EstadoDos.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<EstadoDos> getListEstadoDosByEstadoUno(Integer idEstadoUno){
		return getCurrentSession()
				.createCriteria(EstadoDos.class)
				.add(Restrictions.eq("estadoUno.idEstadoUno", idEstadoUno))
				.addOrder(Order.asc("idEstadoDos"))
				.list();
	}
	
	public List<EstadoDos> getJdbcEstadoDosByEstadoUno(Integer idEstadoUno){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id_estado_dos, descripcion ");
		sql.append("FROM estado_dos ");
		sql.append("WHERE id_estado_uno = ? ");
		sql.append("ORDER BY 1, 2");
		return jdbcTemplate.query(sql.toString(), new EstadoDosMapper(), idEstadoUno);
	}
	
}
