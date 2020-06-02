package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.mysql.Jpa.JPADAOGuia;

/**
 * Servlet implementation class ServletLibro
 */
@WebServlet("/ServletLibro")
public class ServletLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLibro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("entra");
		JPADAOGuia.getGuia().getLibroDAO().create(new Libro (0, "libro0", "000m", 10));
		JPADAOGuia.getGuia().getLibroDAO().create(new Libro (1, "libro1", "111m", 11));
		JPADAOGuia.getGuia().getAutorDAO().create(new Autor(0, "autor0", "naci0", null));
		JPADAOGuia.getGuia().getAutorDAO().create(new Autor(2, "autor1", "naci1", null));
		System.out.println("fin");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
