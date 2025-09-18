package AbstractFactoryPatterns.factories.concrete_factories;

import AbstractFactoryPatterns.factories.GUIFactory;
import AbstractFactoryPatterns.products.abstract_products.Button;
import AbstractFactoryPatterns.products.abstract_products.Checkbox;
import AbstractFactoryPatterns.products.abstract_products.Dialog;
import AbstractFactoryPatterns.products.concrete_products.DesktopButton;
import AbstractFactoryPatterns.products.concrete_products.DesktopCheckbox;
import AbstractFactoryPatterns.products.concrete_products.DesktopDialog;

public class DesktopGUIFactory implements GUIFactory {
    public Button createButton(){
        return new DesktopButton();
    }
    public Checkbox createCheckbox(){
        return new DesktopCheckbox();
    }
    public Dialog createDialog(){
        return new DesktopDialog();
    }
}
