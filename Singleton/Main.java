package Singleton;

public class Main {
    public void main() {
        JuegoMultijugador menuConfig = JuegoMultijugador.getInstance();
        IO.println("Volumen inicial en menú: " + menuConfig.getVolume());

        JuegoMultijugador gameConfig = JuegoMultijugador.getInstance();
        gameConfig.setVolume(85);

        IO.println("Volumen desde el juego: " + gameConfig.getVolume());
        IO.println("¿Misma instancia?: " + (menuConfig == gameConfig));
    }
}