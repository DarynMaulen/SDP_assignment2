package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Checkbox;

//Mobile-specific implementation of Checkbox
public class MobileCheckbox implements Checkbox {
    public void paint(){
        System.out.println("Mobile Checkbox");
    }
}
