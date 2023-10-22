package behavioralPatterns.Command.example.commands;

import behavioralPatterns.Command.example.editor.Editor;

public class PasteCommand extends Command{
    public PasteCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute() {
        if(super.getEditor().clipboard == null ||
           super.getEditor().clipboard.isEmpty())
            return false;

        backup();
        getEditor().textField.insert(getEditor().clipboard,getEditor().textField.getCaretPosition());
        return true;
    }
}
