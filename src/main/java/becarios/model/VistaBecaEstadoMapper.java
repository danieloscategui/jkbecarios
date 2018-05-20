package becarios.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VistaBecaEstadoMapper implements RowMapper<VistaBecasEstado> {

	@Override
	public VistaBecasEstado mapRow(ResultSet rs, int arg1) throws SQLException {
		VistaBecasEstado vistaBecasEstado = new VistaBecasEstado();
		vistaBecasEstado.setAsesor(rs.getString("asesor"));
		vistaBecasEstado.setConvocatoria(rs.getString("convocatoria"));
		vistaBecasEstado.setModalidad(rs.getString("modalidad"));
		vistaBecasEstado.setIes(rs.getString("ies_nombre"));
		vistaBecasEstado.setCarrera(rs.getString("carrera"));
		vistaBecasEstado.setEstadoUno(rs.getString("estado_uno"));
		vistaBecasEstado.setEstadoDos(rs.getString("estado_dos"));
		vistaBecasEstado.setEstadoTres(rs.getString("estado_tres"));
		vistaBecasEstado.setTotalBecarios(rs.getInt("t_becarios"));
		return vistaBecasEstado;
	}
	
}
