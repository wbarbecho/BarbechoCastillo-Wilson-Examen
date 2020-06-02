package ec.edu.ups.dao;

import java.util.Set;

import ec.edu.ups.modelo.Capitulo;

public interface CapituloDAO extends GenericDAO<Capitulo, Integer> {

	public abstract Capitulo readCapitulo(String numero);

	public abstract Capitulo findByLibro(String numero);

}
