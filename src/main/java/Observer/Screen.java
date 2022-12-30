package Observer;

import ChainOfResponsibility.Controls;

import java.util.ArrayList;
import java.util.List;

public abstract class Screen {
    protected List<Controls> allowedControls = new ArrayList<>();

    public abstract void update(MouseState mouseState);
    
    public boolean canHandle(Controls control){
        return allowedControls.contains(control);
    }
}
