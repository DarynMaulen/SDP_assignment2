package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Checkbox;

//Desktop-specific implementation of Checkbox
public class DesktopCheckbox implements Checkbox {
    public void paint(){
        System.out.println("Desktop Checkbox");
    }
}
