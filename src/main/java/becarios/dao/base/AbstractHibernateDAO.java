package becarios.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractHibernateDAO<T extends Serializable> {
	
	private Class<T> clazz;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setClazz(final Class<T> clazzToSet){
		clazz = clazzToSet;
	}
	
	@SuppressWarnings("unchecked")
	public T findOne(final Long id){
		return (T) getCurrentSession().get(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}
	
	public void save(final T entity){
		getCurrentSession().persist(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T update(final T entity){
		return (T) getCurrentSession().merge(entity);
	}
	
	public void delete(final T entity){
		getCurrentSession().delete(entity);
	}
	
	public void deleteById(final Long id){
		final T entity = findOne(id);
		delete(entity);
	}
	
	protected final Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
}
