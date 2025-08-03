package controller;

import uni1a.*;
import java.io.IOException;

public class AudioVisualController {
    private ContenidoRepository repo = new ContenidoRepository();

    public void agregarPelicula(String titulo, int duracion, String genero, String estudio) {
        repo.agregarContenido(new Pelicula(titulo, duracion, genero, estudio));
    }

    public void agregarSerie(String titulo, int duracion, String genero, int temporadas) {
        repo.agregarContenido(new SerieDeTV(titulo, duracion, genero, temporadas));
    }

    public void agregarDocumental(String titulo, int duracion, String genero, String tema) {
        repo.agregarContenido(new Documental(titulo, duracion, genero, tema));
    }

    public void mostrarContenidos() {
        for (ContenidoAudiovisual c : repo.getContenidos()) {
            System.out.println(c);
        }
    }

    public void guardar(String archivo) {
        try {
            repo.guardarEnArchivo(archivo);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void cargar(String archivo) {
        try {
            repo.cargarDesdeArchivo(archivo);
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }
}
