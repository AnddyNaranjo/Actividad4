package uni1a;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieDeTV(String titulo, int duracionMinutos, String genero, int temporadas) {
        super(titulo, duracionMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }

    @Override
    public String toCSV() {
        return "SERIE," + getTitulo() + "," + getDuracionMinutos() + "," + getGenero() + "," + temporadas;
    }

    @Override
    public String toString() {
        return "📺 Serie de TV [ID: " + getId() + ", Título: " + getTitulo() +
                ", Duración: " + getDuracionMinutos() + " min/episodio, Género: " + getGenero() +
                ", Temporadas: " + temporadas + "]";
    }
}
