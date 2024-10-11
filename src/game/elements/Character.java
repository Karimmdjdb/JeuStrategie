package game.elements;

public class Character extends game.util.AbstractModel {
    public static int maxHp = 100, maxEp = 10;
    private int posX, posY, hp, ep;
    private String name;

    public Character(String name, int posX, int posY) {
        super();
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.hp = maxHp;
        this.ep = maxEp;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        Platform p = Platform.getInstance();
        if(posY+1 >= p.getSize()) return;
        p.getCharactersGrid()[posY][posX] = null;
        posY++;
        p.getCharactersGrid()[posY][posX] = this;
        fire();
    } 

    
}