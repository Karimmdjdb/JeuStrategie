package game.view;

import game.elements.Platform;
import game.elements.Character;
import game.elements.Entity;

public class ConsoleView implements game.util.Listener {

    private Platform model;

    public ConsoleView(Platform model) {
        this.model = model;
        this.model.addListener(this);
    }

    @Override
    public void update(Object source) {
        print();
    }

    public void print() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        for(int x=0; x<Platform.getInstance().getSize(); x++) {
            System.out.println("+---".repeat(Platform.getInstance().getSize())+"+");
            for(int y=0; y<Platform.getInstance().getSize(); y++) {
                Character c = model.getCharactersGrid()[x][y];
                System.out.print(String.format("| %s ", (c != null ? c.getName() : " ")));
            }
            System.out.print("|\n");
        }
        System.out.println("+---".repeat(Platform.getInstance().getSize())+"+");

        for(int x=0; x<Platform.getInstance().getSize(); x++) {
            System.out.println("+---".repeat(Platform.getInstance().getSize())+"+");
            for(int y=0; y<Platform.getInstance().getSize(); y++) {
                Entity c = model.getEntitiesGrid()[x][y];
                System.out.print(String.format("| %s ", (c != null ? c.getName() : " ")));
            }
            System.out.print("|\n");
        }
        System.out.println("+---".repeat(Platform.getInstance().getSize())+"+");
    }
    
}
