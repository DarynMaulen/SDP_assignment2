package AbstractFactoryPatterns.factories;

import AbstractFactoryPatterns.products.abstract_products.Button;
import AbstractFactoryPatterns.products.abstract_products.Checkbox;
import AbstractFactoryPatterns.products.abstract_products.Dialog;

//Abstract factory interface to create related GUI components
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Dialog createDialog();
}
