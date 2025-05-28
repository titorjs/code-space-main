import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testPrestarLibro() {
        Libro libro = new Libro("1984", "Orwell", "111");
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }

    @Test
    void testPrestarLibroNoDisponible() {
        Libro libro = new Libro("1984", "Orwell", "111");
        libro.prestar();
        assertThrows(IllegalStateException.class, libro::prestar);
    }
}