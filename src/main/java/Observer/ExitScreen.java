package Observer;

import ChainOfResponsibility.Controls;

import java.util.Arrays;

public class ExitScreen extends Screen{
    public ExitScreen(){
        allowedControls = Arrays.asList(Controls.EXIT_BUTTON,Controls.HYPERLINK);
    }
    @Override
    public void update(MouseState mouseState) {
        if(mouseState.isClicked()&&canHandle(mouseState.clickedObj())){
            switch (mouseState.clickedObj()) {
                case EXIT_BUTTON->System.exit(0);
                default -> System.out.println(mouseState.clickedObj().name()+" clicked");
            }
        }      
    }
}
