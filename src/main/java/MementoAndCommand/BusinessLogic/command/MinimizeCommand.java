package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public class MinimizeCommand extends Command {
    public MinimizeCommand(Editor editor) {
        super(editor, "");
    }

    @Override
    public void execute() {
        editor.minimize();
    }
}
