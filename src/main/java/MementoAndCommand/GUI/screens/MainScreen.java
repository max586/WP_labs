package MementoAndCommand.GUI.screens;

import MementoAndCommand.BusinessLogic.Editor;
import MementoAndCommand.GUI.handlers.MainScreenMouseHandler;

public class MainScreen extends Screen {
    public MainScreen(Editor editor) {
        super(editor);
        clickHandler=new MainScreenMouseHandler();
    }
}
