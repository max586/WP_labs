package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public class ResizeCommand extends Command {
    public ResizeCommand(Editor editor, String params) {
        super(editor, params);
    }
    @Override
    public void execute() {
        editor.resize(params);
    }
}
