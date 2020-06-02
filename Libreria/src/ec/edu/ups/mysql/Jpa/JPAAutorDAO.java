package ec.edu.ups.mysql.Jpa;

import javax.persistence.Query;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.modelo.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO {

	public JPAAutorDAO() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Autor read(int numero) {
		Query query = em.createNamedQuery("read");
		query.setParameter("autor", numero);
		Autor autor = (Autor) query.getSingleResult();
		return autor;
	}

}