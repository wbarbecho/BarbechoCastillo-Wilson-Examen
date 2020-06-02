package ec.edu.ups.mysql.Jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
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

	public List<Libro> getLibrosAutorCapitulo(Autor autor, Capitulo capitulo) {
		String query = "Select l from libro l, capitulo c " + "where l.id = c.id " + "and c.autor = :autor "
				+ "and c.titulo = :titulo";

		TypedQuery<Libro> typedQuery = em.createQuery(query, Libro.class);
		typedQuery.setParameter("autor", autor);
		typedQuery.setParameter("capitulo", capitulo);

		List<Libro> librosSet = typedQuery.getResultList();
		System.out.println(librosSet.toString());
		return librosSet;

	}

}