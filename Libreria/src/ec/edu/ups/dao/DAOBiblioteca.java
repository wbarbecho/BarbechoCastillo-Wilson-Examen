package ec.edu.ups.dao;

import ec.edu.ups.mysql.Jpa.JPADAOGuia;

public abstract class DAOBiblioteca {

	protected static DAOBiblioteca factory = new JPADAOGuia();

	/**
	 * @return the guia
	 */
	public static DAOBiblioteca getGuia() {
		return factory;
	}

	public abstract AutorDAO getAutorDAO();

	public abstract CapituloDAO getCapituloDAO();

	public abstract LibroDAO getLibroDAO();
}