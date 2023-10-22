package behavioralPatterns.Command.example.commands;

import behavioralPatterns.Command.example.editor.Editor;

public abstract class Command {
    private Editor editor;
    private String backup;

    public Command(Editor editor){
        this.editor = editor;
    }

    public abstract boolean execute();

    public void backup(){
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public Editor getEditor() {
        return editor;
    }

    public String getBackup() {
        return backup;
    }
}
