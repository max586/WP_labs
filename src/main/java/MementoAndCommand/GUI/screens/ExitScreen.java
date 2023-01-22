package MementoAndCommand.GUI.screens;

import MementoAndCommand.BusinessLogic.Editor;
import MementoAndCommand.GUI.handlers.ExitScreenMouseHandler;

public class ExitScreen extends Screen {
    public ExitScreen(Editor editor){
        super(editor);
        clickHandler=new ExitScreenMouseHandler();
    }
}
