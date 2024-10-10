package game.view;

public class ConsoleView implements game.util.Listener {

    @Override
    public void update(Object source) {
        System.out.println("Platform has changed.");
    }
    
}
