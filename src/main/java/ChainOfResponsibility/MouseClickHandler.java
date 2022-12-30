package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class MouseClickHandler {
    protected MouseClickHandler next=null;
    protected List<Controls> allowedControls = new ArrayList<>();

    public void setNext(MouseClickHandler next) {
        this.next = next;
    }

    public void handle(Controls clickedObj){
        if(next!=null)next.handle(clickedObj);
    }
    
    protected boolean canHandle(Controls clickedObj){
        return allowedControls.contains(clickedObj);
    }
}
