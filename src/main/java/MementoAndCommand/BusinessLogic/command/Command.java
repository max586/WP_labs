package MementoAndCommand.BusinessLogic.command;

import MementoAndCommand.BusinessLogic.Editor;

public abstract class Command {
    Editor editor;
    String params;

    Command(Editor editor, String params){
        this.editor=editor;
        this.params=params;
    }
    public abstract void execute();
}
