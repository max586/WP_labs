package Observer;

import ChainOfResponsibility.Controls;

import java.util.Arrays;

public class LoginScreen extends Screen{

    public LoginScreen(){
        allowedControls = Arrays.asList(Controls.LOG_IN_BUTTON, Controls.HYPERLINK, Controls.SUBMIT_BUTTON);
    }
    @Override
    public void update(MouseState mouseState) {
        if(mouseState.isClicked()&&canHandle(mouseState.clickedObj())){
            System.out.println(mouseState.clickedObj().name()+" clicked");
        }
    }
}
