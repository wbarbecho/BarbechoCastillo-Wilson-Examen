package ec.edu.ups.dao;

import java.util.Set;

import ec.edu.ups.modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, String> {

	public abstract Libro readByisbn(String numero);

}
