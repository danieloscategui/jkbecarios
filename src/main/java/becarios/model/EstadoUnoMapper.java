package becarios.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EstadoUnoMapper implements RowMapper<EstadoUno> {

	@Override
	public EstadoUno mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadoUno estadoUno = new EstadoUno();
		estadoUno.setIdEstadoUno(rs.getInt("id_estado_uno"));
		estadoUno.setDescripcion(rs.getString("descripcion"));
		return estadoUno;
	}
	
}
