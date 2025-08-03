import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uni1a.*;

import java.io.IOException;

public class AudioVisualTest {

    @Test
    void testAgregarPelicula() {
        ContenidoRepository repo = new ContenidoRepository();
        repo.agregarContenido(new Pelicula("Matrix", 120, "Sci-Fi", "Warner"));
        assertEquals(1, repo.getContenidos().size());
    }

    @Test
    void testGuardarYCargar() throws IOException {
        ContenidoRepository repo = new ContenidoRepository();
        repo.agregarContenido(new Pelicula("Matrix", 120, "Sci-Fi", "Warner"));
        repo.guardarEnArchivo("test.csv");

        ContenidoRepository repo2 = new ContenidoRepository();
        repo2.cargarDesdeArchivo("test.csv");

        assertEquals("Matrix", repo2.getContenidos().get(0).getTitulo());
    }
}
