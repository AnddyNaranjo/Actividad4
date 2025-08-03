package uni1a;

public abstract class ContenidoAudiovisual {
    private static int contador = 0;
    private final int id;
    private String titulo;
    private int duracionMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionMinutos, String genero) {
        this.id = contador++;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public abstract String toCSV();
    public abstract String toString();
}
