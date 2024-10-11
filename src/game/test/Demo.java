package game.test;

import game.view.*;
import game.elements.*;
import game.elements.Character;
import java.util.concurrent.TimeUnit;;

public class Demo {
    public static void main(String[] args) {
        Platform p = Platform.getInstance();
        ConsoleView view = new ConsoleView(p);
        Character c1 = new Character("0", 1, 1);
        Character c2 = new Character("1", 5, 2);
        Character c3 = new Character("2", 3, 3);
        p.addCharacter(c1);
        p.addCharacter(c2);
        p.addCharacter(c3);
        Bomb b1 = new Bomb(4, 2);
        p.addEntity(b1);
        /*try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception e) {}
        c1.change();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception e) {}
        c2.change();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception e) {}
        c3.change();*/
        view.print();
        for(int i=0; i<15; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            }
            catch(Exception e) {}
            c2.move();
        }
    }
}