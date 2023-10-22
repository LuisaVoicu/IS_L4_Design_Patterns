package behavioralPatterns.Command.example.commands;

import behavioralPatterns.Command.example.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor){
        super(editor);
    }
    @Override
    public boolean execute() {
        super.getEditor().clipboard = getEditor().textField.getSelectedText();
        return false;
    }
}
