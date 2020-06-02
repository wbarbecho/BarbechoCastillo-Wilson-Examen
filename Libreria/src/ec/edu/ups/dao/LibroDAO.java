package ec.edu.ups.dao;

import java.util.List;
import java.util.Set;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, String> {

	public abstract Libro readByisbn(String numero);
	public List<Libro> getLibrosAutorCapitulo(Autor autor, Capitulo capitulo);
}
