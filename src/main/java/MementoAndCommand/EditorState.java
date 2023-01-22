package MementoAndCommand;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import java.awt.*;

@Getter
@Setter
@ToString
public class EditorState {
    int screenWidth=0;
    int screenHeight=0;
    Color screenColor=Color.WHITE;
    String screenTitle="";
}
