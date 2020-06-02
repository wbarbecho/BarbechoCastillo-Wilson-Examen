package ec.edu.ups.mysql.Jpa;

import javax.persistence.Query;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.modelo.Capitulo;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO {

	public JPACapituloDAO() {
		super(Capitulo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Capitulo readCapitulo(String numero) {
		Query query = em.createNamedQuery("readCapitulo");
		query.setParameter("capitulo", numero);
		Capitulo capitulo = (Capitulo) query.getSingleResult();
		return capitulo;
	}

	@Override
	public Capitulo findByLibro(String numero) {
		Query query = em.createNamedQuery("findByLibro");
		query.setParameter("capitulo", numero);
		Capitulo capitulo = (Capitulo) query.getSingleResult();
		return capitulo;
	}

}