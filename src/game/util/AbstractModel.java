package game.util;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel implements Model {

    private List<Listener> listeners = new ArrayList<>();

    @Override
    public void addListener(Listener l) {
        listeners.add(l);
    }
    
    @Override
    public void removeListener(Listener l) {
        listeners.remove(l);    
    }

    @Override
    public void fire() {
        for(Listener l : listeners) {
            l.update(this);
        }
    }
}
