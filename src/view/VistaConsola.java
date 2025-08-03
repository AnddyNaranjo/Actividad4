package view;

import controller.AudioVisualController;
import java.util.Scanner;

public class VistaConsola {
    private AudioVisualController controller;
    private Scanner sc = new Scanner(System.in);

    public VistaConsola(AudioVisualController controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ CONTENIDO AUDIOVISUAL ===");
            System.out.println("1. Agregar Película");
            System.out.println("2. Agregar Serie");
            System.out.println("3. Agregar Documental");
            System.out.println("4. Mostrar Contenidos");
            System.out.println("5. Guardar en archivo");
            System.out.println("6. Cargar desde archivo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregarPelicula();
                case 2 -> agregarSerie();
                case 3 -> agregarDocumental();
                case 4 -> controller.mostrarContenidos();
                case 5 -> {
                    System.out.print("Ruta archivo: ");
                    controller.guardar(sc.nextLine());
                }
                case 6 -> {
                    System.out.print("Ruta archivo: ");
                    controller.cargar(sc.nextLine());
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void agregarPelicula() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Duración: ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Estudio: ");
        String estudio = sc.nextLine();
        controller.agregarPelicula(titulo, duracion, genero, estudio);
    }

    private void agregarSerie() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Duración por episodio: ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Temporadas: ");
        int temporadas = sc.nextInt(); sc.nextLine();
        controller.agregarSerie(titulo, duracion, genero, temporadas);
    }

    private void agregarDocumental() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Duración: ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Tema: ");
        String tema = sc.nextLine();
        controller.agregarDocumental(titulo, duracion, genero, tema);
    }
}
