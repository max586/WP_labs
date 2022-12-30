package ChainOfResponsibility;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<MouseClickHandler> handlers = Arrays.asList(new LoginScreen(),new MainScreen(),new ExitScreen());
        handlers.get(0).setNext(handlers.get(1));
        handlers.get(1).setNext(handlers.get(2));
        new Object().notifyAll();

        handlers.get(0).handle(Controls.MENU_LABEL);
    }
}
