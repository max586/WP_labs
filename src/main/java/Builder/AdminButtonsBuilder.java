package Builder;

import java.util.ArrayList;

public class AdminButtonsBuilder extends ButtonsBuilder{
    @Override
    public void addButtons(Form form) {
        form.buttons = new ArrayList<>();
        form.buttons.add(new Button("Admin menu"));
        form.buttons.add(new Button("Admin exit"));
    }
}
