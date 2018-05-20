package becarios.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EstadoDosMapper implements RowMapper<EstadoDos> {

	@Override
	public EstadoDos mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadoDos estadoDos = new EstadoDos();
		estadoDos.setIdEstadoDos(rs.getInt("id_estado_dos"));
		estadoDos.setDescripcion(rs.getString("descripcion"));
		return estadoDos;
	}

}
