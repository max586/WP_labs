package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public class MaximizeCommand extends Command {
    public MaximizeCommand(Editor editor) {
        super(editor, "");
    }

    @Override
    public void execute() {
        editor.maximize();
    }
}
