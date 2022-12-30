package Observer;

import ChainOfResponsibility.Controls;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Screen> screens = Arrays.asList(new LoginScreen(),new MainScreen(),new ExitScreen());
        Mouse m = new Mouse();
        for(Screen sc: screens)m.addScreen(sc);
        m.setState(true, Controls.HYPERLINK);
        m.notifyScreens();
    }
}
