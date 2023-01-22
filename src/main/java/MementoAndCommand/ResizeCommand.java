package MementoAndCommand;

public class ResizeCommand extends Command{
    ResizeCommand(Editor editor, String params) {
        super(editor, params);
    }
    @Override
    public void execute() {
        editor.resize(params);
    }
}
