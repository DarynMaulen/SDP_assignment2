package AbstractFactoryPatterns.factories.concrete_factories;

import AbstractFactoryPatterns.factories.GUIFactory;
import AbstractFactoryPatterns.products.abstract_products.Button;
import AbstractFactoryPatterns.products.abstract_products.Checkbox;
import AbstractFactoryPatterns.products.abstract_products.Dialog;
import AbstractFactoryPatterns.products.concrete_products.MobileButton;
import AbstractFactoryPatterns.products.concrete_products.MobileCheckbox;
import AbstractFactoryPatterns.products.concrete_products.MobileDialog;

public class MobileGUIFactory implements GUIFactory {
    public Button createButton(){
        return new MobileButton();
    }
    public Checkbox createCheckbox(){
        return new MobileCheckbox();
    }
    public Dialog createDialog(){
        return new MobileDialog();
    }
}
