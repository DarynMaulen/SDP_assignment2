import AbstractFactoryPatterns.factories.concrete_factories.DesktopGUIFactory;
import AbstractFactoryPatterns.factories.GUIFactory;
import AbstractFactoryPatterns.factories.concrete_factories.MobileGUIFactory;
import FactoryPatterns.creators.Logistics;
import FactoryPatterns.creators.concrete_creators.AirLogistics;
import FactoryPatterns.creators.concrete_creators.RoadLogistics;

//Configures factories and starts the app
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new DesktopGUIFactory();
        Logistics logistics = new RoadLogistics();
        AppController app = new AppController(factory, logistics);
        app.start();

        GUIFactory factory1 = new MobileGUIFactory();
        Logistics logistics1 = new AirLogistics();
        AppController app1 = new AppController(factory1,logistics1);
        app1.start();
    }
}
