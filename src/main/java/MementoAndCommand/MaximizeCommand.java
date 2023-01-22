package MementoAndCommand;

public class MaximizeCommand extends Command{
    MaximizeCommand(Editor editor) {
        super(editor, "");
    }

    @Override
    public void execute() {
        editor.maximize();
    }
}
