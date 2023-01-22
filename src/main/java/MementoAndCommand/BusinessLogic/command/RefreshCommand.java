package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public class RefreshCommand extends Command {
    public RefreshCommand(Editor editor, String params) {
        super(editor, params);
    }
    @Override
    public void execute() {
        editor.refresh(params);
    }
}
