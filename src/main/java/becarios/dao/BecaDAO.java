package becarios.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import becarios.dao.base.AbstractHibernateDAO;
import becarios.model.Beca;
import becarios.model.VistaBecaEstadoMapper;
import becarios.model.VistaBecasEstado;

@Repository
public class BecaDAO extends AbstractHibernateDAO<Beca> {
	
	private static final Logger logger = LoggerFactory.getLogger(BecaDAO.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public BecaDAO() {
		setClazz(Beca.class);
	}

	public List<VistaBecasEstado> getVistaBecas(){
		return jdbcTemplate.query("SELECT * FROM vista_becas_estado",  new VistaBecaEstadoMapper());
	};
	
	
	public List<String> getConvocatorias(){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT DISTINCT convocatoria ");
		sql.append("FROM becas ORDER BY convocatoria ASC");
		return jdbcTemplate.queryForList(sql.toString(), String.class);
	}
	
	public List<String> getModalidades(String convocatoria){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT DISTINCT modalidad ");
		sql.append("FROM becas WHERE convocatoria = ? ");
		sql.append("ORDER BY modalidad ASC");
		return jdbcTemplate.queryForList(sql.toString(), String.class, convocatoria);
	}
	
	public List<String> getIes(String convocatoria, String modalidad){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT DISTINCT i.ies_nombre ");
		sql.append("FROM ies i ");
		sql.append("INNER JOIN becas b ON i.id_ies = b.id_ies ");
		sql.append("WHERE b.convocatoria = ? AND b.modalidad = ? ");
		sql.append("ORDER BY i.ies_nombre ASC");
		return jdbcTemplate.queryForList(sql.toString(), String.class, convocatoria, modalidad);
	}
	
	public List<String> getCarreras(String convocatoria, String modalidad, String ies){
		logger.debug("get carreras por convocatoria {}, modalidad {} e Ies {}", convocatoria, modalidad, ies);
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT DISTINCT b.carrera ");
		sql.append("FROM becas b ");
		sql.append("INNER JOIN ies i ON b.id_ies = i.id_ies ");
		sql.append("WHERE b.convocatoria = ? AND b.modalidad = ? AND i.ies_nombre = ? ");
		sql.append("ORDER BY b.carrera ASC");
		return jdbcTemplate.queryForList(sql.toString(), String.class, convocatoria, modalidad, ies);
	}
	
}
