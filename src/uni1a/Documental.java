package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracionMinutos, String genero, String tema) {
        super(titulo, duracionMinutos, genero);
        this.tema = tema;
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    @Override
    public String toCSV() {
        return "DOCUMENTAL," + getTitulo() + "," + getDuracionMinutos() + "," + getGenero() + "," + tema;
    }

    @Override
    public String toString() {
        return "🎥 Documental [ID: " + getId() + ", Título: " + getTitulo() +
                ", Duración: " + getDuracionMinutos() + " min, Género: " + getGenero() +
                ", Tema: " + tema + "]";
    }
}
