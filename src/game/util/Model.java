package game.util;

public interface Model {
    public void addListener(Listener l);
    public void removeListener(Listener l);
    public void fire();
}
