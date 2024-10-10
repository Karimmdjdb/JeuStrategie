package game.elements;

public class Platform extends game.util.AbstractModel implements game.util.Listener {
    
    public Platform() {
        super();
    }

    @Override
    public void update(Object source) {
        fire();   
    }

    public void addChar(Character c) {
        c.addListener(this);
    }
}
