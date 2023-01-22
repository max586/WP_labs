package MementoAndCommand;

import lombok.Setter;

import java.awt.*;

public abstract class Screen {
    MouseClickHandler clickHandler;
    Editor editor;


    Screen(Editor editor){
        this.editor=editor;
    }
    public void handleClick(Controls control){
        clickHandler.handle(control);
    }
    public void refreshContent(String newContent){
        new RefreshCommand(editor,newContent).execute();
    }
    public void recolourPage(String newColour){
        new RecolourCommand(editor,newColour).execute();
    }
    public void minimizeScreen(){
        new MinimizeCommand(editor).execute();
    }
    public void maximizeScreen(){
        new MaximizeCommand(editor).execute();
    }
    public void resizeScreen(String newSize){
        new ResizeCommand(editor,newSize).execute();
    }
    public void display(){
        editor.display();
    }
}
