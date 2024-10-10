package game.test;

import game.view.*;
import game.elements.*;
import game.elements.Character;
import java.util.concurrent.TimeUnit;;

public class Demo {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        Platform p = new Platform();
        Character c1 = new Character();
        Character c2 = new Character();
        Character c3 = new Character();
        p.addChar(c1);
        p.addChar(c2);
        p.addChar(c3);
        p.addListener(view);
        try {
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
        c3.change();
    }
}