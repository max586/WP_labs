package MementoAndCommand;

import java.util.ArrayList;
import java.util.List;

public class EditorCaretaker {
    Editor editor;
    List<Editor.EditorSnapshot> snapshots = new ArrayList<>();


    public EditorCaretaker(Editor editor){
        this.editor=editor;
    }
    public void undo(){
        var lastSnapshot = snapshots.remove(snapshots.size()-1);
        editor.restore(lastSnapshot);
    }
    public void saveState(){
        snapshots.add(editor.save());
    }
    public void showHistory(){
        for(var snapshot: snapshots){
            System.out.println("--------------");
            System.out.println(snapshot);
            System.out.println("--------------");
        }
    }
}
