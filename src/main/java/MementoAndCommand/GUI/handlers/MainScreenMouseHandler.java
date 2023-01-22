package MementoAndCommand.GUI.handlers;

import MementoAndCommand.GUI.Controls;

import java.util.Arrays;

public class MainScreenMouseHandler extends MouseClickHandler {
    public MainScreenMouseHandler(){
        allowedControls = Arrays.asList(Controls.HYPERLINK, Controls.IMAGE, Controls.MENU_LABEL);
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
