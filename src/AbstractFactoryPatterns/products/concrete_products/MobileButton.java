package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Button;

public class MobileButton implements Button {
    private Runnable action;

    public void paint(){
        System.out.println("Mobile Button");
    }

    public void setOnClick(Runnable action) {
        this.action = action;
    }

    public void click() {
        if (action != null) action.run();
    }
}
