package MementoAndCommand;

import java.util.Arrays;

public class ExitScreenMouseHandler extends MouseClickHandler {
    public ExitScreenMouseHandler(){
        allowedControls = Arrays.asList(Controls.EXIT_BUTTON, Controls.HYPERLINK);
    }

    @Override
    public void handle(Controls clickedObj) {
        if(canHandle(clickedObj)){
            switch (clickedObj) {
                case EXIT_BUTTON->System.exit(0);
                default -> System.out.println(clickedObj.name()+" clicked");
            }
        } else {
            super.handle(clickedObj);
        }
    }
}
