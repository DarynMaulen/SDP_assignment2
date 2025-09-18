import AbstractFactoryPatterns.factories.GUIFactory;
import AbstractFactoryPatterns.products.abstract_products.Button;
import AbstractFactoryPatterns.products.abstract_products.Checkbox;
import AbstractFactoryPatterns.products.abstract_products.Dialog;
import FactoryPatterns.creators.Logistics;

public class AppController {
    private final GUIFactory guiFactory;
    private final Logistics logistics;

    public AppController(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    public void start() {
        Button sendBtn = guiFactory.createButton();
        Checkbox cb = guiFactory.createCheckbox();
        Dialog dialog = guiFactory.createDialog();

        sendBtn.setOnClick(new Runnable() {
            public void run() {
                logistics.planDelivery();
            }
        });

        System.out.println("====== UI ======");
        sendBtn.paint();
        cb.paint();
        dialog.paint();

        System.out.println("\nSimulation of click by button:");
        sendBtn.click();
        System.out.println("\n");
    }
}
