package AbstractFactoryPatterns.products.abstract_products;

//Abstract product for buttons in GUI families
public interface Button {
    public void paint();
    void setOnClick(Runnable action);
    void click();
}
