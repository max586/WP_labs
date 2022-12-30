package ChainOfResponsibility;

import java.util.Arrays;

public class LoginScreen extends MouseClickHandler{
    public LoginScreen(){
        allowedControls = Arrays.asList(Controls.LOG_IN_BUTTON, Controls.HYPERLINK, Controls.SUBMIT_BUTTON);
    }
    @Override
    public void handle(Controls clickedObj) {
        if(canHandle(clickedObj)){
            System.out.println(clickedObj.name()+" clicked");   
        } else {
            super.handle(clickedObj);
        }
    }
    
}
