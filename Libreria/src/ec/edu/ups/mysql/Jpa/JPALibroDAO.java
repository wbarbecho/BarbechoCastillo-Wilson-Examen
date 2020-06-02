package ec.edu.ups.mysql.Jpa;

import javax.persistence.Query;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, String> implements LibroDAO {

	public JPALibroDAO() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Libro readByisbn(String numero) {
		Query query = em.createNamedQuery("readByisbn");

		query.setParameter("libro", numero);
		Libro libro = (Libro) query.getSingleResult();
		return libro;
	}

}