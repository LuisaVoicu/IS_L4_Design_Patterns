package CreationalPatterns.FactoryMethod.Example;

import CreationalPatterns.FactoryMethod.Example.factory.Dialog;
import CreationalPatterns.FactoryMethod.Example.factory.WebDialog;
import CreationalPatterns.FactoryMethod.Example.factory.WindowsDialog;

public class Application {
    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new WebDialog();
        }
    }
    static void runBusinessLogic(){
        dialog.render();
    }
}
