public class ProductFactory implements AbstractFactory {
    @Override
    public Product createProduct(String productName) {
        if (productName == "A"){
            Product product = new ProductA();
            product.setPrice();
            return product;
        }
        else if (productName == "B"){
            Product product = new ProductB();
            product.setPrice();
            return product;
        }
        return null;

    }
}
