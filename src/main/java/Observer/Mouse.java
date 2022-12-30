package Observer;

import ChainOfResponsibility.Controls;

import java.util.ArrayList;
import java.util.List;

public class Mouse {
    MouseState state;
    List<Screen> screens = new ArrayList<>();

    public void setState(boolean isClicked, Controls clickedObj) {
        this.state = new MouseState(isClicked, clickedObj);
    }

    public void notifyScreens(){
        for(Screen screen: screens){
            screen.update(state);    
        }
    }
    
    public void addScreen(Screen sc){
        this.screens.add(sc);
    }
    
    public void removeScreen(Screen sc){
        this.screens.remove(sc);
    }
}
