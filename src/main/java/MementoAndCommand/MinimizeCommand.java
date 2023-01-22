package MementoAndCommand;

public class MinimizeCommand extends Command{
    MinimizeCommand(Editor editor) {
        super(editor, "");
    }

    @Override
    public void execute() {
        editor.minimize();
    }
}
