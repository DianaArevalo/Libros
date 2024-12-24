package da.tienda.de.Libros.repositorio;

import da.tienda.de.Libros.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {
}
