package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public class RecolourCommand extends Command {
    public RecolourCommand(Editor editor, String params) {
        super(editor, params);
    }

    @Override
    public void execute() {
        editor.recolour(params);
    }
}
