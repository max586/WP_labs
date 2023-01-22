package MementoAndCommand.GUI.screens;

import MementoAndCommand.BusinessLogic.Editor;
import MementoAndCommand.GUI.handlers.LoginScreenMouseHandler;

public class LoginScreen extends Screen {
    public LoginScreen(Editor editor){
        super(editor);
        clickHandler = new LoginScreenMouseHandler();
    }
}
