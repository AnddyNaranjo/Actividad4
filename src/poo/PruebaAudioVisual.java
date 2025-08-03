package poo;

import controller.AudioVisualController;
import view.VistaConsola;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        AudioVisualController controller = new AudioVisualController();
        VistaConsola vista = new VistaConsola(controller);
        vista.mostrarMenu();
    }
}
