package Singleton;

public final class JuegoMultijugador {
    private static volatile JuegoMultijugador instance;
    private int volume;
    private boolean muted;

    private JuegoMultijugador() {
        this.volume = 70;
        this.muted = false;
    }

    public static JuegoMultijugador getInstance() {
        JuegoMultijugador result = instance;
        if (result == null) {
            synchronized (JuegoMultijugador.class) {
                result = instance;
                if (result == null) {
                    instance = result = new JuegoMultijugador();
                }
            }
        }
        return result;
    }

    public synchronized int getVolume() {
        return volume;
    }

    public synchronized void setVolume(int volume) {
        if (volume < 0) this.volume = 0;
        else if (volume > 100) this.volume = 100;
        else this.volume = volume;
    }

    public synchronized boolean isMuted() {
        return muted;
    }

    public synchronized void setMuted(boolean muted) {
        this.muted = muted;
    }
}