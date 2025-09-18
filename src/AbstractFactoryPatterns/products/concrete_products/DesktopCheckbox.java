package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Checkbox;

public class DesktopCheckbox implements Checkbox {
    public void paint(){
        System.out.println("Desktop Checkbox");
    }
}
