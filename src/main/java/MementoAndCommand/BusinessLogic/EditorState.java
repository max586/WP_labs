package MementoAndCommand.BusinessLogic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class EditorState implements Cloneable{
    int screenWidth=0;
    int screenHeight=0;
    Color screenColor=Color.WHITE;
    String screenTitle="";
    LocalDateTime time=null;

    @Override
    public EditorState clone() {
        try {
            EditorState clone = (EditorState) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
