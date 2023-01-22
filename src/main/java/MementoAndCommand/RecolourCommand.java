package MementoAndCommand;

public class RecolourCommand extends Command{
    RecolourCommand(Editor editor, String params) {
        super(editor, params);
    }

    @Override
    public void execute() {
        editor.recolour(params);
    }
}
