package game.elements;

public class Bomb extends Entity {
    public Bomb(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public String getName() {
        return "b";
    }
    
}
