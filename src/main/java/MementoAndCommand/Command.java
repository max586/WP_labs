package MementoAndCommand;

public abstract class Command {
    Editor editor;
    String params;

    Command(Editor editor, String params){
        this.editor=editor;
        this.params=params;
    }
    public abstract void execute();
}
