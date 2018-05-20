package becarios.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import becarios.dao.BecarioDAO;
import becarios.dao.EstadoDosDAO;
import becarios.dao.EstadoTresDAO;
import becarios.dao.EstadoUnoDAO;
import becarios.model.Becario;
import becarios.model.BecarioEstado;
import becarios.model.EstadoDos;
import becarios.model.EstadoTres;
import becarios.model.EstadoUno;
import becarios.service.BecarioService;

@Service
public class BecarioServiceImpl implements BecarioService {

	private static final Logger logger = LoggerFactory.getLogger(BecarioServiceImpl.class);
	
	@Autowired
	private BecarioDAO becarioDAO;

	@Autowired
	private EstadoUnoDAO estadoUnoDAO;

	@Autowired
	private EstadoDosDAO estadoDosDAO;

	@Autowired
	private EstadoTresDAO estadoTresDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Becario> showAll() {
		return becarioDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Becario> getByDNI(String DNI) {
		return becarioDAO.getBecariosPorDNI(DNI);
	}

	@Override
	@Transactional
	public void saveOrUpdate(Becario becario) {
		if (becario.isNew()) {
			becarioDAO.save(becario);
		} else {
			becarioDAO.update(becario);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Becario> showBecariosPorBeca(Long idBeca) {
		return becarioDAO.getBecariosPorBeca(idBeca);
	}

	@Override
	@Transactional
	public void updateBecarioEstado(Long idBecario, BecarioEstado becarioEstado, String observaciones) {
		Becario becario = becarioDAO.findOne(idBecario);
		
		if(becarioEstado.getEstadoUno() != null && becarioEstado.getEstadoUno() > 0)
			becario.setEstadoUno(estadoUnoDAO.findOne(becarioEstado.getEstadoUno()));
		else
			becario.setEstadoUno(null);
		
		if (becarioEstado.getEstadoDos() != null && becarioEstado.getEstadoDos() > 0)
			becario.setEstadoDos(becarioEstado.getEstadoDos());
		else
			becario.setEstadoDos(null);
		
		if (becarioEstado.getEstadoTres() != null && becarioEstado.getEstadoTres() > 0)
			becario.setEstadoTres(becarioEstado.getEstadoTres());
		else
			becario.setEstadoTres(null);

		becario.setObservaciones(observaciones);
		
		becarioDAO.update(becario);
	}

	@Override
	@Transactional(readOnly=true)
	public Becario getById(Long idBecario) {
		return becarioDAO.findOne(idBecario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Becario> showBecariosPorBecaPaginated(Long idBeca, Integer offset, Integer maxResults) {
		return becarioDAO.getBecariosPorBecaPaginated(idBeca, offset, maxResults);
	}

	@Override
	@Transactional(readOnly = true)
	public Long count() {
		return becarioDAO.count();
	}

	@Override
	@Transactional(readOnly = true)
	public Long countByBeca(Long idBeca) {
		return becarioDAO.countByBeca(idBeca);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoUno> getListEstadoUno() {
		return estadoUnoDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoDos> getListEstadoDos(Integer idEstadoUno) {
		return estadoDosDAO.getListEstadoDosByEstadoUno(idEstadoUno);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoTres> getListEstadoTres(Integer idEstadoDos) {
		return estadoTresDAO.getListEstadoTresByEstadoDos(idEstadoDos);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoUno> getJdbcEstadoUno() {
		return estadoUnoDAO.jdbcFindAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoDos> getJdbcEstadoDos(Integer idEstadoUno) {
		return estadoDosDAO.getJdbcEstadoDosByEstadoUno(idEstadoUno);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstadoTres> getJdbcEstadoTres(Integer idEstadoDos) {
		return estadoTresDAO.getJdbcEstadoTresByEstadoDos(idEstadoDos);
	}

	@Override
	@Transactional(readOnly = true)
	public EstadoUno getEstadoUno(Integer idEstadoUno) {
		return estadoUnoDAO.findOne(idEstadoUno);
	}
}
