package MementoAndCommand;

public class MainScreen extends Screen{
    MainScreen(Editor editor) {
        super(editor);
        clickHandler=new MainScreenMouseHandler();
    }
}
