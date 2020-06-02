package ec.edu.ups.dao;

import java.util.Set;

import ec.edu.ups.modelo.Autor;

public interface AutorDAO extends GenericDAO<Autor, Integer> {

	public abstract Autor read(int numero);

}
