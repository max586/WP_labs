package MementoAndCommand;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;

/**Do all business logic connected with editing the app*/
public class Editor {
    @Getter
    @ToString
    static class EditorSnapshot{
        EditorState state;


        public EditorSnapshot(EditorState state){
            this.state=state;
        }
    }
    Frame frame;
    EditorState state=new EditorState();
    EditorSnapshot snapshot;

    public EditorSnapshot save(){
        this.snapshot= new EditorSnapshot(this.state);
        return this.snapshot;
    }
    public void restore(EditorSnapshot snapshot){
        this.snapshot=snapshot;
    }

    public Editor(Frame frame){
        this.frame=frame;
    }
    public void refresh(String title){
        frame.setTitle(title);
        state.setScreenTitle(title);
    }
    public void recolour(String color){
        try {
            Color newColor = (Color)(Class.forName("java.awt.Color").getField(color.toLowerCase()).get(null));
            frame.setBackground(newColor);
            state.setScreenColor(newColor);
        } catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void resize(String newSize){
        int width = Integer.parseInt(newSize.split(" ")[0]);
        int height = Integer.parseInt(newSize.split(" ")[1]);
        frame.setSize(new Dimension(width,height));
        state.setScreenWidth(width);
        state.setScreenHeight(height);
    }
    public void minimize(){
        frame.setState(Frame.ICONIFIED);
    }
    public void maximize(){
        frame.setState(Frame.MAXIMIZED_BOTH);
    }
    public void display(){
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
