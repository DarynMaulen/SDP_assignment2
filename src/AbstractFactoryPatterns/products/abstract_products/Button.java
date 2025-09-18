package AbstractFactoryPatterns.products.abstract_products;

public interface Button {
    public void paint();
    void setOnClick(Runnable action);
    void click();
}
