package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@NamedQuery(name = "readByisbn", query = "SELECT l FROM Libro l WHERE l.ISBN = :ISBN")

@Entity
public class Libro implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	@Column(name = "ISBN", unique = true, nullable = false)
	private String ISBN;
	private int numPaginas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos;

	public Libro() {
	}

	public Libro(int codigo, String nombre, String iSBN, int numPaginas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		ISBN = iSBN;
		this.numPaginas = numPaginas;
		capitulos = null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((capitulos == null) ? 0 : capitulos.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numPaginas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (capitulos == null) {
			if (other.capitulos != null)
				return false;
		} else if (!capitulos.equals(other.capitulos))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numPaginas != other.numPaginas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [Codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numPaginas=" + numPaginas + "]";
	}

}
