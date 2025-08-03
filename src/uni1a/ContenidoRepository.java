package uni1a;

import java.io.*;
import java.util.*;

public class ContenidoRepository {
    private List<ContenidoAudiovisual> contenidos = new ArrayList<>();

    public void agregarContenido(ContenidoAudiovisual c) {
        contenidos.add(c);
    }

    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    public void guardarEnArchivo(String ruta) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (ContenidoAudiovisual c : contenidos) {
                writer.write(c.toCSV());
                writer.newLine();
            }
        }
    }

    public void cargarDesdeArchivo(String ruta) throws IOException {
        contenidos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                switch (datos[0]) {
                    case "PELICULA" -> contenidos.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    case "SERIE" -> contenidos.add(new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4])));
                    case "DOCUMENTAL" -> contenidos.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                }
            }
        }
    }
}
