package ec.edu.ups.dao;

import ec.edu.ups.mysql.Jpa.JPADAOGuia;

public abstract class DAOBiblioteca {

	protected static DAOBiblioteca guia = new JPADAOGuia();

	/**
	 * @return the guia
	 */
	public static DAOBiblioteca getGuia() {
		return guia;
	}

	public abstract AutorDAO getAutorDAO();

	public abstract CapituloDAO getCapituloDAO();

	public abstract LibroDAO libroDAO();
}