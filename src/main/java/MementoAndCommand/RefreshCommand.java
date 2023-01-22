package MementoAndCommand;

public class RefreshCommand extends Command{
    RefreshCommand(Editor editor, String params) {
        super(editor, params);
    }
    @Override
    public void execute() {
        editor.refresh(params);
    }
}
