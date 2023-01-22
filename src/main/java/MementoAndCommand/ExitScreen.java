package MementoAndCommand;

public class ExitScreen extends Screen{
    public ExitScreen(Editor editor){
        super(editor);
        clickHandler=new ExitScreenMouseHandler();
    }
}
