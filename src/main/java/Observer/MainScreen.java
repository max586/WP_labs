package Observer;

import ChainOfResponsibility.Controls;

import java.util.Arrays;

public class MainScreen extends Screen{

    public MainScreen(){
        allowedControls = Arrays.asList(Controls.HYPERLINK,Controls.IMAGE,Controls.MENU_LABEL);
    }
    @Override
    public void update(MouseState mouseState) {
        if(mouseState.isClicked()&&canHandle(mouseState.clickedObj())){
            System.out.println(mouseState.clickedObj()+" clicked");
        }
    }
}
