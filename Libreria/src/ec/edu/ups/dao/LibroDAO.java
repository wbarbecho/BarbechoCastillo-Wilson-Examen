package ec.edu.ups.dao;

import java.util.Set;

import ec.edu.ups.modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, Integer> {

	public abstract Libro read(int numero);

}
