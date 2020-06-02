package ec.edu.ups.mysql.Jpa;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.dao.DAOBiblioteca;
import ec.edu.ups.dao.LibroDAO;

public class JPADAOGuia extends DAOBiblioteca {

	@Override
	public AutorDAO getAutorDAO(){
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}


	@Override
	public CapituloDAO getCapituloDAO() {
		// TODO Auto-generated method stub
		return new JPACapituloDAO();
	}


	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}


}
