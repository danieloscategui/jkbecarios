package becarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecarioDAO;
import becarios.model.Becario;

@Service
public class DashboardService {
	
	@Autowired
	private BecarioDAO becarioDAO;
	
	@Transactional
	public List<Becario> listarBecarios(){
		return becarioDAO.getBecariosPorBeca(new Long(1L));
	}
}
