package Builder;

import java.util.ArrayList;

public class StudentsButtonsBuilder extends ButtonsBuilder{
    @Override 
    public void addButtons(Form form) {
        form.buttons = new ArrayList<>();
        form.buttons.add(new Button("Student menu"));
        form.buttons.add(new Button("Student exit"));
    }
}
