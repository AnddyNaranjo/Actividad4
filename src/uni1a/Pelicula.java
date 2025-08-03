package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracionMinutos, String genero, String estudio) {
        super(titulo, duracionMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }

    @Override
    public String toCSV() {
        return "PELICULA," + getTitulo() + "," + getDuracionMinutos() + "," + getGenero() + "," + estudio;
    }

    @Override
    public String toString() {
        return "🎬 Película [ID: " + getId() + ", Título: " + getTitulo() +
                ", Duración: " + getDuracionMinutos() + " min, Género: " + getGenero() +
                ", Estudio: " + estudio + "]";
    }
}
