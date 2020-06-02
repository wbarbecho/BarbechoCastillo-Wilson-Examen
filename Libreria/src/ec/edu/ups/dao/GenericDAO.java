package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;

public interface GenericDAO<T, ID> {

	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();

	Autor readAutor(Autor autor);

	List<Capitulo> findByLibro(Capitulo capitulo);

	List<Capitulo> findCapitulos(Capitulo capitulo);

}
