package ChainOfResponsibility;

import java.util.Arrays;

public class MainScreen extends MouseClickHandler{
    public MainScreen(){
        allowedControls = Arrays.asList(Controls.HYPERLINK,Controls.IMAGE,Controls.MENU_LABEL);
    }

    @Override
    public void handle(Controls clickedObj) {
        if(canHandle(clickedObj)) {
            System.out.println(clickedObj+" clicked");
        } else {
            super.handle(clickedObj);
        }
    }
}
