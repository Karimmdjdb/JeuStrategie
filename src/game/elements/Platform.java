package game.elements;

import game.util.Config;

public class Platform extends game.util.AbstractModel implements game.util.Listener {
    private int size = Integer.parseInt(Config.get("size"));
    private static Platform singleton = null;
    private Character[][] characters = new Character[size][size];
    private Entity[][] entities = new Entity[size][size];

    private Platform() {
        super();
        for(int x=0; x < size; x++) {
            for(int y=0; y < size; y++) {
                characters[y][x] = null;
                entities[y][x] = null;
            }
        }
    }

    public static Platform getInstance() {
        if(singleton == null) singleton = new Platform();
        return singleton; 
    }

    @Override
    public void update(Object source) {
        fire();   
    }

    public void addCharacter(Character c) {
        characters[c.getPosY()][c.getPosX()] = c;
        c.addListener(this);
    }

    public void addEntity(Entity e) {
        entities[e.getPosY()][e.getPosX()] = e;
    }

    public Character[][] getCharactersGrid() {
        return characters;
    }

    public Entity[][] getEntitiesGrid() {
        return entities;
    }

    public int getSize() {
        return size;
    }
}
