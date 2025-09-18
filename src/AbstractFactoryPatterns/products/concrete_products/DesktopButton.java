package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Button;

//Desktop-specific implementation of Button
public class DesktopButton implements Button {
    private Runnable action;

    public void paint(){
        System.out.println("Desktop Button");
    }

    public void setOnClick(Runnable action) {
        this.action = action;
    }

    public void click() {
        if (action != null) action.run();
    }
}
