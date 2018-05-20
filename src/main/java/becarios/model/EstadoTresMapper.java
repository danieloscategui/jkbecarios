package becarios.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EstadoTresMapper implements RowMapper<EstadoTres> {

	@Override
	public EstadoTres mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadoTres estadoTres = new EstadoTres();
		estadoTres.setIdEstadoTres(rs.getInt("id_estado_tres"));
		estadoTres.setDescripcion(rs.getString("descripcion"));
		return estadoTres;
	}

}
