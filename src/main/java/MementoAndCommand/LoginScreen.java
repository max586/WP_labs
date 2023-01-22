package MementoAndCommand;

public class LoginScreen extends Screen{
    public LoginScreen(Editor editor){
        super(editor);
        clickHandler = new LoginScreenMouseHandler();
    }
}
