package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Dialog;

public class DesktopDialog implements Dialog {
    public void paint(){
        System.out.println("Desktop Dialog");
    }
}
