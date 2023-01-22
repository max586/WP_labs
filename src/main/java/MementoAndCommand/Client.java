package MementoAndCommand;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /*List<MouseClickHandler> handlers = Arrays.asList(new LoginScreenMouseHandler(),new MainScreenMouseHandler(),new ExitScreenMouseHandler());
        handlers.get(0).setNext(handlers.get(1));
        handlers.get(1).setNext(handlers.get(2));
        new Object().notifyAll();

        handlers.get(0).handle(Controls.MENU_LABEL);*/

        Editor ed = new Editor(new Frame());
        EditorCaretaker editorCaretaker = new EditorCaretaker(ed);
        Screen s = new MainScreen(ed);
        s.refreshContent("Title");
        s.recolourPage("Black");
        s.resizeScreen("300 300");
        editorCaretaker.saveState();

        s.refreshContent("Title 2");
        s.recolourPage("Yellow");
        s.resizeScreen("300 400");
        editorCaretaker.saveState();

        editorCaretaker.showHistory();

        editorCaretaker.undo();

        editorCaretaker.showHistory();
        //s.display();
    }
}
